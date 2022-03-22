/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pkg1.View.*;

import pkg1.Terminoa.*;

/**
 *
 * @author arceredillo.adrian
 */
public class Controller implements ActionListener {

    private Model model;
    private View view;
    
    //private String separador = "/////////////////////////////////////////////////////////////";
    //private String nuevoSeparador = "-------------------------------------------------------------";
    
    
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        gehituActionListener(this);
    }
    
    private void gehituActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra
        view.JButtonLeerFichero.addActionListener(listener);   //JFrame principal
        view.JButtonImprimirDatos.addActionListener(listener);  //JFrame principal

        //view.JButtonSalir.addActionListener(listener);
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "IRAKURRI":
                System.out.println("a");
                View.JTextAreaVerDatos.setText(model.terminoakImprimatu());
                break;
            case "IMPRIMIR":
                //String strTextArea = View.JTextAreaVerDatos.getText();
                //String strTextArea = View.JTextAreaVerDatos.getText().replace(Terminoa.separadorTerminos(), "g");
                //Terminoa.setSeparador("a");
                String strTextArea = View.JTextAreaVerDatos.getText().replace(Terminoa.sepGuionesInicial(), Terminoa.getSeparador());
                model.textAreaToFile(strTextArea);
                System.out.println("Los datos se han guardado en " + "'HiztegiaCsvFinal.txt'" + ". ");
                view.dispose();
                break;

        }
    }
    
    
    
    
    
    
}