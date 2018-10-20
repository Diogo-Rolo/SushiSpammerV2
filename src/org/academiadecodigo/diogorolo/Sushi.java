package org.academiadecodigo.diogorolo;

public class Sushi implements GameObject{
    //PROPERTIES
    private int timesToSpam;
    private int howTasty;
    private String image;

    //CONSTRUCTOR
    public Sushi(SushiType type){
        this.timesToSpam = type.getTimesToBeClicked();
        this.howTasty = type.getTastyness();
        this.image = type.getImage();
    }

    @Override
    public int getTimesToSpam() {
        return timesToSpam;
    }

    @Override
    public int getHowTasty() {
        return howTasty;
    }

    public String getImage() {
        return image;
    }
}
