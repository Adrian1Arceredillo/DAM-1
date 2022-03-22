/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static pkg1.View.*;
import static pkg2.View.*;
//import model.Model;


/**
 *
 * @author arceredillo.adrian
 */
public class Controller implements ActionListener {
    
    private Model model;
    private View view;
    
    
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        gehituActionListener(this);       
    }   
    
    
    private void gehituActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra
        view.JButtonTxertatu.addActionListener(listener);   //JFrame principal
        view.JButtonImprimatu.addActionListener(listener);  //JFrame principal
        view.JButtonSalir.addActionListener(listener);      //JFrame principal
        view.JButtonTraducir.addActionListener(listener);   //JFrame principal
        
        view.JButtonVerClientes.addActionListener(listener);
        
        view.JButtonUserGehitu.addActionListener(listener); //JDialog 1
        view.JButtonItzuli.addActionListener(listener);     //JDialog 1
        view.JButtonRegistrosTable.addActionListener(listener); //JDialog 2 - jtable
        //view.JButtonSalir.addActionListener(listener);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "New Client":
                System.out.println("Has pulsado el botón 'New Client'");
                view.JDialogTerminoaGehitu.setVisible(true);
                view.JDialogTerminoaGehitu.setTitle("Create a New Customer!");
                view.JDialogTerminoaGehitu.setSize(400, 400);
                view.JDialogTerminoaGehitu.setResizable(false);
                
                //view.JDialogTerminoaGehitu.repaint();
                break;
            
            case "HIZTEGIA IMPRIMATU":
                //JTextAreaHiztegiaIkusi.setEnabled(true);
                
                JTextAreaHiztegiaIkusi.setText("a");
                //JTextAreaHiztegiaIkusi.setEnabled(false);
                
                JTextAreaHiztegiaIkusi.setEnabled(true);
                JTextAreaHiztegiaIkusi.setEditable(false);
                JTextAreaHiztegiaIkusi.setSelectedTextColor(Color.RED);
                model.terminoakImprimatu();
                
                JTextAreaHiztegiaIkusi.setText(model.verRegistrosTodos());
                
                //System.out.println(model.verRegistrosTodos());
                break;
            
            case "HIZTEGIA JTABLEAN":
                //JDialog2Table.setEnabled(true);
                view.JDialog2Table.setSize(600, 600);
                view.JDialog2Table.setResizable(true);
                view.JDialog2Table.setVisible(true);
                view.JDialogTerminoaGehitu.setTitle("HITZA GEHITU");
                
                break;
                
            case "GEHITU":
                /*
                System.out.println("'GEHITU' botoia sakatu duzu. ");
                Terminoa t1 = new Terminoa(view.JTextFieldHitzaEus.getText(), view.JTextFieldHitzaGaz.getText());
                //Terminoa t1 = new Terminoa(Integer.valueOf(view.JTextFieldId.getText()), view.JTextFieldHitzaEus.getText(), view.JTextFieldHitzaGaz.getText());
                view.JTextFieldHitzaEus.setText("");
                view.JTextFieldHitzaGaz.setText("");
                view.JTextFieldId.setText("");
                model.terminoaGehitu2(t1);
                */
                break;
            
            case "ATZERA":
                view.JDialogTerminoaGehitu.dispose();
                break;
            
            case "IRTEN":
                //JTextAreaHiztegiaIkusi.setEnabled(true);
                view.dispose();
                break;
            
            case "Hitz hau bakarrik":
                //JTextFieldEusUser.setEnabled(true);
                //JTextFieldGazUser.setEnabled(true);
                break;
            
            case "CLIENTES":
                System.out.println("a");
                model.terminoakImprimatu();
                break;
                
            case "GEHITU CLIENT":
                System.out.println("'ADD' botoia sakatu duzu. ");
                Terminoa nuevoCliente = new Terminoa(view.JTextFieldNombre.getText(), 
                        view.JTextFieldApellido.getText(),
                        Integer.valueOf(view.JTextFieldEdad.getText()),
                        Integer.valueOf(view.JTextFieldTelefono.getText()));
                view.JTextFieldNombre.setText("");
                view.JTextFieldApellido.setText("");
                view.JTextFieldEdad.setText("");
                view.JTextFieldTelefono.setText("");
                model.terminoaGehitu2(nuevoCliente);
                break;
            
            case "ITZULI":
                String apellidoUser = view.JTextFieldApellidoUser.getText();
                int edadUser = Integer.valueOf(view.JTextFieldEdadUser.getText());
                System.out.println(model.traducirPalabra(apellidoUser, edadUser));
                //JTextFieldGazUser
                /*
                String enEuskera = JTextFieldEusUser.getText();
                System.out.println(model.traducirPalabra(enEuskera));
                JTextFieldEusUser.setText("");
                                
                view.JTextFieldGazUser.setText(model.traducirPalabra(enEuskera));
                //view.JTextFieldGazUser.setText(palabraTraducida);
                */
                break;
        }
    }
    
    
    
}
