package org.academiadecodigo.diogorolo.Timer;

import org.academiadecodigo.diogorolo.Grid;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Display {

    private Rectangle background;
    private Rectangle units;
    private Rectangle tens;
    private Clock timer;

    public Display(){

        timer = new Clock();
        tens = new Rectangle(Grid.COLS * Grid.CELL_SIZE + Grid.PADDING,Grid.ROWS * Grid.CELL_SIZE + Grid.PADDING - Grid.CELL_SIZE,Grid.CELL_SIZE,Grid.CELL_SIZE);
        units = new Rectangle(Grid.COLS * Grid.CELL_SIZE + Grid.PADDING,Grid.ROWS * Grid.CELL_SIZE + Grid.PADDING - Grid.CELL_SIZE,Grid.CELL_SIZE,Grid.CELL_SIZE);

        timer.start(20, Numbers.TWO, Numbers.ZERO);
        //tens.draw();
        units.draw();
    }

    public void start(){
        while (!timer.isTimeUp()){

        }

    }

}
