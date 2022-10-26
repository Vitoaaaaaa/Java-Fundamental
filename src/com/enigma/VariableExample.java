package com.enigma;

public class VariableExample {
    public static void main(String[] args) {
        //Assignment
        String name = "Vito";
        System.out.println(name);

        //Reassignment
        name="Bruce";
        System.out.println(name);

        //String Selalu Concat
        String age = "24";
        System.out.println(age+20);

        //Pass by value = memindahkan nilai ke tipe data terbaru
        String name2=name;
        System.out.println("Hello"+name2);

        name = "Clark";
        System.out.println(name);
        System.out.println(name2);


    }
}
