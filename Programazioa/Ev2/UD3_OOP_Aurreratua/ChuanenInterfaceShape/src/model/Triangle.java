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
 * The subclass Triangle need to implement all the abstract methods in Shape
 */
public class Triangle implements Shape {
    // Private member variables

    private int base, height;

    /**
     * Constructs a Triangle instance with the given base and height
     *
     * @param base
     * @param height
     */
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Returns a self-descriptive string
     */
    @Override
    public String toString() {
        return "Triangle[base=" + base + ",height=" + height + "]";
    }

    // Need to implement all the abstract methods defined in the interface
    /**
     * Returns the area of this triangle
     *
     * @return
     */
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
    
}
