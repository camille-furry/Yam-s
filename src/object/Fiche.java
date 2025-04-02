// Ensure the correct package path for the Des class
package src.object;

public class Fiche{
    int un;
    int deux;
    int trois;
    int quatre;
    int cinq;
    int six;
    int prime;
    int brelan;
    int carre;
    int full;
    int petiteSuite;
    int grandeSuite;
    int yams;
    int chance;
    
    int totalSuperieur;
    int totalInferieur;
    int total;

    public Fiche(){
        this.un = -1;
        this.deux = -1;
        this.trois = -1;
        this.quatre = -1;
        this.cinq = -1;
        this.six = -1;
        this.prime = -1;
        this.brelan = -1;
        this.carre = -1;
        this.full = -1;
        this.petiteSuite = -1;
        this.grandeSuite = -1;
        this.yams = -1;
        this.chance = -1;
    }

    public void reset(){
        this.un = -1;
        this.deux = -1;
        this.trois = -1;
        this.quatre = -1;
        this.cinq = -1;
        this.six = -1;
        this.prime = -1;
        this.brelan = -1;
        this.carre = -1;
        this.full = -1;
        this.petiteSuite = -1;
        this.grandeSuite = -1;
        this.yams = -1;
        this.chance = -1;
    }

    public Boolean useUn(DesList des){
        if(this.un == -1){
            this.un = des.getValue(1);
            return true;
        }
        return false;
    }

    public Boolean useDeux(DesList des){
        if(this.deux == -1){
            this.deux = des.getValue(2);
            return true;
        }
        return false;
    }
    public Boolean useTrois(DesList des){
        if(this.trois == -1){
            this.trois = des.getValue(3);
            return true;
        }
        return false;
    }

    public Boolean useQuatre(DesList des){
        if(this.quatre == -1){
            this.quatre = des.getValue(4);
            return true;
        }
        return false;
    }

    public Boolean useCinq(DesList des){
        if(this.cinq == -1){
            this.cinq = des.getValue(5);
            return true;
        }
        return false;
    }

    public Boolean useSix(DesList des){
        if(this.six == -1){
            this.six = des.getValue(6);
            return true;
        }
        return false;
    }

    public Boolean usePrime(DesList des){
        
        if(this.prime == -1){
            if(this.totalInferieur >= 63){
                this.prime = 35;
            }else{
                this.prime = 0;
            }
        }
        return false;
    }

    public Boolean useBrelan(DesList des){
        if(this.brelan == -1){
            for(int i = 1; i < 7; i++){
                if(des.getNbValue(i) > 3){
                    this.brelan = des.getValue();
                    return true;
                }
            }
            this.brelan = 0;
            return true;
        }
        return false;
    }

    public Boolean useCarre(DesList des){
        if(this.carre == -1){
            for(int i = 1; i < 7; i++){
                if(des.getNbValue(i) > 4){
                    this.carre = des.getValue();
                    return true;
                }
            }
            this.carre = 0;
            return true;
        }
        return false;
    }

    public Boolean useFull(DesList des){
        if(this.full == -1){
            for(int i = 1; i < 7; i++){
                for(int j = 1; j < 7; j++){
                    if(i != j && des.getNbValue(i) == 3 && des.getNbValue(j) == 2){
                        this.full = 25;
                        return true;
                    }
                }
            }
            this.full = 0;
            return true;
        }
        return false;
    }

    public Boolean usePetiteSuite(DesList des){
        if(this.petiteSuite == -1){
            if(des.getValue(1)==1 && des.getValue(2)==2 && des.getValue(3)==3 && des.getValue(4)==4){
                this.petiteSuite = 30;
                return true;
            }else if(des.getValue(2)==2 && des.getValue(3)==3 && des.getValue(4)==4 && des.getValue(5)==5){
                this.petiteSuite = 30;
                return true;
            }else if(des.getValue(3)==3 && des.getValue(4)==4 && des.getValue(5)==5 && des.getValue(6)==6){
                this.petiteSuite = 30;
                return true;
            }else{
                this.petiteSuite = 0;
                return true;
            }
        }
        return false;
    }

    public Boolean useGrandeSuite(DesList des){
        if(this.grandeSuite == -1){
            if(des.getValue(1)==1 && des.getValue(2)==2 && des.getValue(3)==3 && des.getValue(4)==4 && des.getValue(5)==5){
                this.grandeSuite = 40;
                return true;
            }else if(des.getValue(2)==2 && des.getValue(3)==3 && des.getValue(4)==4 && des.getValue(5)==5 && des.getValue(6)==6){
                this.grandeSuite = 40;
                return true;
            }else{
                this.grandeSuite = 0;
                return true;
            }
        }
        return false;
    }

    public Boolean useYams(DesList des){
        if(this.yams == -1){
            for(int i = 1; i < 7; i++){
                if(des.getNbValue(i) == 5){
                    this.yams = 50;
                    return true;
                }
            }
            this.yams = 0;
            return true;
        }
        return false;
    }

    public Boolean useChance(DesList des){
        if(this.chance == -1){
            this.chance = des.getValue();
            return true;
        }
        return false;
    }

    public void updateTotalSuperieur(){
        int value = 0;
        if(this.un != -1){
            value += this.un;
        }
        if(this.deux != -1){
            value += this.deux;
        }
        if(this.trois != -1){
            value += this.trois;
        }
        if(this.quatre != -1){
            value += this.quatre;
        }
        if(this.cinq != -1){
            value += this.cinq;
        }
        if(this.six != -1){
            value += this.six;
        }
        this.totalSuperieur = value;
    }

    public void updateTotalInferieur(){
        int value = 0;
        if(this.prime != -1){
            value += this.prime;
        }
        if(this.brelan != -1){
            value += this.brelan;
        }
        if(this.carre != -1){
            value += this.carre;
        }
        if(this.full != -1){
            value += this.full;
        }
        if(this.petiteSuite != -1){
            value += this.petiteSuite;
        }
        if(this.grandeSuite != -1){
            value += this.grandeSuite;
        }
        if(this.yams != -1){
            value += this.yams;
        }
        if(this.chance != -1){
            value += this.chance;
        }
        this.totalInferieur = value;
    }

    public void updateTotal(){
        this.total = this.totalSuperieur + this.totalInferieur;
    }

    public int getUn(){
        return this.un;
    }

    public int getDeux(){
        return this.deux;
    }

    public int getTrois(){
        return this.trois;
    }

    public int getQuatre(){
        return this.quatre;
    }

    public int getCinq(){
        return this.cinq;
    }

    public int getSix(){
        return this.six;
    }

    public int getPrime(){
        return this.prime;
    }

    public int getBrelan(){
        return this.brelan;
    }

    public int getCarre(){
        return this.carre;
    }

    public int getFull(){
        return this.full;
    }

    public int getPetiteSuite(){
        return this.petiteSuite;
    }

    public int getGrandeSuite(){
        return this.grandeSuite;
    }

    public int getYams(){
        return this.yams;
    }

    public int getChance(){
        return this.chance;
    }

    public int getTotalSuperieur(){
        return this.totalSuperieur;
    }

    public int getTotalInferieur(){
        return this.totalInferieur;
    }

    public int getTotal(){
        return this.total;
    }

    public String toString(){
        String fiche = "";
        if(this.un != -1){
            fiche += "|Un             | " + this.un + " |\n";
        }else{
            fiche += "|Un             |   |\n";
        }
        if(this.deux != -1){
            fiche += "|Deux           | " + this.deux + " |\n";
        }else{
            fiche += "|Deux           |   |\n";
        }
        if(this.trois != -1){
            fiche += "|Trois          | " + this.trois + " |\n";
        }else{
            fiche += "|Trois          |   |\n";
        }
        if(this.quatre != -1){
            fiche += "|Quatre         | " + this.quatre + " |\n";
        }else{
            fiche += "|Quatre         |   |\n";
        }
        if(this.cinq != -1){
            fiche += "|Cinq           | " + this.cinq + " |\n";
        }else{
            fiche += "|Cinq           |   |\n";
        }
        if(this.six != -1){
            fiche += "|Six            | " + this.six + " |\n";
        }else{
            fiche += "|Six            |   |\n";
        }
        if(this.prime != -1){
            fiche += "|Prime          | " + this.prime + " |\n";
        }else{
            fiche += "|Prime          |   |\n";
        }
        if(this.brelan != -1){
            fiche += "|Brelan         | " + this.brelan + " |\n";
        }else{
            fiche += "|Brelan         |   |\n";
        }
        if(this.carre != -1){
            fiche += "|Carre          | " + this.carre + " |\n";
        }else{
            fiche += "|Carre          |   |\n";
        }
        if(this.full != -1){
            fiche += "|Full           | " + this.full + " |\n";
        }else{
            fiche += "|Full           |   |\n";
        }
        if(this.petiteSuite != -1){
            fiche += "|PetiteSuite    | " + this.petiteSuite + " |\n";
        }else{
            fiche += "|PetiteSuite    |   |\n";
        }
        if(this.grandeSuite != -1){
            fiche += "|GrandeSuite    | " + this.grandeSuite + " |\n";
        }else{
            fiche += "|GrandeSuite    |   |\n";
        }
        if(this.yams != -1){
            fiche += "|Yams           | " + this.yams + " |\n";
        }else{
            fiche += "|Yams           |   |\n";
        }
        if(this.chance != -1){
            fiche += "|Chance         | " + this.chance + " |\n";
        }else{
            fiche += "|Chance         |   |\n";
        }

        fiche += "|totalSuperieur | " + this.totalSuperieur + " |\n";
        fiche += "|totalInferieur | " + this.totalInferieur + " |\n";
        fiche += "|total          | " + this.total + " |\n";
        return fiche;
    }

    public boolean isFull(){
        if(!this.bottomIsFull() || !this.topIsFull()){
            return false;
        }
        return true;
    }

    public boolean bottomIsFull(){
        if(this.brelan == -1 || this.carre == -1 || this.full == -1 || this.petiteSuite == -1 || this.grandeSuite == -1 || this.yams == -1 || this.chance == -1){
            return false;
        }
        return true;
    }

    public boolean topIsFull(){
        if(this.un == -1 || this.deux == -1 || this.trois == -1 || this.quatre == -1 || this.cinq == -1 || this.six == -1){
            return false;
        }
        return true;
    }
}