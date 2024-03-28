package org.snacks;

public class ThirdSnack {
    public static void main(String[] args) {
        int[] Numbers={ 1,2,3,4,5};
        int Somma = 0;
        for (int i = 0; i < Numbers.length; i++) {
            if(i % 2 !=0){
                Somma += Numbers[i];
            }
        }
        System.out.println("numero sommato: " + Somma);
    }
}
