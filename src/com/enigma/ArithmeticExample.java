package com.enigma;

public class ArithmeticExample {
    public static void main(String[] args) {
        Integer result1=4*5+5;
        Double resultDouble = result1.doubleValue();
        System.out.println(resultDouble);
        System.out.println(result1);

        Integer a=30;
        Integer b=10;
        Double result = a.doubleValue()/b.doubleValue();
        System.out.println(result);

        Float c = 7.0f;
        Float d = 2.0f;

        System.out.println(c/d);

        Float piFloat = 22.0f/7.0f;
        Double piDouble = 22.0/7.0;
        System.out.println(piFloat);
        System.out.println(piDouble);
    }
}
