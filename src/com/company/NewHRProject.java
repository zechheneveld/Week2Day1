package com.company;

import java.util.Scanner;

public class NewHRProject {
    public static void main(String[] args) {

        System.out.println("Welcome to Happy Employee System. We provide the salary information for each employee based on specific information entered by that employee.");

        Boolean ask = true;
        while (ask) {

            //Store these questions in an Array, and use a loop to ask the user each question.
            //Use another array to store the user responses.
            String[] prompt = {"Please enter employee first name", "Please enter employee last name", "Please enter employee number", "Please enter employee annual salary"};
            String[] inputInformation = {"", "", "", "",};

            int i = 0;
            while (i < prompt.length) {
                System.out.println(prompt[i]);
                Scanner robot = new Scanner(System.in);
                inputInformation[i] = robot.nextLine();
                i++;

            }

//        System.out.println(prompt[0]);
//
//        Scanner robot = new Scanner(System.in);
//
//        inputInformation[0] = robot.nextLine();
//
//        System.out.println(prompt[1]);
//
//        inputInformation[1] = robot.nextLine();
//
//        System.out.println(prompt [2]);
//
//        inputInformation[2] = robot.nextLine();
//
//        System.out.println(prompt [3]);
//
//        inputInformation[3] = robot.nextLine();

            int convertedId = Integer.parseInt((inputInformation[2]));
            int convertedSalary = Integer.parseInt(inputInformation[3]);

            Employee newEmp = new Employee(inputInformation[0], inputInformation[1], convertedId, convertedSalary);

            int Month = 12;
            int bimonth = 24;
            int biweek = 26;

            System.out.println("Monthly Pay: " + convertedSalary / Month);
            System.out.println("BiMonthly Pay: " + convertedSalary / bimonth);
            System.out.println("Biweekly Pay: " + convertedSalary / biweek);

            System.out.println("Would you like to view another employee's salary?");

            Scanner robot2 = new Scanner(System.in);

            String answerByUser = robot2.nextLine();

            //Research how to have multiple conditions, specifically the 'or' operator. Then use that information,
            //to handle the case of 'YES', 'y', and 'Yes'.

            if (answerByUser.equalsIgnoreCase("yes") || answerByUser.equalsIgnoreCase("y") || answerByUser.equalsIgnoreCase("ya")) {
                ask = true;
            } else {
                ask = false;
            }


        }
    }
}
