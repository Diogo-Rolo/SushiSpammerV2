package org.academiadecodigo.diogorolo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileManager {

    public static String[] loadGame(){

        try{
            FileReader reader = new FileReader("Resources/paintsave");
            BufferedReader bReader = new BufferedReader(reader);

            String line;
            String result = "";

            while((line = bReader.readLine()) != null) {
                result += line;
            }
            bReader.close();

            String[] derp = result.split("");

            /*for (int i = 0; i < derp.length; i++) {
                if (derp[i].equals("1")){
                    rectangles[i].fill();
                } else {
                    rectangles[i].draw();
                }
            }*/

            return derp;
        } catch (Exception e){
            System.out.println("Deu merda nesse load");
        }

        return null;
    }

    public static void saveGame(String toWrite){

        try {
            FileWriter writer = new FileWriter("Resources/paintsave");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(toWrite);
            bufferedWriter.close();
        } catch (Exception e){
            System.out.println("Deu merda nesse save.");
        }

        return;
    }
}
