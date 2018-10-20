package org.academiadecodigo.diogorolo;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Grid {
    //PROPERTIES
    public static final int COLS = 10;
    public static final int ROWS = 10;
    public static final int CELL_SIZE = 50;
    public static final int PADDING = 50;
    private Picture gridBackground;
    private Cell[][] cells;

    //CONSTRUCTOR
    public Grid() {
        gridBackground = new Picture(PADDING, PADDING, "Resources/gridBackground.jpg");
        gridBackground.draw();
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


}

