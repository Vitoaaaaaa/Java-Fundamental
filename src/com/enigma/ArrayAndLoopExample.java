package com.enigma;

import java.util.Arrays;

public class ArrayAndLoopExample {
    public static void main(String[] args) {


       /* String[] cars = {"Toyota","Hyundai","Daihatsu"};
        for (int i = 0; i<=2; i++){
            System.out.println("The Car of \n\n"+cars[i]);
        }*/

        Integer [] numbers = {3,5,1,8,33};
        System.out.println(Arrays.asList(numbers));
        System.out.println(numbers.length);
        for (int a =0; a<=numbers.length; a++){
            numbers[a] = (numbers[a]*2);
        }
        System.out.println(Arrays.asList(numbers));

    }
}
