package com.company;

public class Employee {

    String firstName;
    String lastName;
    int employeeNumber;
    int employeeSalary;

    public Employee(String firstName, String lastName, int convertedId, int convertedSalary){

        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = convertedId;
        this.employeeSalary = convertedSalary;

    }

}
