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
public class TicTacToeMove {
    private final int row;
    private final int col;

    public TicTacToeMove(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    
}
}