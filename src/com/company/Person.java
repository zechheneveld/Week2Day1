package com.company;
//Notes:
// Public allows main to use functions from other public classes whenever it wants
// Like starting a car, you don't want the car to continue to try to start when already started...
//Private prevents main to accuse information from other classes

public class Person {
    //member fields

    String name;
    int age;
    //example of private class
    private double salary;

    //setup for a class file
    public Person(String name, int age, double salary){
        //constructor method
        //"this." connects whatever is entered to the top values
        //"this." is used when inside a method
        this.name = name;
        this.age = age;
        this.salary = salary;

//        System.out.println("Person was created!");
//          This is print three because of the 3 names entered
    }
    public void sleep(){
        String name = "Cats";
        System.out.println("Ok " + name + ", going to bed!");
        //this will grab "Cats" instead of the real name
        System.out.println("Ok " + this.name + ", going to bed!");
        //this will grad the defined name because of the function "this.name"
        //"this." is cleaner to use when writing code
    }
}
