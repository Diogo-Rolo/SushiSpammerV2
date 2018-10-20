package org.academiadecodigo.diogorolo;

public class Grid {
    //PROPERTIES
    public static final int COLS = 10;
    public static final int ROWS = 10;
    public static final int CELL_SIZE = 50;
    public static final int PADDING = 300;
    private Cell[][] cells;

    //CONSTRUCTOR
    public Grid() {
        cells = new Cell[ROWS][COLS];
        setCells();
    }

    //METHODS
    private void setCells() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }

    public Cell getCell(int col, int row) {
        Cell toReturn = null;
        for (Cell[] i : cells) {
            for (Cell j : i) {
                if (j.getCol() == col && j.getRow() == row) {
                    toReturn = j;
                }
            }
        }
        return toReturn;
    }

    public int getCols() {
        return COLS;
    }

    public int getRows() {
        return ROWS;
    }

    //TO DELETE
    public void clearGrid() {
        for (Cell[] i : cells) {
            for (Cell j : i) {
                if (j.isEaten()) {
                    j.eatSpam();
                }
            }

        }
    }

    //TO DELETE
    public void fromString(String[] toPaint) {
        clearGrid();
        System.out.println("fromstring called");

        int idx = 0;
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (toPaint[idx] == "1") {
                    System.out.println(toPaint[idx]);
                    cells[i][j].eatSpam();
                }
                idx++;
            }
        }


        /*for (Cell[] i: cells) {
            for (Cell j: i) {
                if (toPaint[idx] == "1"){
                    System.out.println("wassup");
                    j.eatSpam();
                }
                idx++;
            }

        }*/
    }

    //TO CHANGE/DELETE
    @Override
    public String toString() {
        String toWrite = "";
        for (Cell[] i : cells) {
            for (Cell j : i) {
                if (j.isEaten()) {
                    toWrite += "1";
                } else {
                    toWrite += "0";
                }
            }
            toWrite += "\n";

        }

        return toWrite;
    }
}

