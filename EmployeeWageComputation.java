package com.computation;

public class EmployeeWageComputation {

    public static void main(String args[]){

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");

	 //TO check employee is present or absent
        int IS_FULL_TIME = 1;
        double empStatus = Math.floor(Math.random() * 10) % 2;
        System.out.println(empStatus); //random value stored in empStatus;

        if (empStatus == IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");


       
    }

}
