package com.enigma;

public class SwitchCaseExample {
    public static void main(String[] args) {

        Integer dayNumber=4;

        switch (dayNumber){
            case 1: {
                System.out.printf("Monday");
                break;
            }

            case 2:{
                System.out.println("Tuesday");
                break;
            }

            case 3:{
                System.out.println("Wednesday");
                break;
            }

            case 4:{
                System.out.println("Thursday");
                break;
            }
            default:{
                System.out.println("Tidak ada Case");
            }

        }

        String nationalCode = "INA";

        switch (nationalCode){
            case "INA":{
                System.out.println("Halo");
                break;
            }

            case "KOR":{
                System.out.println("ANYONGMASEO");
                break;
            }

            case "RRC":{
                System.out.println("NIHAO MA");
                break;
            }

        }

    }
}
