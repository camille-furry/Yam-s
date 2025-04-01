package src;

class Des{
    int value;
    boolean isLocked;

    public Des(){
        this.value = 0;
        this.isLocked = false;
    }

     void reset(){
        this.value = 0;
        this.isLocked = false;
    }

    public void lock(){
        this.isLocked = true;
    }

    public void unlock(){
        this.isLocked = false;
    }

    public void roll(){
        if(!this.isLocked){
            this.value = (int)(Math.random() * 6) + 1;
        }
    }

    public String toString(){
        return this.value + "";
    }
}