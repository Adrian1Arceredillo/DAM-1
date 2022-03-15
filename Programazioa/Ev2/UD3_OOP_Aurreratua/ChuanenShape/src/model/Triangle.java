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
public class Triangle extends Shape {
    // Private member variables

    private int base, height;

    /**
     * Constructs a Triangle instance with the given color, base and height
     *
     * @param color
     * @param base
     * @param height
     */
    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    /**
     * Returns a self-descriptive string
     *
     * @return
     */
    @Override
    public String toString() {
        return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
    }

    /**
     * Override the inherited getArea() to provide the proper implementation for
     * triangle
     */
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
