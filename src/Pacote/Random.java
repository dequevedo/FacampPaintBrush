package Pacote;

import java.awt.Color;

public class Random {
    static double rRange(int max, int min){
        return (int)(Math.random() * (max - min) + min) + 1;
    }
    static int rRangeInt(int max, int min){
        return (int)(Math.random() * (max - min) + min) + 1;
    }

    static boolean rBoolean(){
        return Math.random() < 0.5;
    }
    static Color rColor(){
        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B = (int)(Math.random()*256);
        return new Color(R, G, B);
    }
}
