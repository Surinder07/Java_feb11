package org.example.methodsdemo;

import java.util.Scanner;

public class Calculator {

    public static void sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the first Number ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("sum of two nos : " + sum);
    }

    public static void sub(){
        // int sub = num1 - num2;
    }

    public static void main(String[] args) {

        System.out.println("**********************");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divison");
        System.out.println("5. Modulus");
        System.out.println("0. Exit");
        System.out.println("**********************");
        System.out.println("Please enter your choice");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();



        switch (input){
            case 1:
                sum();
                break;


            case 2:
                // sub();
                break;


            case 3:
                break;


            case 4:
                break;

            case 5:

                break;
            case 0:
                System.out.println("Exiting out of menu..");
//                System.exit(0);
                break;

            default:
                System.err.println("Invalid input");

                break;
        }
    }
}
