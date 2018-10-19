package org.academiadecodigo.diogorolo;

import org.academiadecodigo.diogorolo.Timer.Clock;

public class Main {
    public static void main(String[] args) {

        Eater eater = new Eater(10, 10);
        Clock timer = new Clock();
        timer.start(20);
    }

}
