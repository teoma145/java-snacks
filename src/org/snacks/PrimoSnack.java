package org.snacks;

import java.util.Scanner;

public class PrimoSnack {
    public static void main(String[] args) {


    Scanner scan= new Scanner(System.in);
    int UserNumber;
    boolean Iseven=false;

    while (Iseven == false){
        System.out.print("Dammi un numero ");
        UserNumber = scan.nextInt();
        if (UserNumber >10 && UserNumber<20 && UserNumber %2 == 0){
            Iseven=true;
            System.out.println("Il numero è pari e compreso tra 10 e 20");
        }
        else{
            System.out.println("Il numero non è pari o non compreso tra 10 e 20,riprova");
        }
    }
    }
}
