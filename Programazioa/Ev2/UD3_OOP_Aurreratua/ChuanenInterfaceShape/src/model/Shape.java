/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author AdriAlex
 */

/**
 * The interface Shape specifies the behaviors
 *   of this implementations subclasses.
 */
public interface Shape {  // Use keyword "interface" instead of "class"
   // List of public abstract methods to be implemented by its subclasses
   // All methods in interface are "public abstract".
   // "protected", "private" and "package" methods are NOT allowed.
   double getArea();
}
