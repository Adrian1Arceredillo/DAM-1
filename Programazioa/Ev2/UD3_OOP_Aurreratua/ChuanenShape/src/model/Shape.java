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
public class Shape {
    // Private member variable

    private String color;

    /**
     * Constructs a Shape instance with the given color
     *
     * @param color
     */
    public Shape(String color) {
        this.color = color;
    }

    /**
     * Returns a self-descriptive string
     */
    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }

    /**
     * All shapes must provide a method called getArea()
     *
     * @return
     */
    public double getArea() {
        // We have a problem here!
        // We need to return some value to compile the program.
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}
