package org.academiadecodigo.diogorolo;


import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Cell {
    //PROPERTIES
    private int col;
    private int row;
    private int timesToBeSpammed;
    private Picture pic;
    private GameObject object;

    //CONSTRUCTOR

    /**
     * Fills the array of cells with newly created cells, giving each one a corresponding image,
     * position and an amount of times to be clicked. Receives row and col to start the cell on those coordinates.
     * @param row
     * @param col
     */
    public Cell(int row, int col){
        this.row = row;
        this.col = col;
        object = ObjectFactory.createObject();
        this.timesToBeSpammed = object.getTimesToSpam();

        pic = new Picture(col * Grid.CELL_SIZE + Grid.PADDING, row * Grid.CELL_SIZE + Grid.PADDING, object.getImage());
        pic.draw();
    }

    //METHODS

    /**
     * Decreases the food's "hp", when passing 0 returns the amount for the tasty bar to grow ("score").
     * @return int
     */
    public int eatSpam(){
        int tasteGain = 0;

        if (timesToBeSpammed == 0 ){
            timesToBeSpammed --;
            pic.delete();
            int tester = object.getHowTasty();
            return tester;
        } else {
            timesToBeSpammed --;
        }

        return tasteGain;
    }

    //GETTERS SETTERS
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
