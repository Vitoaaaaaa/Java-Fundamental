package com.enigma;

public class PrimitiveDataType {
    public static void main(String[] args) {
        int number= 40000000;
        System.out.println(number*3);
        System.out.println(number/3);
        System.out.println(number+3);
        System.out.println(number-3);

        number=number+3;
        System.out.println(number);

        short number2=1000;
        long number3 =1000000000;

        System.out.println(number+number2+number3);
        int hasil = number+number2;

        float pi=3.14f;
        double anotherPi=3.14;
        boolean lessThan=false;
        char cityCode = '8';
    }
}
