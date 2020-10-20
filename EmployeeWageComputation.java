package com.computation;

public class EmployeeWageComputation {
    	public static final int isPartTime=1;
    	public static final int isFullTime=2;
    	public static final int empRatePerHr=20;
    
	public static void main(String args[]){

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");
        //Using Switch case
        int EmpWage=0;
        int empHrs=0;

        int EmpCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (EmpCheck) {
            case isPartTime:
                System.out.println("PartTime Emp Wage:");
                empHrs = 4;
                break;

            case isFullTime:
                System.out.println("Fulltime Emp Wage:");
                empHrs = 8;
                break;

            default:
                empHrs = 0;
        }

     	EmpWage=empRatePerHr*empHrs ;
        System.out.println("Emp Wage: " + EmpWage);

    }

}
