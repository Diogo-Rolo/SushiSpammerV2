package org.academiadecodigo.diogorolo;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cursor{
    private Rectangle cursor;
    private int col;
    private int row;

    public Cursor(){
        this.col = 0;
        this.row = 0;
        cursor = new Rectangle(Grid.PADDING, Grid.PADDING, Grid.CELL_SIZE, Grid.CELL_SIZE);
        cursor.setColor(Color.RED);
        cursor.draw();
    }

    public void moveUp(){
        cursor.translate(0, -Grid.CELL_SIZE);
        setRow(false);
    }

    public void moveDown(){
        cursor.translate(0, Grid.CELL_SIZE);
        setRow(true);
    }

    public void moveLeft(){
        cursor.translate(-Grid.CELL_SIZE, 0);
        setCol(false);
    }

    public void moveRight(){
        cursor.translate(Grid.CELL_SIZE,0);
        setCol(true);
    }

    public void swapColor(){
        if (cursor.getColor() == Color.GREEN){
            cursor.setColor(Color.RED);
            return;
        }
        cursor.setColor(Color.GREEN);
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(boolean dir) {
        if (dir){
            col ++;
        } else {
            col --;
        }
    }

    public void setRow(boolean dir) {
        if (dir){
            row++;
        } else {
            row--;
        }
    }

}
