package src.object;
import java.util.ArrayList;

public class DesList extends Des {
    private ArrayList<Des> desList;
    private int size;
    
    public DesList(int size) {
        this.size = size;
        this.desList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.desList.add(new Des());
        }
    }

    public int getValue(int values){
        int total = 0;
        for(int i = 0; i < this.size; i++){
            if(this.desList.get(i).value == values){
                total += this.desList.get(i).value;
            }
        }
        return total;
    }

    public int getSize() {
        return this.size;
    }

    public void roll() {
        for (Des d : this.desList) {
            d.roll();
        }
    }

    public void roll(int index) {
        if (index >= 0 && index < this.size) {
            this.desList.get(index).roll();
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void lock(int index) {
        if (index >= 0 && index < this.size) {
            this.desList.get(index).lock();
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public void unlock(int index) {
        if (index >= 0 && index < this.size) {
            this.desList.get(index).unlock();
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Des d : this.desList) {
            result.append(d.toString()).append(" ");
        }
        return result.toString().trim();
    }
}
