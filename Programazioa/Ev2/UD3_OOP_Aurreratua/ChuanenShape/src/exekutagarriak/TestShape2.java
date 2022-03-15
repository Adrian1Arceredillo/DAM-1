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
public class TestShape2 {
   public static void main(String[] args) {
      // Constructing a Shape instance poses problem!
      Shape s3 = new Shape("green");
      System.out.println(s3);
      //Shape[color=green]
      System.out.println("Area is " + s3.getArea());  // Invalid output
      //Shape unknown! Cannot compute area!
      //Area is 0.0
   }
}
