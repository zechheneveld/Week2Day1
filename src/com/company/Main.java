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

        //New method will be used when adding method name
        //This allows for shorter coding
        addTwoNumbersAndPrint(answer1, answer2);
        addTwoNumbersAndPrint(100, 1002);

//        sayHello("Manny");
//        sayHello("Jake");
//        sayHello("Zech");
    }
    //inside the main curly braces (new method)
    //be descriptive what you want to accomplish
    // the () allows the values to be used

    public static void addTwoNumbersAndPrint(int value1, int value2) {
        System.out.println("value 1 is " + value1);
        System.out.println("value 2 is " + value2);

    }

    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }
}
