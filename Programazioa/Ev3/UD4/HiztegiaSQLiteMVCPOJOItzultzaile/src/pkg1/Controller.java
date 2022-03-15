/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static pkg1.View.*;
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
        view.JButtonUserGehitu.addActionListener(listener); //JDialog
        view.JButtonItzuli.addActionListener(listener);     //JDialog
        //view.JButtonSalir.addActionListener(listener);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "TXERTATU":
                case "TERMINOA GEHITU":
                System.out.println("Has pulsado el botón 'TXERTATU'");
                view.JDialogTerminoaGehitu.setVisible(true);
                view.JDialogTerminoaGehitu.setTitle("HITZA GEHITU");
                view.JDialogTerminoaGehitu.setSize(370, 300);
                
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
            
            case "GEHITU":
                System.out.println("'GEHITU' botoia sakatu duzu. ");
                Terminoa t1 = new Terminoa(view.JTextFieldHitzaEus.getText(), view.JTextFieldHitzaGaz.getText());
                //Terminoa t1 = new Terminoa(Integer.valueOf(view.JTextFieldId.getText()), view.JTextFieldHitzaEus.getText(), view.JTextFieldHitzaGaz.getText());
                view.JTextFieldHitzaEus.setText("");
                view.JTextFieldHitzaGaz.setText("");
                view.JTextFieldId.setText("");
                model.terminoaGehitu2(t1);
                break;
            
            case "ITZULI":
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
            
            case "TRADUCIR":
                //JTextFieldGazUser
                String enEuskera = JTextFieldEusUser.getText();
                System.out.println(model.traducirPalabra(enEuskera));
                
                view.JTextFieldGazUser.setText(model.traducirPalabra(enEuskera));
                //view.JTextFieldGazUser.setText(palabraTraducida);
                break;
        }
    }
    
    
    
}
