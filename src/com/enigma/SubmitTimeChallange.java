package com.enigma;

import java.util.Scanner;

public class SubmitTimeChallange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer submitTime = Integer.parseInt(scanner.nextLine());

        if (submitTime>=8 && submitTime<=17||false&&true){
            System.out.println("SUCCESS");
        }else {
            System.out.println("FAILED");
        }

        System.out.println(submitTime);

        /* int number = 4;
        System.out.println(number+3);
        System.out.println(number-3);

        number = number*3;
        System.out.println(number);*/

        /*System.out.println("Start");
        if (true){
            System.out.println("Dilalui");
        }
        System.out.println("Done");
        */

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " +name);


        System.out.print("Age: ");
        String ageInput = scanner.nextLine();
        Integer age = Integer.parseInt(ageInput);
        age = age+10;
        System.out.println("Your Age " +age);
        */

       /* Scanner scanner = new Scanner(System.in);

        System.out.print("name");
        String name = scanner.nextLine();
        System.out.println("Hi"+name);

        System.out.println("Deadline");
        String submitTime = scanner.nextLine();
        Integer submit = Integer.parseInt(submitTime);
        System.out.println("Your Submit time"+submit);

        if(submit<=8 && submit<=17){
            System.out.println("Sukses");
        }else{
            System.out.println("Failed");
        }*/
    }
}
