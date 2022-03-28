/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

import pkg2.*;
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
    private ViewPrueba pruebaView;
    
    /*
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        gehituActionListener(this);       
    }
    */
    
    public Controller(Model model, ViewPrueba pruebaView) {
        this.model = model;
        //this.view = view;
        this.pruebaView = pruebaView;
        gehituActionListener(this);       
    }
    
    
    private void gehituActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra
        ViewPrueba.JButtonProbarDBConection.addActionListener(listener);    //botón para comprobar la conexión a la db
        //--------------------------//
        ViewPrueba.JButtonGoTxostenak.addActionListener(listener);  //inicio -> botón para ver txostenak textuales
        ViewPrueba.JButtonGoGraphicall.addActionListener(listener); //inicio -> botón para ver los informes gráficos 
        
        ViewPrueba.JButtonPrintTxosten.addActionListener(listener); //textual reports -> botón para ver/imprimir los datos
        ViewPrueba.JButtonReturnStart.addActionListener(listener);  //textual reports -> botón para volver al menú inicial
        ViewPrueba.JButtonSaveInFile.addActionListener(listener);   //textual reports -> botón para guardar el contenido del text area en un fichero
        
        ViewPrueba.JButtonViewGra.addActionListener(listener);  //graphical reports -> ver contenido (en gráficos) de los informes
        ViewPrueba.JButtonClean.addActionListener(listener);  //graphical reports -> limpiar contenido del textArea
        ViewPrueba.JButtonGoBack.addActionListener(listener);   //graphical report -> volcer al menú inicial
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "Probar DB":
                model.terminoakImprimatu();
                break;
            case "Textual Reports":
                System.out.println("Wait... The Textual Report's section is loading. \n");
                ViewPrueba.JFrameTextReports.setVisible(true);
                ViewPrueba.JFrameTextReports.setTitle("Create a New Customer!");
                ViewPrueba.JFrameTextReports.setSize(600, 400);
                ViewPrueba.JFrameTextReports.setResizable(false);
                
                break;
            case "Graphicall Reports":
                System.out.println("Wait... The Graphical Report's section is loading. \n");
                ViewPrueba.JFrameGraphicalReports.setVisible(true);
                ViewPrueba.JFrameGraphicalReports.setTitle("Create a New Customer!");
                ViewPrueba.JFrameGraphicalReports.setSize(600, 356);
                ViewPrueba.JFrameGraphicalReports.setResizable(false);
                break;
            
            case "View Txostena":   //txosten textualak ikusi
                System.out.println("Ver informes. \n");
                break;
            case "Save":
                System.out.println("Guardando contenido en un fichero...\n");
                break;
            case "Go back": //menu nagusira bueltatu
                ViewPrueba.JFrameTextReports.dispose();
                break;
            
            case "View Graphics":   //txosten grafikoak -> ver datos en forma de gráficos
                System.out.println("Ver los datos en forma de gráficos. ");
                break;
            case "Clean":   //txosten grafikoak -> vaciar el contenido del text area
                ViewPrueba.JTextAreaGraphics.setText("Please, choose the report you want to represent");
                break;
            case "Go back to start":
                ViewPrueba.JFrameGraphicalReports.dispose();
                break;
            
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

