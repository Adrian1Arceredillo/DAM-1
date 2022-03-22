/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author AdriAlex
 */
public class TxostenTestualakPrint {
    public static void main(String[] args) {
        
        System.out.println("");
        System.out.println("CUSTOMER HISTORY: ");
        System.out.println("==============================================================================================================");
        System.out.printf("%-10s %20s %25s %10s %20s %20s \n", "Cust. id", "Customer's Name", "Customer's Surname", "Age", "Mail", "Phone Number");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        //System.out.printf("%10d %20s %20s %10s %10s %10s %10s %s\n", 2, "Booking Date", "Client's Name", "Phone Number", "Service", "Cabin", "Precio", "Ordaindua");
        System.out.printf("%-10s %20s %25s %10d %20s %20d\n", "id: " + 1, "name 1", "surname 1", 19, "surname1@garage.diy", 123456789);
        System.out.printf("%-10s %20s %25s %10d %20s %20d\n", "id: " + 2, "name 2", "surname 2", 13, "surname2@garage.diy", 987654321);
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tNumber of clients: 2");
        System.out.println("");
        System.out.println("");
    }
}

/*
	================================
Cust. id        Customer's Name        Customer's Surname        Age                      Mail         Phone Number 
--------------------------------------------------------------------------------------------------------------
1                          Home                    Prueba         19      homePrueba@gmail.com            123456789
2                         Pedro                     Lopez         34      pedroLopez@gmail.com            321654987
3                           Ane                  Aizgorri         12          aneAiz@gmail.com            978645312
*/