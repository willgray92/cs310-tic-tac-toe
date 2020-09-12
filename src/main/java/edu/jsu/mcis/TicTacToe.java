/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jsu.mcis;

/**
 *
 * @author will
 */
public class TicTacToe {

    /**
     * @
     */

    
    public static final int DEFAULT_WIDTH = 3;
    
    public static void main(String[] args) {
        
        /* Set initial size of game board (default is 3x3) */

        int width = DEFAULT_WIDTH;
        
        /* If a different size is provided as an argument, use it instead */

        if(args.length >= 1) {
            
            try {
                width = Integer.parseInt(args[0]);
            }
            catch(NumberFormatException e) {}
            
        }
        
        /* Create Controller */

        
        
        TicTacToeController controller = new TicTacToeController(width);
        
        /* Start Main Loop */
        
        controller.start();
    }
    
}
