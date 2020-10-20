package com.computation;

public class EmployeeWageComputation {

    public static void main(String args[]){

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");

        //Daily Wage Of Employee
        int isPresent=1;
        int empRatePerHr=20;
        int EmpWage=0;
        int empHrs=0;

        double randomCheck = Math.floor(Math.random() * 10) % 2;
        if(isPresent == randomCheck)
                empHrs=8;
     	else
                empHrs=0;

     	EmpWage=empRatePerHr*empHrs ;
        System.out.println("Emp Wage: " + EmpWage);
    }

}
