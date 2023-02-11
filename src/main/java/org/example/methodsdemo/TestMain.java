package org.example.methodsdemo;

import java.util.Scanner;


/*


  // calculator :

  use methods
  use if/else
  use for loop/ while / do while
  use switch case - mandatory


  MENU
  ******************
  Please choose the options :

  1. Addition
  2. Subtraction
  3. multiplication
  4. Division
  5. Modulus
  6. Exit

  Press 1 :

  Welcome to sum :
  Enter your first digit : 20
  Enter your second digit : 30
  the sum is : 50

  message : do you want to continue ? Y- yes N- No
  exit

  do{

  //task

  }while(untill user press N );

  Welcome to sum


  any other input : Invalid input  (red line)




  Switch (input){

  case 1:
       sum();
  break;


  ******************







 */
public class TestMain {

    public static void  sum(int num1, int num2){
        System.out.println("Addition");
        int sum = num1 + num2;
        System.out.println("Sum of two nos "+ sum);
    }
    public static void  mulitply(int num1, int num2){
        System.out.println("Mulitplication");
        int multiply = num1 * num2;
        System.out.println("Sum of two nos "+ multiply);
    }
    public static void  subtract(int num1, int num2){
        System.err.println("Subtraction");
        int sub = num1 - num2;
        System.out.println("Sum of two nos "+ sub);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // memory
        System.out.println("Enter the value of first Integer");
        int num1 = scanner.nextInt();

        System.out.println("Enter the value of first Integer");
        int num2 = scanner.nextInt();


       // sum(num1, num2);  // arguments
        System.out.println("_________");
        //mulitply(num1, num2);

        System.out.println("_________");
        subtract(num1, num2);

        // Paramaters and arguments

    }

}
