package jeu;

import jeu.object.DesList;
import jeu.object.Fiche;
import javax.swing.*;


class Yams{
    public static void main(String[] args) {
        DesList desList = new DesList(5);
        JFrame frame = new JFrame("Yams");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        desList.roll();
        Fiche fiche = new Fiche();
        boolean roundOver = false;
        boolean valueOver = false;
        JLabel desLabel = new JLabel();
        while (!fiche.isFull()) {
            roundOver = false;
            unlockAll(desList);
            for(int i = 0; i < 3 && !roundOver; i++){
                valueOver = false;
                desList.roll();
                while(!valueOver){
                    desLabel.setText("Current roll (" + (i+1) + "): " + desList);
                    desLabel.setHorizontalAlignment(SwingConstants.CENTER);
                    frame.getContentPane().add(desLabel, java.awt.BorderLayout.SOUTH);
                    frame.setVisible(true);
                    fiche.afficher(frame);
                    String input = System.console().readLine();
                    if(isDiceChoice(input) && i<2){
                        for(int n =0; n < 5; n++){
                            if(input.charAt(n) == 'x'){
                                desList.lock(n);
                                valueOver = true;
                            }else{
                                desList.unlock(n);
                                valueOver = true;
                            }
                        }
                    }else if(i<2){
                        if(entryValues(desList, fiche, input)){
                            System.out.println("You have used the entry: " + input);
                            roundOver = true;
                            valueOver = true;
                        }else{
                            System.out.println("Invalid entry, please try again.");
                        }
                    }else{
                        while(!entryValues(desList, fiche, input)){
                            System.out.print("\nPlease enter a valid entry: ");
                            input = System.console().readLine();
                        }
                        System.out.println("You have used the entry: " + input);
                        roundOver = true;
                        valueOver = true;
                    }
            }
        }
        if(fiche.bottomIsFull()){
            fiche.updateTotalSuperieur();
            fiche.usePrime(desList);
            fiche.updateTotalSuperieur();
        }if(fiche.topIsFull()){
            fiche.updateTotalSuperieur();
        }
        }
        fiche.updateTotal();
        System.out.println(fiche);
        System.out.println("Game over, your total score is: " + fiche.getTotal());
    }
    
    private static void unlockAll(DesList desList){
        for(int i = 0;i < 5;i++){
            desList.unlock(i);
        }
    }

    private static boolean entryValues(DesList desList, Fiche fiche, String entry){
        boolean valueOver = false;
        if(entry.equals("Un")){
            fiche.useUn(desList);
            valueOver = true;
        }if(entry.equals("Deux")){
            fiche.useDeux(desList);
            valueOver = true;
        }if(entry.equals("Trois")){
            fiche.useTrois(desList);
            valueOver = true;
        }if(entry.equals("Quatre")){
            fiche.useQuatre(desList);
            valueOver = true;
        }if(entry.equals("Cinq")){
            fiche.useCinq(desList);
            valueOver = true;
        }if(entry.equals("Six")){
            fiche.useSix(desList);
            valueOver = true;
        }if(entry.equals("Brelan")){
            fiche.useBrelan(desList);
            valueOver = true;
        }if(entry.equals("Carre")){
            fiche.useCarre(desList);
            valueOver = true;
        }if(entry.equals("Full")){
            fiche.useFull(desList);
            valueOver = true;
        }if(entry.equals("PetiteSuite")){
            fiche.usePetiteSuite(desList);
            valueOver = true;
        }if(entry.equals("GrandeSuite")){
            fiche.useGrandeSuite(desList);
            valueOver = true;
        }if(entry.equals("Yams")){
            fiche.useYams(desList);
            valueOver = true;
        }if(entry.equals("Chance")){
            fiche.useChance(desList);
            valueOver = true;
        }
        return valueOver;

    }

    private static boolean isDiceChoice(String input){
        for(int i = 0;i < input.length();i++){
            if(input.charAt(i) != 'x' && input.charAt(i) != 'o'){
                return false;
            }
        }
        if(input.length()!=5){
            return false;
        }
        return true;
    }
}