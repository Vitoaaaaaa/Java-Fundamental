package com.enigma;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        /*int i=0;
        while(i<=20){
             System.out.println("Hello "+i);
             i=i+1;
         }*/
        Scanner scanner = new Scanner(System.in);

        /*while (true){
            System.out.print("KATA KUNCI: ");
            String breakword = scanner.nextLine();
            if (breakword=="123456"){
                break;
            }
        }*/

        while (true){
            System.out.print("\n\nKata Kunci: ");
            String breakWord1 = scanner.nextLine();
            if (breakWord1.equals("12345")) {
                break;
            }
        }
    }
}
