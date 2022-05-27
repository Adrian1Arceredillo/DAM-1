/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class View extends javax.swing.JFrame {

    public View() {
        initComponents();

        ChoiceRecordToDelete.setEnabled(false);
        ChoiceRecordToDelete.setVisible(false);

        JButtonDeleteRecord.setVisible(false);

        JButtonCancelDelete.setVisible(false);
        JButtonCancelDelete.setEnabled(false);
        
        JButtonTranslate.setVisible(false);
        JButtonTranslate.setEnabled(false);
        
        JButtonInprimatu.setVisible(false);
        JButtonInprimatu.setEnabled(false);
        
        JButtonWordsOnTable.setVisible(false);
        JButtonWordsOnTable.setEnabled(false);
        
        JRadioButtonViewOnTable.setVisible(false);
        JRadioButtonViewOnTable.setEnabled(false);
        
        ChoiceRecordToDelete.addItem("...");
        for (int i = 0; i < Model.getAllWords().size(); ++i) {
            /*Terminoa ter1 = new Terminoa(Model.getAllWords().get(i).getId(),
                                    Model.getAllWords().get(i).getEuskaraz(),
                                    Model.getAllWords().get(i).getGazteleraz()
            );*/

            ChoiceRecordToDelete.addItem(Model.getAllWords().get(i).getEuskaraz());
            //ChoiceRecordToDelete.addItem(Model.getAllWords().get(i).getId() + ", " + Model.getAllWords().get(i).getEuskaraz() + ", " + Model.getAllWords().get(i).getGazteleraz());
        }

        JTableViewAllWords.setVisible(false);
        
        ChoiceGameFiveWords.setEnabled(false);
        
        JTextFieldUserEnterTranslation.setVisible(false); JTextFieldUserEnterTranslation.setEditable(false); JTextFieldUserEnterTranslation.setEnabled(false);
        
        JButtonCheckUserTranslation.setVisible(false);
        
        JButtonRestartGame.setVisible(false);
                
        
        
        //JTextFieldGaztelerazTranslate.setEditable(false); 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDialogFilterFirstLetter = new javax.swing.JDialog();
        JScrollPane2 = new javax.swing.JScrollPane();
        JTableFilterWords = new javax.swing.JTable();
        ButtonGroupFilter = new javax.swing.ButtonGroup();
        JPanelHiztegia = new javax.swing.JPanel();
        JLabelMainTitle1 = new javax.swing.JLabel();
        JLabelEusInsertNew = new javax.swing.JLabel();
        JLabelGazInsertNew = new javax.swing.JLabel();
        JTextFieldEuskarazUserNew = new javax.swing.JTextField();
        JTextFieldGaztelerazUserNew = new javax.swing.JTextField();
        JButtonTxertatu = new javax.swing.JButton();
        JButtonExit = new javax.swing.JButton();
        JButtonInprimatu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextAreaHiztegia = new javax.swing.JTextArea();
        JButtonFindSearchRecord = new javax.swing.JButton();
        ChoiceRecordToDelete = new java.awt.Choice();
        JButtonDeleteRecord = new javax.swing.JButton();
        JRadioButtonViewOnTable = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTableViewAllWords = new javax.swing.JTable();
        JButtonCancelDelete = new javax.swing.JButton();
        JButtonTranslate = new javax.swing.JButton();
        JSeparator2 = new javax.swing.JSeparator();
        JLabelMainTitle2 = new javax.swing.JLabel();
        ChoiceGameFiveWords = new java.awt.Choice();
        JLabelChooseFiveRandom = new javax.swing.JLabel();
        JButtonChooseWordsGame = new javax.swing.JButton();
        JLabelUserTranslation = new javax.swing.JLabel();
        JTextFieldUserEnterTranslation = new javax.swing.JTextField();
        JButtonCheckUserTranslation = new javax.swing.JButton();
        JButtonGameAnswersOnTable = new javax.swing.JButton();
        JButtonWordsOnTable = new javax.swing.JButton();
        JButtonRestartGame = new javax.swing.JButton();

        JTableFilterWords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JScrollPane2.setViewportView(JTableFilterWords);

        javax.swing.GroupLayout JDialogFilterFirstLetterLayout = new javax.swing.GroupLayout(JDialogFilterFirstLetter.getContentPane());
        JDialogFilterFirstLetter.getContentPane().setLayout(JDialogFilterFirstLetterLayout);
        JDialogFilterFirstLetterLayout.setHorizontalGroup(
            JDialogFilterFirstLetterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDialogFilterFirstLetterLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(JScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        JDialogFilterFirstLetterLayout.setVerticalGroup(
            JDialogFilterFirstLetterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialogFilterFirstLetterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        setResizable(false);

        JPanelHiztegia.setPreferredSize(new java.awt.Dimension(587, 378));

        JLabelMainTitle1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        JLabelMainTitle1.setText("HITZ BERRIA");

        JLabelEusInsertNew.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLabelEusInsertNew.setText("Basque:");

        JLabelGazInsertNew.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLabelGazInsertNew.setText("Spanish:");

        JTextFieldEuskarazUserNew.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTextFieldEuskarazUserNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldEuskarazUserNewActionPerformed(evt);
            }
        });

        JTextFieldGaztelerazUserNew.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JTextFieldGaztelerazUserNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldGaztelerazUserNewActionPerformed(evt);
            }
        });

        JButtonTxertatu.setText("INSERT");
        JButtonTxertatu.setActionCommand("TXERTATU");

        JButtonExit.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        JButtonExit.setText("EXIT");
        JButtonExit.setActionCommand("Exit");
        JButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonExitActionPerformed(evt);
            }
        });

        JButtonInprimatu.setText("Print");
        JButtonInprimatu.setActionCommand("INPRIMATU");
        JButtonInprimatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonInprimatuActionPerformed(evt);
            }
        });

        jLabel4.setText("frame bakground [204,204,255]");

        JTextAreaHiztegia.setEditable(false);
        JTextAreaHiztegia.setColumns(20);
        JTextAreaHiztegia.setLineWrap(true);
        JTextAreaHiztegia.setRows(5);
        jScrollPane1.setViewportView(JTextAreaHiztegia);

        JButtonFindSearchRecord.setText("Search 🔍");
        JButtonFindSearchRecord.setActionCommand("SEARCH");

        JButtonDeleteRecord.setText("Remove");
        JButtonDeleteRecord.setActionCommand("DELETE");

        ButtonGroupFilter.add(JRadioButtonViewOnTable);
        JRadioButtonViewOnTable.setText("Words on table");
        JRadioButtonViewOnTable.setActionCommand("VIEW TABLE");

        jScrollPane3.setViewportView(JTableViewAllWords);

        JButtonCancelDelete.setText("Cancel");
        JButtonCancelDelete.setActionCommand("CANCEL DELETE");

        JButtonTranslate.setText("Translate");
        JButtonTranslate.setActionCommand("TRANSLATE");

        JLabelMainTitle2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        JLabelMainTitle2.setText("GUESS THE TRANSLATION");

        JLabelChooseFiveRandom.setText("Select/generate words:");

        JButtonChooseWordsGame.setText("Generate");
        JButtonChooseWordsGame.setActionCommand("GENERATE");

        JLabelUserTranslation.setText("Enter translation:");

        JButtonCheckUserTranslation.setText("Check!");
        JButtonCheckUserTranslation.setActionCommand("CHECK TRANSLATION USER");

        JButtonGameAnswersOnTable.setText("Your answers");
        JButtonGameAnswersOnTable.setActionCommand("YOUR ANSWERS");

        JButtonWordsOnTable.setText("Table");
        JButtonWordsOnTable.setActionCommand("WORDS ON TABLE");

        JButtonRestartGame.setText("RESTART");
        JButtonRestartGame.setActionCommand("RESET");

        javax.swing.GroupLayout JPanelHiztegiaLayout = new javax.swing.GroupLayout(JPanelHiztegia);
        JPanelHiztegia.setLayout(JPanelHiztegiaLayout);
        JPanelHiztegiaLayout.setHorizontalGroup(
            JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelHiztegiaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JSeparator2)
                    .addGroup(JPanelHiztegiaLayout.createSequentialGroup()
                        .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JPanelHiztegiaLayout.createSequentialGroup()
                                .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPanelHiztegiaLayout.createSequentialGroup()
                                        .addComponent(JLabelEusInsertNew)
                                        .addGap(29, 29, 29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHiztegiaLayout.createSequentialGroup()
                                        .addComponent(JLabelGazInsertNew)
                                        .addGap(26, 26, 26)))
                                .addGap(19, 19, 19)
                                .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JTextFieldGaztelerazUserNew, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextFieldEuskarazUserNew, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(JButtonTxertatu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JButtonFindSearchRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanelHiztegiaLayout.createSequentialGroup()
                                .addComponent(JLabelMainTitle1)
                                .addGap(141, 141, 141)
                                .addComponent(jLabel4))
                            .addGroup(JPanelHiztegiaLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPanelHiztegiaLayout.createSequentialGroup()
                                        .addComponent(ChoiceRecordToDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(JButtonInprimatu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                            .addComponent(JButtonDeleteRecord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                            .addComponent(JButtonTranslate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                            .addComponent(JButtonCancelDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                            .addComponent(JButtonWordsOnTable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(JPanelHiztegiaLayout.createSequentialGroup()
                                        .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JRadioButtonViewOnTable)
                                            .addComponent(JButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jSeparator1))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                    .addGroup(JPanelHiztegiaLayout.createSequentialGroup()
                        .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JLabelMainTitle2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHiztegiaLayout.createSequentialGroup()
                                .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLabelChooseFiveRandom)
                                    .addComponent(JLabelUserTranslation))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ChoiceGameFiveWords, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(JTextFieldUserEnterTranslation))))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JButtonChooseWordsGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JButtonCheckUserTranslation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(JButtonGameAnswersOnTable)
                        .addGap(18, 18, 18)
                        .addComponent(JButtonRestartGame, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPanelHiztegiaLayout.setVerticalGroup(
            JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelHiztegiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelMainTitle1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPanelHiztegiaLayout.createSequentialGroup()
                        .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLabelEusInsertNew)
                            .addComponent(JTextFieldEuskarazUserNew, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JButtonTxertatu)
                                .addComponent(JButtonFindSearchRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JTextFieldGaztelerazUserNew, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLabelGazInsertNew)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JPanelHiztegiaLayout.createSequentialGroup()
                                .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ChoiceRecordToDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JButtonDeleteRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JButtonTranslate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JRadioButtonViewOnTable))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JButtonInprimatu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JButtonWordsOnTable)
                                .addGap(13, 13, 13)
                                .addComponent(JButtonCancelDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JButtonExit))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(JSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelMainTitle2)
                .addGap(24, 24, 24)
                .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(JLabelChooseFiveRandom)
                        .addComponent(ChoiceGameFiveWords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JButtonChooseWordsGame)
                        .addComponent(JButtonGameAnswersOnTable)
                        .addComponent(JButtonRestartGame)))
                .addGap(18, 18, 18)
                .addGroup(JPanelHiztegiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelUserTranslation)
                    .addComponent(JTextFieldUserEnterTranslation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonCheckUserTranslation))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelHiztegia, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelHiztegia, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTextFieldGaztelerazUserNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldGaztelerazUserNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldGaztelerazUserNewActionPerformed

    private void JTextFieldEuskarazUserNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldEuskarazUserNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldEuskarazUserNewActionPerformed

    private void JButtonInprimatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonInprimatuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonInprimatuActionPerformed

    private void JButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JButtonExitActionPerformed

    public static View viewaSortuBistaratu() {
        View v = new View();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                v.setVisible(true);
                v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            }
        });
        return v;
    }
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HitzBerriakSartu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HitzBerriakSartu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HitzBerriakSartu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HitzBerriakSartu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HitzBerriakSartu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ButtonGroupFilter;
    public static java.awt.Choice ChoiceGameFiveWords;
    public static java.awt.Choice ChoiceRecordToDelete;
    public static javax.swing.JButton JButtonCancelDelete;
    public static javax.swing.JButton JButtonCheckUserTranslation;
    public static javax.swing.JButton JButtonChooseWordsGame;
    public static javax.swing.JButton JButtonDeleteRecord;
    javax.swing.JButton JButtonExit;
    public static javax.swing.JButton JButtonFindSearchRecord;
    public static javax.swing.JButton JButtonGameAnswersOnTable;
    public static javax.swing.JButton JButtonInprimatu;
    public static javax.swing.JButton JButtonRestartGame;
    public static javax.swing.JButton JButtonTranslate;
    public static javax.swing.JButton JButtonTxertatu;
    public static javax.swing.JButton JButtonWordsOnTable;
    public static javax.swing.JDialog JDialogFilterFirstLetter;
    public static javax.swing.JLabel JLabelChooseFiveRandom;
    public static javax.swing.JLabel JLabelEusInsertNew;
    public static javax.swing.JLabel JLabelGazInsertNew;
    public static javax.swing.JLabel JLabelMainTitle1;
    public static javax.swing.JLabel JLabelMainTitle2;
    public static javax.swing.JLabel JLabelUserTranslation;
    public static javax.swing.JPanel JPanelHiztegia;
    public static javax.swing.JRadioButton JRadioButtonViewOnTable;
    public static javax.swing.JScrollPane JScrollPane2;
    public static javax.swing.JSeparator JSeparator2;
    public static javax.swing.JTable JTableFilterWords;
    public static javax.swing.JTable JTableViewAllWords;
    public static javax.swing.JTextArea JTextAreaHiztegia;
    public static javax.swing.JTextField JTextFieldEuskarazUserNew;
    public static javax.swing.JTextField JTextFieldGaztelerazUserNew;
    public static javax.swing.JTextField JTextFieldUserEnterTranslation;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
