/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author arceredillo.adrian
 */
public class GamePanel extends JPanel implements Runnable {
    
    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int)(GAME_WIDTH * (5/9));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
    static final int ARROW_DIAMETER = 20;
    static final int PADDLE_WIDTH = 25;
    static final int PADDLE_HEIGHT = 100;
    Thread gameThread;
    Image image;
    Graphics graphics;
    Random random;
    Shooter paddle1;
    Shooter paddle2;
    Arrow arrow;
    Score score;
    
    
    
    
    
    
    
    GamePanel() {
        
    }
    
    public void newArrow() { //every time the game starts, a new arrow is created
        
    }
    
    public void newPaddle() {
        
    }
    
    public void paint(Graphics g) {
        
    }
    
    public void draw(Graphics g) {
        
    }
    
    public void move() {    //move things after each iteration of our game loop
        
    }
    
    public void checkCollision() {
        
    }
    
    public void run() {
        
    }
    
    //create an inner class (Action Listener)
    public class AL extends KeyAdapter{
        
        public void keyPressed(KeyEvent e) {
            
        }
        
        public void keyReleased(KeyEvent e) {
            
        }
    }
    
    
}
