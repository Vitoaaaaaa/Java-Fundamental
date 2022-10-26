package com.enigma;

public class ForLoopExample {
    public static void main(String[] args) {
        /*System.out.println("START");

        for (int i=0; i<10; i++){
            System.out.println("Halo Apa Kabar?"+i);
        }

        System.out.println("DONE");
        */

        System.out.println("START");

        for (int i=1; i<=8; i++){
            if (i==5||i==2||i==3){
                continue;
            }
            System.out.println("Hello "+i);
        }

        System.out.println("DONE\n");

        System.out.println("SECOND START ");
        for (int i=10; i>=0; i--){
            if (i==5){
                continue;
            }
            System.out.println("Hello World "+i);
        }
        System.out.println("FINISHED\n\n");

        for (int i=1; i<=10; i++){
            if (i==5){
                continue;
            }
            System.out.print(i+" -> ");
            for (int j=1; j<=10; j++){
                if (j==6){
                    continue;
                }
                System.out.print(j+" ");

            }
            System.out.println();
        }


        /*
        int umur = 9;
        for(int a=0; a<10; a++){
            if (umur>=10 && umur<=20){
                System.out.println("Dewasa"+a+umur);
            }
            System.out.println("Dewasa"+umur+a);
        }*/


    }
}
