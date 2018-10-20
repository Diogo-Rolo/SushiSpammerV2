package org.academiadecodigo.diogorolo;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class TastyBar {


    //PROPERTIES

    private Rectangle tastyBarRectangle;
    private int positionInX;
    private int positionInY;
    private int tastyBarCapacity;


    //CONSTRUCTOR

    /**
     * TastyBar Position
     * @param positionInX
     * @param positionInY
     *
     * Limit until the tastybar is filled
     * @param tastyBarCapacity
     */

    public TastyBar (int positionInX, int positionInY, int tastyBarCapacity){

        this.positionInX = positionInX;
        this.positionInY = positionInY;
        this.tastyBarCapacity = tastyBarCapacity;

        tastyBarRectangle = new Rectangle(positionInX, positionInY, Grid.CELL_SIZE, Grid.CELL_SIZE);
        tastyBarRectangle.draw();
        tastyBarRectangle.fill();
    }


    //METHODS

    /**
     * translate called as grow grows both sides.
     * @param tastyBarPointsIncrement
     */

    public void tastyBarIncrement (int tastyBarPointsIncrement) {

        int totalBarPointsIncrement = 0 ;

        if (tastyBarPointsIncrement == tastyBarCapacity) { return; };

        tastyBarRectangle.grow(0, tastyBarPointsIncrement);
        tastyBarRectangle.translate(0, -tastyBarPointsIncrement);
        tastyBarRectangle.fill();

        totalBarPointsIncrement += tastyBarPointsIncrement;

    }

}
