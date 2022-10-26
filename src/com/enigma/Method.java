package com.enigma;

public class Method {
    public static void main(String[] args) {
        sum(8,10);

        //Integer result = multiply(7,8);
        //System.out.println(result);
        //multiply(7,8);
        System.out.println(multiply(7,8));

        System.out.println(greet("VITO AMA"));

        cetak10Kali();

    }

    public static void sum(Integer a, Integer b){
        System.out.println(a+b);
    }

    public static Integer multiply(Integer a, Integer b){
        //Integer result = a*b;
        //System.out.println(result);
        Integer result = a*b;
        //return a*b;
        return result;

    }

    public  static String greet(String name){
        return "Hello "+name;
    }

    public  static void cetak10Kali(){
        for (int i=0; i<=10; i++){
            if (i==6){
                return;
            }
            System.out.println(i);
        }

    }



}

