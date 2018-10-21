package org.academiadecodigo.diogorolo;

import org.academiadecodigo.diogorolo.Timer.Clock;
import org.academiadecodigo.diogorolo.Timer.Numbers;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Eater implements KeyboardHandler {
    //PROPERTIES
    private Grid gameGrid;
    private Cursor cursor;
    private KeyboardController kappa;
    private TastyBar tastyBar;
    private Clock timer;
    private boolean gameOver = false;

    //CONSTRUCTOR



    //METHODS

    public void startGame() {
        gameGrid = new Grid();
        cursor = new Cursor();
        kappa = new KeyboardController(this);
        tastyBar = new TastyBar();
        timer = new Clock();


        timer.start(21, Numbers.TWO, Numbers.ZERO);
/*
        while(timer.isTimeUp()){
            this.gameOver = true;
            System.out.println("gameOver" + gameOver);
        }
*/
    }


    private void eatSushi(){
        Cell toEat = gameGrid.getCell(cursor.getCol(),cursor.getRow());
        cursor.swapColor();
        toEat.eatSpam();
        tastyBar.tastyBarIncrement(toEat.eatSpam());
    }

    private void moveDown(){
        if(cursor.getRow() + 1 == gameGrid.getRows()){
            return;
        }
        cursor.moveDown();
    }

    private void moveUp(){


        if(cursor.getRow() == 0){
            return;
        }
        cursor.moveUp();
    }

    private void moveLeft(){
        if(cursor.getCol() == 0){
            return;
        }
        cursor.moveLeft();
    }

    private void moveRight(){
        if(cursor.getCol() + 1 == gameGrid.getCols()){
            return;
        }
        cursor.moveRight();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(timer.isTimeUp()){
            return;
        }
        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_SPACE:
                eatSushi();
                break;
            case KeyboardEvent.KEY_LEFT:
                moveLeft();
                break;
            case KeyboardEvent.KEY_RIGHT:
                moveRight();
                break;
            case KeyboardEvent.KEY_UP:
                moveUp();
                break;
            case KeyboardEvent.KEY_DOWN:
                moveDown();
                break;
            case KeyboardEvent.KEY_C:
                break;
            case KeyboardEvent.KEY_S:
                break;
            case KeyboardEvent.KEY_L:
                break;
            default:
                System.out.println("Something went wrong!");
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
