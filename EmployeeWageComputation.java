package com.computation;

public class EmployeeWageComputation {

    public static void main(String args[]){

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");

        //Part Time Wage Of Employee
        int isPartTime=1;
        int isFullTime=2;
        int empRatePerHr=20;
        int EmpWage=0;
        int empHrs=0;

        double randomCheck = Math.floor(Math.random() * 10) % 3;
        if(isPartTime == randomCheck)
                empHrs=4;

     	else if(isFullTime == randomCheck)
                empHrs=8;
     	else
     	        empHrs=0;

     	EmpWage=empRatePerHr*empHrs ;
        System.out.println("Emp Wage: " + EmpWage);

    }

}
