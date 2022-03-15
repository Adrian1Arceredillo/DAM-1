/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.*;

/**
 *
 * @author AdriAlex
 */
public class TestShape1 {
   public static void main(String[] args) {
      Shape s1 = new Rectangle("red", 4, 5);  // Upcast
      System.out.println(s1);  // Run Rectangle's toString()
      //Rectangle[length=4,width=5,Shape[color=red]]
      System.out.println("Area is " + s1.getArea());  // Run Rectangle's getArea()
      //Area is 20.0

      Shape s2 = new Triangle("blue", 4, 5);  // Upcast
      System.out.println(s2);  // Run Triangle's toString()
      //Triangle[base=4,height=5,Shape[color=blue]]
      System.out.println("Area is " + s2.getArea());  // Run Triangle's getArea()
      //Area is 10.0
   }
}
