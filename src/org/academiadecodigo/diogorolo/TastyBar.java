package org.academiadecodigo.diogorolo;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class TastyBar {


    //PROPERTIES

    private Rectangle tastyBarRectangle;
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
    int totalBarPointsIncrement = 0 ;

    public void tastyBarIncrement (int tastyBarPointsIncrement) {

        if (totalBarPointsIncrement >= tastyBarCapacity) { return; };

        tastyBarRectangle.grow(0, tastyBarPointsIncrement);
        tastyBarRectangle.translate(0, -tastyBarPointsIncrement);
        tastyBarRectangle.fill();

        totalBarPointsIncrement += tastyBarPointsIncrement;
        System.out.println(totalBarPointsIncrement + "tasty total");
        System.out.println(tastyBarPointsIncrement + "tasty increment");
        System.out.println("-----------------------------");
    }

}
