// Ensure the correct package path for the Des class
package src;

import src.Des;

class Fiche{
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

    public void setUn(Des[] des){
        int value = 0;
        for(Des d : des){
            if(d.value == 1){
                value += 1;
            }
        }
        this.un = value;
    }

    public void setDeux(Des[] des){
        int value = 0;
        for(Des d : des){
            if(d.value == 2){
                value += 2;
            }
        }
        this.deux = value;
    }

    public void setTrois(Des[] des){
        int value = 0;
        for(Des d : des){
            if(d.value == 3){
                value += 3;
            }
        }
        this.trois = value;
    }

    public void setQuatre(Des[] des){
        int value = 0;
        for(Des d : des){
            if(d.value == 4){
                value += 4;
            }
        }
        this.quatre = value;
    }

    public void setCinq(Des[] des){
        int value = 0;
        for(Des d : des){
            if(d.value == 5){
                value += 5;
            }
        }
        this.cinq = value;
    }

    public void setSix(Des[] des){
        int value = 0;
        for(Des d : des){
            if(d.value == 6){
                value += 6;
            }
        }
        this.six = value;
    }

    public void setPrime(){
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
        if(value >= 63){
            this.prime = 35;
        }else{
            this.prime = 0;
        }
    }

    public void setBrelan(Des[] des){
        int value = 0;
        for(int i = 1; i <= 6; i++){
            int count = 0;
            for(Des d : des){
                if(d.value == i){
                    count++;
                }
            }
            if(count >= 3){
                for(Des d : des){
                    value += d.value;
                }
                break;
            }
        }
        this.brelan = value;
    }

    public void setCarre(Des[] des){
        int value = 0;
        for(int i = 1; i <= 6; i++){
            int count = 0;
            for(Des d : des){
                if(d.value == i){
                    count++;
                }
            }
            if(count >= 4){
                for(Des d : des){
                    value += d.value;
                }
                break;
            }
        }
        this.carre = value;
    }

    public void setFull(Des[] des){
        int value = 0;
        int[] count = new int[6];
        for(Des d : des){
            count[d.value - 1]++;
        }
        boolean brelan = false;
        boolean paire = false;
        for(int i = 0; i < 6; i++){
            if(count[i] == 3){
                brelan = true;
            }
            if(count[i] == 2){
                paire = true;
            }
        }
        if(brelan && paire){
            for(Des d : des){
                value += d.value;
            }
        }
        this.full = value;
    }

    public void setPetiteSuite(Des[] des){
        int value = 0;
        int[] count = new int[6];
        for(Des d : des){
            count[d.value - 1]++;
        }
        for(int i = 0; i < 3; i++){
            if(count[i] > 0 && count[i + 1] > 0 && count[i + 2] > 0 && count[i + 3] > 0){
                value = 30;
                break;
            }
        }
        this.petiteSuite = value;
    }

    public void setGrandeSuite(Des[] des){
        int value = 0;
        int[] count = new int[6];
        for(Des d : des){
            count[d.value - 1]++;
        }
        for(int i = 0; i < 2; i++){
            if(count[i] > 0 && count[i + 1] > 0 && count[i + 2] > 0 && count[i + 3] > 0 && count[i + 4] > 0){
                value = 40;
                break;
            }
        }
        this.grandeSuite = value;
    }

    public void setYams(Des[] des){
        int value = 0;
        for(int i = 1; i <= 6; i++){
            int count = 0;
            for(Des d : des){
                if(d.value == i){
                    count++;
                }
            }
            if(count >= 5){
                value = 50;
                break;
            }
        }
        this.yams = value;
    }

    public void setChance(Des[] des){
        int value = 0;
        for(Des d : des){
            value += d.value;
        }
        this.chance = value;
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
        String fiche = "Yams\n";
        if(this.un != -1){
            fiche += "|Un           | " + this.un + " |\n";
        }else{
            fiche += "|Un           | 0 |\n";
        }
        if(this.deux != -1){
            fiche += "|Deux         | " + this.deux + " |\n";
        }else{
            fiche += "|Deux         | 0 |\n";
        }
        if(this.trois != -1){
            fiche += "|Trois        | " + this.trois + " |\n";
        }
        if(this.quatre != -1){
            fiche += "|Quatre       | " + this.quatre + " |\n";
        }else{
            fiche += "|Quatre       | 0 |\n";
        }
        if(this.cinq != -1){
            fiche += "|Cinq         | " + this.cinq + " |\n";
        }else{
            fiche += "|Cinq         | 0 |\n";
        }
        if(this.six != -1){
            fiche += "|Six          | " + this.six + " |\n";
        }else{
            fiche += "|Six          | 0 |\n";
        }
        if(this.prime != -1){
            fiche += "|Prime        | " + this.prime + " |\n";
        }else{
            fiche += "|Prime        | 0 |\n";
        }
        if(this.brelan != -1){
            fiche += "|Brelan       | " + this.brelan + " |\n";
        }else{
            fiche += "|Brelan       | 0 |\n";
        }
        if(this.carre != -1){
            fiche += "|Carre        | " + this.carre + " |\n";
        }else{
            fiche += "|Carre        | 0 |\n";
        }
        if(this.full != -1){
            fiche += "|Full         | " + this.full + " |\n";
        }else{
            fiche += "|Full         | 0 |\n";
        }
        if(this.petiteSuite != -1){
            fiche += "|PetiteSuite  | " + this.petiteSuite + " |\n";
        }else{
            fiche += "|PetiteSuite  | 0 |\n";
        }
        if(this.grandeSuite != -1){
            fiche += "|GrandeSuite  | " + this.grandeSuite + " |\n";
        }else{
            fiche += "|GrandeSuite  | 0 |\n";
        }
        if(this.yams != -1){
            fiche += "|Yams         | " + this.yams + " |\n";
        }else{
            fiche += "|Yams         | 0 |\n";
        }
        if(this.chance != -1){
            fiche += "|Chance       | " + this.chance + " |\n";
        }else{
            fiche += "|Chance       | 0 |\n";
        }

        fiche += "totalSuperieur | " + this.totalSuperieur + " |\n";
        fiche += "totalInferieur | " + this.totalInferieur + " |\n";
        fiche += "total          | " + this.total + " |\n";
        return fiche;
    }
}