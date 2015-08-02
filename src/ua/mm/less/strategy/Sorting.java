package ua.mm.less.strategy;

/**
 * Created by Maxim on 29.07.2015.
 */
public class Sorting {

    private Operation operation = null;

    public Sorting(int op) {
        switch (op) {
            case 1: this.operation = new SortedByMax();
                break;
            case 2: this.operation = new SortedByMin();
                break;
        }
    }
    public void sorting(int [] massiv){
        if(this.operation!=null){
            operation.sort(massiv);
        }
        else
            return;
    }
}
