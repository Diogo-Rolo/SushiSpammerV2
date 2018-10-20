package org.academiadecodigo.diogorolo;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Eater implements KeyboardHandler {
    //PROPERTIES
    private Grid gameGrid;
    private Cursor cursor;
    private KeyboardController kappa;
    private TastyBar tastyBar;

    //CONSTRUCTOR
    public Eater(int cols, int rows){
        gameGrid = new Grid(cols, rows);
        cursor = new Cursor();
        kappa = new KeyboardController(this);
        tastyBar = new TastyBar(Grid.PADDING+gameGrid.getCols()*Grid.CELL_SIZE,
                (Grid.PADDING*2+gameGrid.getRows()*Grid.CELL_SIZE- gameGrid.getRows())-Grid.CELL_SIZE, ((Grid.CELL_SIZE*rows )/2)-10);
    }


    //METHODS
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

    private void clearGrid(){
       gameGrid.clearGrid();
    }

    private void saveGame(){
        FileManager.saveGame(gameGrid.toString());
    }

    private void loadGame(){
        gameGrid.fromString(FileManager.loadGame());
    }
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
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
                clearGrid();
                break;
            case KeyboardEvent.KEY_S:
                saveGame();
                break;
            case KeyboardEvent.KEY_L:
                loadGame();
                break;
            default:
                System.out.println("Something went wrong!");
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
