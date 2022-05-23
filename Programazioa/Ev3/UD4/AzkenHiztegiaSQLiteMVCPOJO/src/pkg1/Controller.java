/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1;

import java.awt.CheckboxGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import pkg1.Model;
import pkg1.View;

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
        view.jButtonTxertatu.addActionListener(listener);   //button to insert a new record on the database
        view.jButtonInprimatu.addActionListener(listener);  //button to print the requested results
        view.JButtonExit.addActionListener(listener);       //button to exit the interface/application

        view.JButtonFindSearchRecord.addActionListener(listener);   //button to ask the user for a specific record
        view.JButtonDeleteRecord.addActionListener(listener);       //button to delete the selected record

        View.JRadioButtonViewOnTable.addActionListener(listener);   //radio button to check all the records on a table
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "TXERTATU":
                System.out.println("You pressed the 'Insert' button. ");
                Terminoa t = new Terminoa(0, view.JTextFieldEuskarazUserNew.getText(), view.JTextFieldGaztelerazUserNew.getText());
                model.terminoaGehitu2(t);

                view.JTextFieldEuskarazUserNew.setText("");
                view.JTextFieldGaztelerazUserNew.setText("");

                View.JTextAreaHiztegia.setText("The desired record has been added successfully! ");

                break;

            case "INPRIMATU":
                System.out.println("You pressed the 'Print' button. ");
                //model.terminoakInprimatu();

                View.JTextAreaHiztegia.setText("");

                for (int i = 0; i < Model.getAllWords().size(); ++i) {
                    View.JTextAreaHiztegia.setText(View.JTextAreaHiztegia.getText() + Model.getAllWords().get(i).toString());
                }

                break;

            case "SEARCH":
                System.out.println("You pressed the 'Search' button. ");

                if (View.ChoiceRecordToDelete.isVisible() == false) {
                    View.ChoiceRecordToDelete.setEnabled(true);
                    View.ChoiceRecordToDelete.setVisible(true);

                    View.JButtonDeleteRecord.setVisible(true);

                    View.JTextAreaHiztegia.setText("You must select a record to be able to delete it. ");
                } else if (View.ChoiceRecordToDelete.isVisible() == true) {
                    View.ChoiceRecordToDelete.setEnabled(false);
                    View.ChoiceRecordToDelete.setVisible(false);

                    View.JButtonDeleteRecord.setVisible(false);
                }
                
                break;

            case "DELETE":
                System.out.println("You pressed the 'Remove' button. ");

                //View.ChoiceRecordToDelete.select(0);
                //View.ChoiceRecordToDelete.setEnabled(false);
                View.JTextAreaHiztegia.setText("");
                for (int i = 0; i < Model.getAllWords().size(); ++i) {
                    View.JTextAreaHiztegia.setText(View.JTextAreaHiztegia.getText() + Model.getAllWords().get(i).toString());
                }

                if (View.ChoiceRecordToDelete.getSelectedItem().equals("...")) {
                    View.JTextAreaHiztegia.setText("No record selected. Try again...");
                } else {
                    model.terminoaEzabatu(View.ChoiceRecordToDelete.getSelectedItem());

                    JOptionPane.showMessageDialog(null, "The selected record has been deleted successfully! \n\n", "Error", JOptionPane.WARNING_MESSAGE);
                    View.JTextAreaHiztegia.setText("");
                    for (int i = 0; i < Model.getAllWords().size(); ++i) {
                        View.JTextAreaHiztegia.setText(View.JTextAreaHiztegia.getText() + Model.getAllWords().get(i).toString());
                    }

                    View.ChoiceRecordToDelete.select(0);
                    View.ChoiceRecordToDelete.setEnabled(false);
                    //View.ChoiceRecordToDelete.setVisible(false);

                    View.JButtonDeleteRecord.setVisible(false);
                }

                break;

            case "VIEW TABLE":
                View.JDialogFilterFirstLetter.setSize(600, 600);
                View.JDialogFilterFirstLetter.setVisible(true);
                view.JTableFilterWords.setVisible(true);
                View.JTableFilterWords.setModel(new TerminoenTableModela(Model.registrosArrayList()));
                
                
                View.JTableViewAllWords.setVisible(true);
                View.JTableViewAllWords.setModel(new TerminoenTableModela(Model.registrosArrayList()));
                
                break;

        }

    }
}

/*
JDialogGraphicReports.setSize(1000, 450);    //600,450
                        JDialogGraphicReports.setVisible(true);
 */
