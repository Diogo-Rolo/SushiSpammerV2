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
    public Cell(int row, int col){
        this.row = row;
        this.col = col;
        object = ObjectFactory.createObject();
        this.timesToBeSpammed = object.getTimesToSpam();

        pic = new Picture(col * Grid.CELL_SIZE + Grid.PADDING, row * Grid.CELL_SIZE + Grid.PADDING, object.getImage());
        pic.draw();
    }

    //METHODS


    public int eatSpam(){
        int tasteGain = 0;

        if (timesToBeSpammed == 0 ){
            timesToBeSpammed --;
            pic.delete();
            return object.getHowTasty();
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
