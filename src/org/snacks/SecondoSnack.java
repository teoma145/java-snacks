package org.snacks;

import java.util.Random;

public class SecondoSnack {
    public static void main(String[] args) {
        String[] nomi={"Rossi","Verdi","Neri","Strong"};
        String[] cognomi= {"Matteo","Marco","Mirko","Mattia"};
        Random randomGenerator = new Random();
         int RandomIndexname = randomGenerator.nextInt(nomi.length);
        int RandomIndexsurname = randomGenerator.nextInt(cognomi.length);
        String randomName = nomi[RandomIndexname];
        String randomSurname = cognomi[RandomIndexsurname];
        System.out.println(randomName +" " + randomSurname);

    }
}
