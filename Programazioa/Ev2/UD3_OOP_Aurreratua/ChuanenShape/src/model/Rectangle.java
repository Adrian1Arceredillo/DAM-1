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
public class Rectangle extends Shape {
    // Private member variables

    private int length, width;

    /**
     * Constructs a Rectangle instance with the given color, length and width
     *
     * @param color
     * @param length
     * @param width
     */
    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    /**
     * Returns a self-descriptive string
     *
     * @return
     */
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
    }

    /**
     * Override the inherited getArea() to provide the proper implementation for
     * rectangle
     */
    @Override
    public double getArea() {
        return length * width;
    }
}
