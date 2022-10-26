package com.enigma;

public class Conditional {
    public static void main(String[] args) {
        System.out.println("START");

        Integer point = 80;
        String grade = "";

        if (point>=90 && point<=100){
            //System.out.println("A");
            grade = "A";
        } else if (point>=80) {
            //System.out.println("B");
            grade = "B";
        } else if (point>=75) {
            //System.out.println("C");
            grade = "C";
        } else if (point>=65) {
            //System.out.println("D");
            grade = "D";
        } else{
            //System.out.println("E");
            grade = "E";
        }

        System.out.println("POINT " +point);
        System.out.println("GRADE " +grade);

        System.out.println("DONE");

        /*
        System.out.println("START");
       if(false){
           System.out.println("DILALUI");
       }else {
           System.out.println("DILALUI JIKA GAGAL");
       }
        System.out.println("DONE");
        */

         /*Scanner scanner = new Scanner(System.in);

        System.out.print("Name");
        String name = scanner.nextLine();
        System.out.println("Name"+name);

        System.out.print("Age");
        Integer age = Integer.valueOf(scanner.nextLine());
        System.out.println("MANDIRI " +age);

        if (age>35 && age<40){
            System.out.println("Dewasa");
        } else if (age>20 && age<35) {
            System.out.println("Remaja");
        }else {
            System.out.println("Tidak ada jawaban");
        }*/

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("name");
//        String name = scanner.nextLine();
//        System.out.println("Hi"+name);
//
//        System.out.println("Deadline");
//        String submitTime = scanner.nextLine();
//        Integer submit = Integer.parseInt(submitTime);
//        System.out.println("Your Submit time"+submit);
//
//        if(submit<=8 && submit<=17){
//            System.out.println("Sukses");
//        }else{
//            System.out.println("Failed");
//        }
    }
}
