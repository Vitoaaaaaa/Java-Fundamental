package com.enigma;

public class IntersectionChallange {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6};
        Integer[] anotherNumbers = {4, 5, 6, 7, 8, 9, 10};
        Integer[] anotherNumbers1 = {4,7,6,10};

        for (int i=0; i<numbers.length; i++){
            for (int a=0; a<anotherNumbers.length; a++){
                if (anotherNumbers[a]==numbers[i]){
                    System.out.println(numbers[i]+" <> "+anotherNumbers[a]);


                }
            }
        }

    }






}