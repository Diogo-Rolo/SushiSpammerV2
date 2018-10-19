package org.academiadecodigo.diogorolo.Timer;

import java.util.Timer;
import java.util.TimerTask;

public class Clock {

    private Timer timer;

    public void start(int seconds) {
        timer = new Timer();
        timer.schedule(new CountDown(seconds), 1000, 1000);
    }

    public void stop() {
        timer.cancel();
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
                System.out.println("Game over man! Game over!");
                stop();
                return;
            }

            System.out.println("Timer: " + seconds--);
        }
    }

}
