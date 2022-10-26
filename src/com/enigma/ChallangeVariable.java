package com.enigma;

public class ChallangeVariable {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int c = b;
        c = b;
        a = c;

        /*
        a=a+6;
        b=b-6;
        */

        System.out.printf("%d - %d\n",a,b);
        System.out.printf("Nama Saya Adalah %s \n","umur saya adalah %d tahun","vito",24);
    }
}
