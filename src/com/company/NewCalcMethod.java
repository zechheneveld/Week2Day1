package com.company;

import java.util.Scanner;

public class NewCalcMethod {
    public static void main(String[] args) {
        Boolean ask = true;
        Scanner sc = new Scanner(System.in);

        while(ask){


            System.out.println("Input First Number:");
            String firstNumber = sc.nextLine();

            System.out.println("Input one of the following valid operators: +, -, *, / :");
            String operator = sc.nextLine();

            System.out.println("Input Second Number:");
            String secondNumber = sc.nextLine();

//            int intFirst = Integer.parseInt(firstNumber);
//            int intSecond = Integer.parseInt(secondNumber);
//            int intResult = 0;
            //Double allows a decimal to be used to find
            double intFirst = Double.parseDouble(firstNumber);
            double intSecond = Double.parseDouble(secondNumber);
            double intResult = 0.0;

            if (operator.equals("+") || operator.equals("add")) {
                intResult = add(intFirst, intSecond);
            } else if (operator.equals("-") || operator.equals("subtract")) {
                intResult = subtract(intFirst, intSecond);
            } else if (operator.equals("*") || operator.equals("multiply")) {
                intResult = multiply(intFirst, intSecond);
            } else if (operator.equals("/") || operator.equals("divide")) {
                intResult = divide(intFirst, intSecond);


            }

            System.out.println("Your number is: " + intResult);
            System.out.println("Would you like to try again?");
            String userResponse = sc.nextLine();

            if(userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y")){
                ask = true;

            } else {
                ask = false;
            }
        }System.out.println("Have a nice day!");

    }
    //Adding Method
    public static double add(double intFirst, double intSecond){
        double intResult = intFirst + intSecond;
        return intResult;
    }
    //Subtracting Method
    public static double subtract(double intFirst, double intSecond){
        double intResult = intFirst - intSecond;
        return intResult;
    }
    //Multiplying Method
    public static double multiply(double intFirst, double intSecond){
        double intResult = intFirst * intSecond;
        return intResult;
    }
    //Dividing Method
    public static double divide(double intFirst, double intSecond){
        double intResult = intFirst / intSecond;
        return intResult;
    }
}

