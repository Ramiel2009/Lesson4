package ua.mm.less.strategy;

/**
 * Created by Maxim on 29.07.2015.
 */
public class Main {
    public static void main (String args[]){
        int[] a ={6,2,20};
        Sorting sort1 = new Sorting(1);
        Sorting sort2 = new Sorting(2);
        sort1.sorting(a);
        sort2.sorting(a);
    }
}
