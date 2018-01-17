package com.company;


import java.util.Scanner;

public class Week2Day2 {

    public static void main(String[] args) {
        //Learning about classes
        //classes allow us to separate people into different groups (methods and fields)
        // field ex. age, weight, height
        // method ex. walk, eat, sleep
        //finding information- find scott's height and ...
        Person ted = new Person("Ted",30, 1200);
        Person zech = new Person("Zech", 50, 6000);
        Person joan = new Person("Joan", 25, 3000);

        zech.sleep();

        //example of private class
//        System.out.println(
//                zech.name + " " +
//                zech.age + " " +
//                zech.salary
//        );

//          Old way to printing out example
//        System.out.println(joan.name + " has a salary at age " + joan.age + " of " + joan.salary);
    }

}
