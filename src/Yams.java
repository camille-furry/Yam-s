package src;

import src.Des;
import src.Fiche;

class Yams{
    public static void main(String[] args) {
        Des[] des = new Des[5];
        for(int i = 0; i < des.length; i++){
            des[i] = new Des();
        }
        Fiche fiche = new Fiche();
        System.out.println(fiche.toString());
        roll(des);
        System.out.println(toString(des));
    }

    private static void roll(Des[] des){
        for(Des d : des){
            d.roll();
        }
    }

    public static String toString(Des[] des){
        String str = "";
        for(Des d : des){
            str += d.value + ":";
        }
        return str;
    }
}