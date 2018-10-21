package org.academiadecodigo.diogorolo;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class TastyBar {


    //PROPERTIES

    private Rectangle tastyBarRectangle;
    private int maximumTastybarSize;
    private int totalBarIncremented;

    //CONSTRUCTOR

    /**
     * TastyBar Position
     *
     * Limit until the tastybar is filled
     */


    public TastyBar (){

        this.maximumTastybarSize = ((Grid.CELL_SIZE * Grid.ROWS) / 2) - 25;
        this.totalBarIncremented = 0 ;

        tastyBarRectangle = new Rectangle(Grid.COLS * Grid.CELL_SIZE + Grid.PADDING,Grid.ROWS * Grid.CELL_SIZE + Grid.PADDING - Grid.CELL_SIZE, Grid.CELL_SIZE / 2, Grid.CELL_SIZE);
        tastyBarRectangle.setColor(Color.GREEN);
        tastyBarRectangle.fill();
    }


    //METHODS
    /**
     * translate called as grow grows both sides.
     * @param tastyBarPointsIncrement
     */


    public boolean tastyBarIncrement (int tastyBarPointsIncrement) {

        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        System.out.println(tastyBarPointsIncrement);
        System.out.println("::::::::::::::::::::::::::::::::::::::::");

        if (totalBarIncremented >= maximumTastybarSize) {
            return true; }

        if (totalBarIncremented + tastyBarPointsIncrement >= maximumTastybarSize){
            tastyBarRectangle.grow(0, (maximumTastybarSize - totalBarIncremented));
            tastyBarRectangle.translate(0 , - (maximumTastybarSize - totalBarIncremented));
            totalBarIncremented += (maximumTastybarSize - totalBarIncremented);
            return true;
        }

        totalBarIncremented += tastyBarPointsIncrement;
        tastyBarRectangle.translate(0, -tastyBarPointsIncrement);
        tastyBarRectangle.grow(0, tastyBarPointsIncrement);


        System.out.println(totalBarIncremented + "tasty total");
        System.out.println(tastyBarPointsIncrement + "tasty increment");
        System.out.println("-----------------------------");
        return false;
    }

}
