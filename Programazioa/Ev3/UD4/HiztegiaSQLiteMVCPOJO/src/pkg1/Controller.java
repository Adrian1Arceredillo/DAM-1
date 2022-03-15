/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        view.JButtonTxertatu.addActionListener(listener);
        view.JButtonImprimatu.addActionListener(listener);
        
        //view.JButtonSalir.addActionListener(listener);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "TERMINOA GEHITU":
                
                System.out.println("Has pulsado el botón 'TXERTATU'");
                view.JDialogTerminoaGehitu.setVisible(true);
                view.JDialogTerminoaGehitu.repaint();
                break;
                
                /*
                System.out.println("TXERTATU botoia sakatu duzu. ");
                Terminoa t1 = new Terminoa(view.JTextFieldEusUser.getText(), view.JTextFieldGazUser.getText());
                
                model.terminoaGehitu(t1);
                //model.terminoaGehitu(view.JTextFieldEusUser.getText(), view.JTextFieldGazUser.getText());
                model.terminoakImprimatu();
                */
            case "GEHITU":
                System.out.println("'GEHITU' botoia sakatu duzu. ");
                Terminoa t1 = new Terminoa(view.JTextFieldEusUser.getText(), view.JTextFieldGazUser.getText());
                
                model.terminoaGehitu(t1);
                //model.terminoaGehitu(view.JTextFieldEusUser.getText(), view.JTextFieldGazUser.getText());
                model.terminoakImprimatu();
            case "IRTEN":
                
        }
    }
    
    
    
}
