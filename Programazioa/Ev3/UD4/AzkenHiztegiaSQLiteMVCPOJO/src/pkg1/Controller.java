/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pkg1.Model;
import pkg1.View;

public class Controller implements ActionListener {

    private Model model;
    private View view;

    //private final int numAllowedFailures = 5;
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_RED = "\u001B[3m";

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        gehituActionListener(this);
    }

    private void gehituActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra
        view.JButtonTxertatu.addActionListener(listener);   //button to insert a new record on the database
        view.JButtonInprimatu.addActionListener(listener);  //button to print the requested results
        view.JButtonExit.addActionListener(listener);       //button to exit the interface/application

        View.JButtonFindSearchRecord.addActionListener(listener);   //button to ask the user for a specific record
        View.JButtonDeleteRecord.addActionListener(listener);       //button to delete the selected record
        View.JButtonWordsOnTable.addActionListener(listener);       //button to see all the words on a table

        View.JRadioButtonViewOnTable.addActionListener(listener);   //radio button to check all the records on a table

        View.JButtonCancelDelete.addActionListener(listener);       //button to cancel the deletion of a record

        View.JButtonTranslate.addActionListener(listener);  //button to translate the word the user enters

        View.JButtonChooseWordsGame.addActionListener(listener);  //button to choose 5 words randomly from the table Terminoak of the database

        View.JButtonCheckUserTranslation.addActionListener(listener);   //button to check if the user entered the correct translation of the word selected

        View.JButtonGameAnswersOnTable.addActionListener(listener);     //button to see/check the user's answers ON A TABLE

        View.JButtonRestartGame.addActionListener(listener);            //button to restart the game

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "TXERTATU":

                View.JTextFieldEuskarazUserNew.setEnabled(true);
                View.JTextFieldEuskarazUserNew.setEditable(true);

                View.JTextFieldGaztelerazUserNew.setEnabled(true);
                View.JTextFieldGaztelerazUserNew.setEditable(true);

                if (View.JTextFieldEuskarazUserNew.getText().equals("") || View.JTextFieldGaztelerazUserNew.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "The value of the Basque or Spanish box is not valid! \n\n", "Error", JOptionPane.WARNING_MESSAGE);
                } else {
                    Terminoa terminoaBeforeInsert = new Terminoa(0, View.JTextFieldEuskarazUserNew.getText().toLowerCase(), View.JTextFieldGaztelerazUserNew.getText().toLowerCase());
                    if (Model.checkNewRecordExists(terminoaBeforeInsert.getEuskaraz(), terminoaBeforeInsert.getGazteleraz())) {
                        JOptionPane.showMessageDialog(null, "The desired record could not be inserted because one with the \n"
                                + "same characteristics already exists. Please, try again! ", "Warning! ", JOptionPane.WARNING_MESSAGE);

                        View.JTextAreaHiztegia.setText("This record already exists. Try again... ");
                        View.JTextFieldEuskarazUserNew.setText("");
                        View.JTextFieldGaztelerazUserNew.setText("");

                    } else {
                        View.JTextAreaHiztegia.setText("No existe");
                        System.out.println("no existe");

                        View.JTextFieldEuskarazUserNew.setText("");
                        View.JTextFieldGaztelerazUserNew.setText("");

                        model.terminoaGehitu2(terminoaBeforeInsert);

                        View.JTextAreaHiztegia.setText("The desired record has been added successfully! ");
                    }
                }

                /*
                if (View.JTextFieldEuskarazUserNew.getText().equals("") || View.JTextFieldGaztelerazUserNew.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "The value of the Basque or Spanish box is not valid! \n\n", "Error", JOptionPane.WARNING_MESSAGE);
                } else {
                    System.out.println("You pressed the 'Insert' button. ");
                    Terminoa t = new Terminoa(0, View.JTextFieldEuskarazUserNew.getText(), View.JTextFieldGaztelerazUserNew.getText());
                    model.terminoaGehitu2(t);

                    View.JTextFieldEuskarazUserNew.setText("");
                    View.JTextFieldGaztelerazUserNew.setText("");

                    View.JTextAreaHiztegia.setText("The desired record has been added successfully! ");

                    View.JTextFieldEuskarazUserNew.setEnabled(false);
                    View.JTextFieldEuskarazUserNew.setEditable(false);

                    View.JTextFieldGaztelerazUserNew.setEnabled(false);
                    View.JTextFieldGaztelerazUserNew.setEditable(false);
                }
                 */
                break;

            case "VALIDATE":

                break;

            case "INPRIMATU":
                //System.out.println("You pressed the 'Print' button. ");
                //model.terminoakInprimatu();

                View.JTextAreaHiztegia.setText("");

                for (int i = 0; i < Model.getAllWords().size(); ++i) {
                    View.JTextAreaHiztegia.setText(View.JTextAreaHiztegia.getText() + Model.getAllWords().get(i).toString());
                }

                break;

            case "SEARCH":

                view.ChoiceRecordToDelete.removeAll();

                view.ChoiceRecordToDelete.addItem("...");

                for (int j = 0; j < Model.getAllWords().size(); ++j) {
                    view.ChoiceRecordToDelete.addItem(Model.getAllWords().get(j).getEuskaraz());
                }

                //System.out.println("You pressed the 'Search' button. ");
                if (View.ChoiceRecordToDelete.isVisible() == false) {
                    View.ChoiceRecordToDelete.setEnabled(true);
                    View.ChoiceRecordToDelete.setVisible(true);

                    View.JButtonDeleteRecord.setVisible(true);

                    View.JButtonCancelDelete.setVisible(true);
                    View.JButtonCancelDelete.setEnabled(true);

                    View.JButtonTranslate.setVisible(true);
                    View.JButtonTranslate.setEnabled(true);

                    View.JButtonInprimatu.setVisible(true);
                    View.JButtonInprimatu.setEnabled(true);

                    View.JButtonWordsOnTable.setVisible(true);
                    View.JButtonWordsOnTable.setEnabled(true);

                    View.JTextAreaHiztegia.setText("You must select a record to be able to delete it. ");

                } else if (View.ChoiceRecordToDelete.isVisible() == true) {
                    View.ChoiceRecordToDelete.setEnabled(false);
                    View.ChoiceRecordToDelete.setVisible(false);

                    View.JButtonDeleteRecord.setVisible(false);

                    View.JButtonCancelDelete.setVisible(false);
                    View.JButtonCancelDelete.setEnabled(false);

                    View.JButtonTranslate.setVisible(false);
                    View.JButtonTranslate.setEnabled(false);

                    View.JButtonInprimatu.setVisible(false);
                    View.JButtonInprimatu.setEnabled(false);

                    View.JButtonWordsOnTable.setVisible(false);
                    View.JButtonWordsOnTable.setEnabled(false);

                }

                break;

            case "DELETE":
                //System.out.println("You pressed the 'Remove' button. ");

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

                    JOptionPane.showMessageDialog(null, "The selected record has been deleted successfully! \n\n", "Success!", JOptionPane.WARNING_MESSAGE);
                    View.JTextAreaHiztegia.setText("");
                    for (int i = 0; i < Model.getAllWords().size(); ++i) {
                        View.JTextAreaHiztegia.setText(View.JTextAreaHiztegia.getText() + Model.getAllWords().get(i).toString());
                    }

                    view.ChoiceRecordToDelete.removeAll();

                    view.ChoiceRecordToDelete.addItem("...");

                    for (int j = 0; j < Model.getAllWords().size(); ++j) {
                        view.ChoiceRecordToDelete.addItem(Model.getAllWords().get(j).getEuskaraz());
                    }

                    View.ChoiceRecordToDelete.select(0);
                    //View.ChoiceRecordToDelete.setEnabled(false);

                    /*
                    View.JButtonDeleteRecord.setVisible(false);

                    View.JButtonCancelDelete.setVisible(false);
                    View.JButtonCancelDelete.setEnabled(false);

                    View.JButtonTranslate.setVisible(false);
                    View.JButtonTranslate.setEnabled(false);

                    View.JButtonInprimatu.setVisible(false);
                    View.JButtonInprimatu.setEnabled(false);

                    View.JButtonWordsOnTable.setVisible(false);
                    View.JButtonWordsOnTable.setEnabled(false);
                     */
                }

                break;

            case "TRANSLATE":
                /*
                JOptionPane.showMessageDialog(null, "For now, this translator only works from Basque to Spanish. Please, specify the \n"
                        + "word in Basque you want to translate in the corresponding text box. \n\n", "Tip to Translate!", JOptionPane.WARNING_MESSAGE);
                 */

                if (View.ChoiceRecordToDelete.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "No word selected. Please, choose the word in Basque you \nwant to translate.", "Warning!", JOptionPane.WARNING_MESSAGE);
                    View.JTextAreaHiztegia.setText("Please, choose the word in Basque you want to translate.");
                } else {
                    View.JTextAreaHiztegia.setText("The word in Basque '" + View.ChoiceRecordToDelete.getSelectedItem()
                            + "' means '" + Model.translateWord(View.ChoiceRecordToDelete.getSelectedItem()) + "' in Spanish. ");
                    //View.JButtonTranslate.setEnabled(true);
                }

                //View.JTextFieldGaztelerazTranslate.setText(Model.translateWord(View.ChoiceRecordToDelete.getSelectedItem()));

                /*
                if (View.JTextFieldEuskarazTranslate.getText().equals("")) {
                    View.JTextAreaHiztegia.setText("No word entered! Please, enter a word in Basque to continue ");
                } else {
                    //View.JTextFieldGaztelerazTranslate.setEnabled(false);
                    View.JTextFieldGaztelerazTranslate.setEditable(true);
                    View.JTextFieldGaztelerazTranslate.setEnabled(false);
                    View.JTextFieldGaztelerazTranslate.setText(Model.translateWord(View.JTextFieldEuskarazTranslate.getText()));
                }
                 */
                break;

            case "CANCEL DELETE":
                View.ChoiceRecordToDelete.select(0);
                View.ChoiceRecordToDelete.setEnabled(false);
                View.ChoiceRecordToDelete.setVisible(false);

                View.JButtonDeleteRecord.setVisible(false);

                View.JButtonCancelDelete.setVisible(false);
                View.JButtonCancelDelete.setEnabled(false);

                View.JButtonTranslate.setVisible(false);
                View.JButtonTranslate.setEnabled(false);

                View.JButtonInprimatu.setVisible(false);
                View.JButtonInprimatu.setEnabled(false);

                View.JButtonWordsOnTable.setVisible(false);
                View.JButtonWordsOnTable.setEnabled(false);

                View.JTextAreaHiztegia.setText("The action of deleting a record has been cancelled! Continue");
                View.JTextAreaHiztegia.setText("Press again the 'Search' button and continue in the application! ");

                break;

            case "VIEW TABLE":
                /*
                View.JDialogFilterFirstLetter.setSize(600, 600);
                View.JDialogFilterFirstLetter.setVisible(true);
                view.JTableFilterWords.setVisible(true);
                View.JTableFilterWords.setModel(new TerminoenTableModela(Model.registrosArrayList()));
                 */

                View.JTableViewAllWords.setVisible(true);
                View.JTableViewAllWords.setModel(new TerminoenTableModela(Model.registrosArrayList()));

                break;

            case "WORDS ON TABLE":
                View.JTableViewAllWords.setVisible(true);
                View.JTableViewAllWords.setModel(new TerminoenTableModela(Model.registrosArrayList()));

                break;

            case "GENERATE":
                view.ChoiceGameFiveWords.removeAll();

                View.ChoiceGameFiveWords.addItem("...");
                for (int i = 0; i < Model.getAllWords().size(); ++i) {
                    View.ChoiceGameFiveWords.addItem(Model.getAllWords().get(i).getEuskaraz());
                }

                if (View.ChoiceGameFiveWords.getItemCount() >= 1) {

                    View.ChoiceGameFiveWords.setEnabled(true);

                    System.out.println("ready to play");
                    View.JTextFieldUserEnterTranslation.setVisible(true);
                    View.JTextFieldUserEnterTranslation.setEditable(true);
                    View.JTextFieldUserEnterTranslation.setEnabled(true);

                    View.JButtonCheckUserTranslation.setVisible(true);
                } else {
                    System.out.println("press the 'Generate' button");
                }

                View.JButtonChooseWordsGame.setEnabled(false);
                View.JButtonRestartGame.setEnabled(true);
                View.JButtonRestartGame.setVisible(true);
                View.JButtonCheckUserTranslation.setEnabled(true);

                /*
                for (int i = 0; i < fiveRandom.size(); ++i) {
                    View.ChoiceGameFiveWords.addItem(fiveRandom.get(i).getEuskaraz());
                }
                 */
                break;

            case "CHECK TRANSLATION USER":
                //ArrayList<GameUserAttempts> eachAttemptUser = new ArrayList<>();

                if (View.ChoiceGameFiveWords.getSelectedIndex() == 0 || View.JTextFieldUserEnterTranslation.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Something went wrong. Please, check that the following conditions are met: \n"
                            + " - A word in Basque is selected\n"
                            + " - You entered a word as an answer attempt.\n", "Invalid data", JOptionPane.WARNING_MESSAGE);

                    /*
                    JOptionPane.showMessageDialog(null, "No basque word has been selected or the user \n"
                            + "has not entered an answer. Try again! ", "Invalid data", JOptionPane.WARNING_MESSAGE);
                     */
                    View.ChoiceGameFiveWords.select(0);
                    View.JTextFieldUserEnterTranslation.setText("");
                }

                if (Model.checkUserTranslation(View.ChoiceGameFiveWords.getSelectedItem(), View.JTextFieldUserEnterTranslation.getText().toLowerCase())) {
                    System.out.println("correct! ");

                    GameUserAttempts eachTry = new GameUserAttempts(
                            View.ChoiceGameFiveWords.getSelectedItem().toLowerCase(), //word (Basque) selected by the user on the "menu"
                            Model.translateWord(View.ChoiceGameFiveWords.getSelectedItem()).toLowerCase(), //corresponding translation (Spanish) of the selected Basque word
                            View.JTextFieldUserEnterTranslation.getText().toLowerCase(), //word (Spanish) entered by the user
                            "Correct");

                    View.ChoiceGameFiveWords.remove(View.ChoiceGameFiveWords.getSelectedItem());

                    GameUserAttempts.eachAttemptUser.add(eachTry);

                    View.JSeparator2.setBackground(Color.green);
                    //View.JTextAreaHiztegia.setBackground(Color.green);
                    View.JTextAreaHiztegia.setText("Correct");

                    View.JTextFieldUserEnterTranslation.setText("");

                } else {
                    System.out.println("wrong");
                    GameUserAttempts eachTry = new GameUserAttempts(
                            View.ChoiceGameFiveWords.getSelectedItem().toLowerCase(), //word (Basque) selected by the user on the "menu"
                            Model.translateWord(View.ChoiceGameFiveWords.getSelectedItem()).toLowerCase(), //corresponding translation (Spanish) of the selected Basque word
                            View.JTextFieldUserEnterTranslation.getText().toLowerCase(), //word (Spanish) entered by the user
                            "Wrong!");

                    GameUserAttempts.eachAttemptUser.add(eachTry);

                    View.JSeparator2.setBackground(Color.red);
                    //View.JTextAreaHiztegia.setBackground(Color.red);
                    View.JTextAreaHiztegia.setText("Wrong");

                    View.JTextFieldUserEnterTranslation.setText("");
                }

                if (View.ChoiceGameFiveWords.getItemCount() == 1 && View.ChoiceGameFiveWords.getSelectedItem().equals("...")) {

                    JOptionPane.showMessageDialog(null, "Congratulations, you won! Click 'Restart' to play again. \n", "Success!", JOptionPane.WARNING_MESSAGE);

                    View.JDialogFilterFirstLetter.setSize(600, 600);
                    View.JDialogFilterFirstLetter.setVisible(true);
                    view.JTableFilterWords.setVisible(true);
                    View.JTableFilterWords.setModel(new UserAttemptsTableModela(GameUserAttempts.eachAttemptUser));

                    System.out.println("has ganado");
                }

                //System.out.println(eachAttemptUser.toString());
                break;

            case "YOUR ANSWERS":
                /*
                View.JDialogFilterFirstLetter.setSize(600, 600);
                View.JDialogFilterFirstLetter.setVisible(true);
                view.JTableFilterWords.setVisible(true);
                
                View.JTableFilterWords.setModel(new UserAttemptsTableModela(Model.saveAllAnswersUser()));
                 */

                if (GameUserAttempts.eachAttemptUser.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No response has been recorded yet! To access this information, \n"
                            + "there must be some at least one hit attempt.", "Error", JOptionPane.WARNING_MESSAGE);
                } else {
                    View.JDialogFilterFirstLetter.setSize(600, 600);
                    View.JDialogFilterFirstLetter.setVisible(true);
                    view.JTableFilterWords.setVisible(true);
                    View.JTableFilterWords.setModel(new UserAttemptsTableModela(GameUserAttempts.eachAttemptUser));
                }

                System.out.println(GameUserAttempts.eachAttemptUser);

                break;

            case "RESET":
                view.ChoiceGameFiveWords.removeAll();

                View.ChoiceGameFiveWords.addItem("...");
                for (int i = 0; i < Model.getAllWords().size(); ++i) {
                    View.ChoiceGameFiveWords.addItem(Model.getAllWords().get(i).getEuskaraz());
                }
                
                View.JButtonRestartGame.setEnabled(true);
                View.JButtonRestartGame.setVisible(true);
                
                //JScrollPane2
                
                if (View.JScrollPane2.isVisible()) {
                    View.JDialogFilterFirstLetter.dispose();
                    GameUserAttempts.eachAttemptUser.clear();
                }
                
                break;

        }

    }
}

/*
JDialogGraphicReports.setSize(1000, 450);    //600,450
                        JDialogGraphicReports.setVisible(true);
 */
