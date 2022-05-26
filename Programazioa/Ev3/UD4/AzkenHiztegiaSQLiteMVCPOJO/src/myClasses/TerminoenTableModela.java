/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClasses;

import myClasses.Terminoa;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author arceredillo.adrian
 */
public class TerminoenTableModela extends AbstractTableModel {

    private final String[] zutabeIzenak = {"Word ID", "BASQUE", "SPANISH"};
    private ArrayList<Terminoa> data = new ArrayList<>();

    public TerminoenTableModela(ArrayList<Terminoa> datosEnArrayList) {
        this.data = datosEnArrayList;
    }
    
    public TerminoenTableModela(Terminoa desiredTerminoa) {
        this.data.add(desiredTerminoa);
    }
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return zutabeIzenak.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return data.get(rowIndex).getId();
        } else if (columnIndex == 1) {
            return data.get(rowIndex).getEuskaraz();
        } else if (columnIndex == 2) {
            return data.get(rowIndex).getGazteleraz();
        }
        
        return null;
    }
    
    /**
     * Mediante este método cambiaremos los nombres de las columnas de 
     * la tabla, poniendo los valores que a nosotros nos interesen. 
     * 
     * @param col
     * @return 
     */
    @Override
    public String getColumnName(int col) {
        return zutabeIzenak[col];
    }
    
    
    
    
    /**
     * Método para ver de qué tipo es el elemento que nosotros le digamos; 
     * ya que por defecto, para el programa, todos los elementos son de la 
     * clase object. 
     * 
     * P.E.: si preguntamos de qué tipo es una columna, nos devolverá su 
     * tipo -> Integer, String... o lo que sea. 
     * 
     * @param c número columna
     * @return Boolean, Integer, String edo...
     */
    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    
    }
    
    
    @Override
    public boolean isCellEditable(int row, int col) {
        if (col == 2) {
            return true;
        }
        return false;
    }
    
    
    
    //para hacerlo editable y que se puedan guardar los cambios, hay usar también setValue()
    //convertir en editable las celdas correspondientes a los precios

}

//https://www.mclibre.org/consultar/python/ejercicios/ej-listas-1.html#ejercicio-1
//https://www.mclibre.org/consultar/python/ejercicios/ej-listas-1-soluciones.html
