package com.enigma;

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println("========AND========"); //Salah satu kondisi tidak memenuhi maka false
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);

        System.out.println("=======OR========"); //Salah Satu kondisi memenuhi maka true
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false||false);

        System.out.println("========Negasi=========="); //Kebalikan Dari Nilai TSb
        System.out.println(!false);
        System.out.println(!true);
    }
}
