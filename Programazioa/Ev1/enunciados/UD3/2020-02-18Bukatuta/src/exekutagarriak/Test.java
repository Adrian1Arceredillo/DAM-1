/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Author;
import model.Book;
import model.Komikia;


public class Test {

    public static void main(String[] args) {
        Book b1 = new Book("hola", new Author("pepe", 'm'), 101, 401);
        System.out.println(b1.getNolakoa());

        Author a1 = new Author("pepe", 'm');

        Komikia k1 = new Komikia(true, "jose", a1, 13, 15);
        System.out.println(b1);
        System.out.println(k1.toString());

        System.out.println(k1.getNolakoa());
    }

}
