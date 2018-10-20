package org.academiadecodigo.diogorolo;


import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Cell {
    //PROPERTIES
    private int col;
    private int row;
    private int timesToBeSpammed;
    private boolean Eaten;
    private Picture pic;
    private Boolean hasSushi = true;
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
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int eatSpam(){
        int tasteGain = 0;

        if (hasSushi) {
            if (Eaten){
                pic.delete();
                hasSushi = false;
                tasteGain = 0;
                return object.getHowTasty();
            }

            if (timesToBeSpammed == 0){
                Eaten = true;
            }
            timesToBeSpammed--;
            return tasteGain;
        }
        return 0;
    }

    public boolean isEaten(){
        return Eaten;
    }

    //GETTERS&SETTERS
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
