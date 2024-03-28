package org.snacks;

import java.util.Scanner;

public class FirstBonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci una stringa");
        String String = scan.nextLine().replaceAll(" ", "");
        int alfabeto = 0;
        int numeri = 0;
        int noalfanumero = 0;
        for (int i = 0; i < String.length(); i++) {
            char currentchar = String.charAt(i);
            if((currentchar >= 'a' && currentchar <='z')||( currentchar >= 'A' && currentchar <='Z')){
               alfabeto++;
            }
            else if (currentchar >= '0' && currentchar <='9'){
                numeri++;
            }else{
                noalfanumero++;
            }

        }
        System.out.println("contiene "+ alfabeto + " caratteri alfabetici,  "+ numeri + " numeri  " + noalfanumero +
                " valori non alfanumerici");
    }
}
