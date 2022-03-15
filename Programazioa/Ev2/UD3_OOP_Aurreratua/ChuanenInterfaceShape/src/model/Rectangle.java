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
 * The subclass Rectangle needs to implement all the abstract methods in Shape
 */
public class Rectangle implements Shape {  // using keyword "implements" instead of "extends"
    // Private member variables

    private int length, width;

    /**
     * Constructs a Rectangle instance with the given length and width
     *
     * @param length
     * @param width
     */
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Returns a self-descriptive string
     */
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }

    // Need to implement all the abstract methods defined in the interface
    /**
     * Returns the area of this rectangle
     *
     * @return
     */
    @Override
    public double getArea() {
        return length * width;
    }
}
