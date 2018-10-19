package org.academiadecodigo.diogorolo;

public class ObjectFactory {

    public static GameObject createObject(){
        GameObject gameObject;
        double what = Math.random() * 100;
        if (what < 15){
            gameObject = new Sushi(SushiType.MAKI);
        } else if (what < 30){
            gameObject = new Sushi(SushiType.URAMAKI);
        } else if (what < 45){
            gameObject = new Sushi(SushiType.SASHIMI);
        } else if (what < 60){
            gameObject = new Sushi(SushiType.NIGIRI);
        } else /*if (what < 75)*/{
            gameObject = new Sushi(SushiType.TEMAKI);
        }
        return gameObject;
    }


}
