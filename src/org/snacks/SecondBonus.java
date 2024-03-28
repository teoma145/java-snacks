package org.snacks;

import java.util.Scanner;

public class SecondBonus {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Quanti secondi vuoi convertire");
        int secondi = scan.nextInt();
        int hours = secondi/(60*60);
        int secondiRimasti = secondi % (60*60);
        int minuti = secondiRimasti / 60;
        int secondiFinali = secondiRimasti % 60;
        System.out.println("tempo: "+hours+":"+minuti+":"+secondiFinali);


    }
}
