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
public class Person {

    // private instance variables
    private String name, address;

    /**
     * Constructs a Person instance with the given name and address
     * @param name
     * @param address
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and Setters
    /**
     * Returns the name
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the address
     * @return 
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns a self-descriptive string
     */
    @Override
    public String toString() {
        return name + "(" + address + ")";
    }
}
