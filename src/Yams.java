package src;

import src.object.DesList;
import src.object.Fiche;

class Yams{
    public static void main(String[] args) {
        DesList desList = new DesList(5);
        desList.roll();
        Fiche fiche = new Fiche();
        boolean roundOver = false;
        boolean valueOver = false;
        while (!fiche.isFull()) {
            roundOver = false;
            for(int i = 0; i < 3 && !roundOver; i++){
                desList.roll();
                System.out.println("Current roll: " + desList);
                while(!valueOver){
                    System.out.print("\nEntry values: ");
                    String input = System.console().readLine();
                    for(int n =0; n < input.length() && input.length()==5; n++){
                        if(input.charAt(n) == 'x'){
                            desList.lock(n);
                            valueOver = true;
                        }
                    }
                    if(i==2){
                        while(!entryValues(desList, fiche, input)){
                            System.out.print("\nPlease enter a valid entry: ");
                            input = System.console().readLine();
                        }
                        System.out.println("You have used the entry: " + input);
                        roundOver = true;
                        valueOver = true;
                    }else{
                        if(entryValues(desList, fiche, input)){
                            System.out.println("You have used the entry: " + input);
                            roundOver = true;
                            valueOver = true;
                        }else{
                            System.out.println("Invalid entry, please try again.");

                        }
                    }
                }
                
            }
        }
    }

    private static boolean entryValues(DesList desList, Fiche fiche, String entry){
        boolean valueOver = false;
        if(entry.equals("un")){
            fiche.useUn(desList);
            valueOver = true;
        }if(entry.equals("deux")){
            fiche.useDeux(desList);
            valueOver = true;
        }if(entry.equals("trois")){
            fiche.useTrois(desList);
            valueOver = true;
        }if(entry.equals("quatre")){
            fiche.useQuatre(desList);
            valueOver = true;
        }if(entry.equals("cinq")){
            fiche.useCinq(desList);
            valueOver = true;
        }if(entry.equals("six")){
            fiche.useSix(desList);
            valueOver = true;
        }if(entry.equals("brelan")){
            fiche.useBrelan(desList);
            valueOver = true;
        }if(entry.equals("carre")){
            fiche.useCarre(desList);
            valueOver = true;
        }if(entry.equals("full")){
            fiche.useFull(desList);
            valueOver = true;
        }if(entry.equals("petite suite")){
            fiche.usePetiteSuite(desList);
            valueOver = true;
        }if(entry.equals("grande suite")){
            fiche.useGrandeSuite(desList);
            valueOver = true;
        }if(entry.equals("yams")){
            fiche.useYams(desList);
            valueOver = true;
        }if(entry.equals("chance")){
            fiche.useChance(desList);
            valueOver = true;
        }
        return valueOver;

    }
}