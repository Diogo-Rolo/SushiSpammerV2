package org.academiadecodigo.diogorolo;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cursor extends Cell{
    Rectangle cursor;

    public Cursor(){
        super(0, 0);
        cursor = new Rectangle(Grid.PADDING, Grid.PADDING, Grid.CELL_SIZE, Grid.CELL_SIZE);
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
            cursor.setColor(Color.BLACK);
            return;
        }
        cursor.setColor(Color.GREEN);
    }


    @Override
    public void setCol(boolean dir) {
        super.setCol(dir);
    }

    @Override
    public void setRow(boolean dir) {
        super.setRow(dir);
    }
}
