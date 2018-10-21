package org.academiadecodigo.diogorolo.Timer;

public enum Numbers {
    NINE ("EIGHT", 9, "Resources/Numbers/9.png"),
    EIGHT ("SEVEN", 8, "Resources/Numbers/8.png"),
    SEVEN ("SIX", 7, "Resources/Numbers/7.png"),
    SIX ("FIVE", 6, "Resources/Numbers/6.png"),
    FIVE ("FOUR", 5, "Resources/Numbers/5.png"),
    FOUR ("THREE", 4, "Resources/Numbers/4.png"),
    THREE ("TWO", 3, "Resources/Numbers/3.png"),
    TWO ("ONE", 2, "Resources/Numbers/2.png"),
    ONE ("ZERO" ,1, "Resources/Numbers/1.png"),
    ZERO ("NINE", 0, "Resources/Numbers/0.png");

    private int number;
    private String image;
    private String next;

    Numbers(String next, int number, String image){
        this.number = number;
        this.image = image;
        this.next = next;
    }

    public Numbers getNext() {
        return valueOf(this.next);
    }

    public int getNumber() {
        return number;
    }

    public String getImage() {
        return image;
    }
}
