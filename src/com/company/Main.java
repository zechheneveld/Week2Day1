package com.company;

public class Main {

    public static void main(String[] args) {
//This page focuses on Methods

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        int answer1 = a + b;
        System.out.println("Answer " + answer1);
        int answer2 = c + d;
        System.out.println("Answer " + answer2);
        //System.out.println("Answers: " + answer1 + " " + answer2);
//        sayHello("Manny");
//        sayHello("Jake");
//        sayHello("Zech");
        //New method will be used when adding method name
        //This allows for shorter coding
        addTwoNumbersAndPrint(a, b);
        addTwoNumbersAndPrint(answer1, answer2);
        sayHello("Ted");

        int newValue = addTwoNumbersAndDivideByTwo(10, 30);
        //This allows newValue to equal and to be stored as 20 for future usage
        System.out.println("The division is: " + newValue);
    }
                //int allows other methods to use this formula
    public static int addTwoNumbersAndDivideByTwo(int value3, int value4){
       int newSum = value3 + value4;
        int divTwo = newSum / 2;
        //"return function" sends calculated number back into 'addTwoNumberAndDivideByTwo'
        //'Return' exits the method and will not print anything after
        return divTwo;

    }
    //inside the main curly braces (new method)
    //be descriptive with what you want to accomplish
    // the () allows the values to be used
    //this whole psv is called a method signature
    public static void addTwoNumbersAndPrint(int value1, int value2) {

        //takes whatever value is entered and adds them
        int sum = value1 + value2;

        System.out.println("The sume is: " + sum);

    }

    public static void sayHello(String name){
        System.out.println("Hello, " + name);
    }
}
