/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author arceredillo.adrian
 */
public class UserAttemptsTableModela extends AbstractTableModel {

    private final String[] zutabeIzenak = {"EUSKARAZ", "GAZTELERAZ", "ANSWER", "RATING"};
    private ArrayList<GameUserAttempts> answersUserGame = new ArrayList<>();

    public UserAttemptsTableModela(ArrayList<GameUserAttempts> datosEnArrayList) {
        this.answersUserGame = datosEnArrayList;
    }

    @Override
    public int getRowCount() {
        return answersUserGame.size();
    }

    @Override
    public int getColumnCount() {
        return zutabeIzenak.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return answersUserGame.get(rowIndex).getOriginalEuskaraz();
        } else if (columnIndex == 1) {
            return answersUserGame.get(rowIndex).getOriginalGazteleraz();
        } else if (columnIndex == 2) {
            return answersUserGame.get(rowIndex).getUserGazteleraz();
        } else if (columnIndex == 3) {
            return answersUserGame.get(rowIndex).getAnswer();
        }
        
        return null;
    }

}
