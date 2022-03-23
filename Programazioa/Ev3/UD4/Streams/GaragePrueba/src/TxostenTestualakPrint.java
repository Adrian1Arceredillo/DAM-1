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
        System.out.println("Enter the id/code of the desired reservation: 2");
        System.out.println("");
        System.out.println("    ->Desired reseravtion ID: 2");
        System.out.println("    -> Wait a second...");
        System.out.println("");
        System.out.println("RESERVATION'S INVOICE: ");
        System.out.println("========================================================================================================================================");
        System.out.printf("%-10s %20s %25s %20s %30s %15s %10s\n", "Booking ID", "Booking Date", "Customer's Name", "Service", "Products", "Cabin", "Price");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.printf("%-10d %20s %25s %20s %30s %15s %10.2f\n", 2, "23/03/2022", "customer 1", "Oil Change", "Wrench, Screwdriver", "C01", 150.25);
        System.out.println("");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Service granted by Team 1 - DIY Garage");
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

/*
System.out.println("CUSTOMER HISTORY: ");
        System.out.println("==============================================================================================================");
        System.out.printf("%-10s %20s %25s %10s %20s %20s \n", "Cust. id", "Customer's Name", "Customer's Surname", "Age", "Mail", "Phone Number");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        //System.out.printf("%10d %20s %20s %10s %10s %10s %10s %s\n", 2, "Booking Date", "Client's Name", "Phone Number", "Service", "Cabin", "Precio", "Ordaindua");
        System.out.printf("%-10s %20s %25s %10d %20s %20d\n", "id: " + 1, "name 1", "surname 1", 19, "surname1@garage.diy", 123456789);
        System.out.printf("%-10s %20s %25s %10d %20s %20d\n", "id: " + 2, "name 2", "surname 2", 13, "surname2@garage.diy", 987654321);
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tNumber of clients: 2");
*/