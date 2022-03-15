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
public class MovablePoint implements Movable {
    
    private int x;
    private int y;
    
    
    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
    
    
    @Override
    public void moveUp() {
        ++y;
    }
    
    @Override
    public void moveDown() {
        --y;
    }
    
    @Override
    public void moveLeft() {
        --x;
    }
    
    @Override
    public void moveRight() {
        ++x;
    }
    
}
