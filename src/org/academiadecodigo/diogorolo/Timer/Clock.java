package org.academiadecodigo.diogorolo.Timer;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.Timer;
import java.util.TimerTask;

public class Clock {

    private Timer timer;
    private boolean timeUp = false;


    public void start(int seconds) {
        timer = new Timer();
        timer.schedule(new CountDown(seconds), 1000, 1000);
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


        public CountDown(int seconds) {
            this.seconds = seconds;
        }

        @Override
        public void run() {

            if(seconds == -1) {
                Picture loose = new Picture(10, 10 , "Resources/LOOSE_LOOSE.png");
                loose.draw();
                System.out.println("Game over man! Game over!");
                stop();
                setTimeUp(true);
                //System.out.println("timer " + isTimeUp());
                //System.exit(0);
                return;
            }

            System.out.println("Timer: " + seconds--);
        }
    }

}
