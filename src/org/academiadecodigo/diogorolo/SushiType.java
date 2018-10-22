package org.academiadecodigo.diogorolo;

public enum SushiType {
    MAKI (14, 5, "Resources/maki.png"),
    URAMAKI (5, 10, "Resources/uramaki.png"),
    SASHIMI (5, 5, "Resources/sashimi.png"),
    NIGIRI (5, 10, "Resources/nigiri.png"),
    TEMAKI (5, 30 , "Resources/temaki.png");

    private int timesToBeClicked;
    private int tastyness;
    private String image;

    SushiType(int timesToBeClicked, int tastyness, String image) {
        this.timesToBeClicked = timesToBeClicked;
        this.tastyness = tastyness;
        this.image = image;
    }

    public int getTimesToBeClicked() {
        return timesToBeClicked;
    }

    public int getTastyness() {
        return tastyness;
    }

    public String getImage() {
        return image;
    }




}
