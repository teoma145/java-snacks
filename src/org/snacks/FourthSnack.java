package org.snacks;

import java.util.Scanner;

public class FourthSnack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dimmi una parola e verifico se è palindroma");
        boolean isPalindroma = false;
        String Parola = scan.nextLine();
        for (int i = 0; i <Parola.length() / 2 ; i++) {
            if(Parola.charAt(i) == Parola.charAt(Parola.length()-i-1)){
                isPalindroma=true;
                break;
        }

        }
        if (isPalindroma == true){
            System.out.println("Palindroma si");

        }else{
            System.out.println("Palindroma no");
        }
    }
}
