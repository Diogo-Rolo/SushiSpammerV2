package org.academiadecodigo.diogorolo.Timer;

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



        public CountDown(int seconds, Numbers tens, Numbers units) {
            this.seconds = seconds;
            this.tens = tens;
            this.units = units;
        }

        @Override
        public void run() {

            if(seconds == -1) {
                System.out.println("Game over man! Game over!");
                stop();
                setTimeUp(true);
                //System.out.println("timer " + isTimeUp());
                //System.exit(0);
                return;
            }

            this.seconds--;
            if(seconds%10 == 0){
                this.tens = tens.getNext();
                System.out.println(tens);
                //System.out.println(seconds);
            }
            this.units = units.getNext();
            System.out.println(units);
            //System.out.println("Timer: " + seconds--);
        }
    }

}
