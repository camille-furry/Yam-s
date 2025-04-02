package jeu;

import jeu.object.DesList;
import jeu.object.Fiche;
import javax.swing.*;


class Yams extends JFrame{
    boolean roundOver = false;
    DesList desList = new DesList(5);
    Fiche fiche = new Fiche();
    String input;
    int currentRound = 0;

    public Yams() {
        super("Yams Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);

        JButton rollDice = new JButton("Roll Dice");
        Jbutton entryButton = new JButton("Enter Choice");
        JPanel panel = new JPanel();
        panel.add(rollDice);
        panel.add(entryButton);
        setContentPane(panel);

        entryButton.addActionListener(new ActionListener){
            public void actionPerformed(ActionEvent e) {
                boolean finishAction = false;
                while(!finishAction){
                    this.input = JOptionPane.showInputDialog(this, "Enter your choice (x for lock, o for unlock or choice a value):");
                    if (inputEntry()){
                        finishAction = true;
                    };
                }
            };
        }

        rollDice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                this.desList.roll();
                JOptionPane.showMessageDialog(null, "Dice rolled: " + desList);
            }
        });
    }


    public static void main(String[] args) {

        this.desList.roll();
        while (!fiche.isFull()) {
            this.roundOver = false;
            unlockAll(desList);
            for(int i = 0; i < 3 && !roundOver; i++){
                this.valueOver = false;
                this.desList.roll();
                while(!valueOver){
                    this.input = System.console().readLine();
                    inputEntry(i);
            }
        }
        if(fiche.bottomIsFull()){
            fiche.updateTotalSuperieur();
            fiche.usePrime(this.desList);
            fiche.updateTotalSuperieur();
        }if(fiche.topIsFull()){
            fiche.updateTotalSuperieur();
        }
        }
        fiche.updateTotal();
        System.out.println(this.fiche);
        System.out.println("Game over, your total score is: " + fiche.getTotal());
    }

    private static boolean inputEntry(){
        if(isDiceChoice(this.input) && this.currentRound<2){
            for(int i =0; i < 5; i++){
                if(this.input.charAt(i) == 'x'){
                    this.desList.lock(i);
                    this.valueOver = true;
                }else{
                    this.desList.unlock(i);
                    this.valueOver = true;
                }
            }
        }else if(currentRound<2){
            if(entryValues(this.desList, this.fiche, this.input)){
                System.out.println("You have used the entry: " + this.input);
                return true;
            }else{
                System.out.println("Invalid entry, please try again.");
                return false;
            }
        }else{
            while(!entryValues(this.desList, this.fiche, this.input)){
                System.out.print("\nPlease enter a valid entry: ");
                return false;
            }
            System.out.println("You have used the entry: " + this.input);
            return true;
        }
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