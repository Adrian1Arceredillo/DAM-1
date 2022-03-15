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
public class TestMovable {

    public static void main(String[] args) {
        
        MovablePoint mP1 = new MovablePoint(1, 2);
        System.out.println(mP1);
        //(1, 2)
        System.out.println("----------------");
        //moveDown()
        mP1.moveDown();
        System.out.println("Move down: " + mP1);
        System.out.println("----------------");
        //moveRight()
        mP1.moveRight();
        System.out.println("Move right: " + mP1);
        
        
        // Test Polymorphism
        Movable p2 = new MovablePoint(3, 4);  // upcast
        p2.moveUp();
        System.out.println(p2);
        //(3,3)
        
        MovablePoint p3 = (MovablePoint) p2;   // downcast
        System.out.println(p3);
        //(3,3)
    }
}
