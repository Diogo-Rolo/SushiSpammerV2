package org.academiadecodigo.diogorolo.Timer;

import org.academiadecodigo.diogorolo.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.Timer;
import java.util.TimerTask;

public class Clock {

    private Timer timer;
    private boolean timeUp = false;


    public void start(int seconds, Numbers tens, Numbers units) {
        timer = new Timer();
        timer.schedule(new CountDown(seconds, tens, units), 1000, 1000);
    }

    public void stop() {
        timer.cancel();
    }

    public boolean isTimeUp() {
        return timeUp;
    }

    public void setTimeUp(boolean test) {
        this.timeUp = test;
    }






    //COUNTDOWN
    private class CountDown extends TimerTask {

        private int seconds;
        private Numbers units;
        private Numbers tens;
        Picture unitsImage;
        Picture tensImage;
        Rectangle background;



        public CountDown(int seconds, Numbers tens, Numbers units) {
            this.seconds = seconds;
            this.tens = tens;
            this.units = units;
            background = new Rectangle(Grid.COLS * Grid.CELL_SIZE + Grid.PADDING, Grid.ROWS * Grid.CELL_SIZE +
                    Grid.PADDING - Grid.CELL_SIZE, 144, 77);
            background.setColor(Color.WHITE);
            background.fill();
            tensImage = new Picture( Grid.COLS * Grid.CELL_SIZE + Grid.PADDING, Grid.ROWS * Grid.CELL_SIZE +
                    Grid.PADDING - Grid.CELL_SIZE, tens.getImage());
            tensImage.draw();

            unitsImage = new Picture( Grid.COLS * Grid.CELL_SIZE + Grid.PADDING +72, Grid.ROWS * Grid.CELL_SIZE +
                    Grid.PADDING - Grid.CELL_SIZE, units.getImage());
            unitsImage.draw();


        }


        @Override
        public void run() {

            if(seconds == 1) {
                System.out.println("Game over man! Game over!");
                stop();
                setTimeUp(true);
                //System.out.println("timer " + isTimeUp());
                //System.exit(0);
                return;
            }

            this.seconds--;
            if(seconds%10 == 0){
                tensImage.delete();
                this.tens = tens.getNext();
                tensImage.load(tens.getImage());
                tensImage.draw();
                System.out.println(tens);
                //System.out.println(seconds);
            }
            unitsImage.delete();
            this.units = units.getNext();

            unitsImage.load(units.getImage());

            unitsImage.draw();
            System.out.println(units);
            //System.out.println("Timer: " + seconds--);
        }
    }

}
