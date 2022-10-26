package com.enigma;

import java.util.Arrays;
import java.util.Scanner;

public class BambooChalangge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Banyak Bamboo: ");
        Integer size = Integer.parseInt(scanner.nextLine());

        String [] names = new String[size];
        for (int i=0; i<size; i++){
            System.out.println("Masukkan Jumlah Bamboo :  ");
            names[i] = scanner.nextLine();
        }

        System.out.println(Arrays.asList(names));
        System.out.println("cuts: ");
        Integer cuts= Integer.parseInt(scanner.nextLine());
        System.out.println(cuts);



    }
}
