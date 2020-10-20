package com.computation;

public class EmployeeWageComputation {
    	public static final int isPartTime=1;
    	public static final int isFullTime=2;
    	public static final int empRatePerHr=20;
        public static final int noOfWorkingDays=2;
        public static final int MaxHrsInMonth = 10;

        public static void main(String args[]){

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");

        int empHrs=0;
        int TotalEmpHrs=0;
        int TotalEmpWage=0;
        int totalWorkingDays=0;

        while (TotalEmpHrs <= MaxHrsInMonth && totalWorkingDays < noOfWorkingDays){

        int EmpCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (EmpCheck) 
	    {
            
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

                TotalEmpHrs = TotalEmpHrs+empHrs;
                System.out.println("Total Employee Hours:" +TotalEmpHrs);
          
	 }
       	
		TotalEmpWage = empRatePerHr * TotalEmpHrs;
	    	System.out.println("Total Emp Wage: " + TotalEmpWage);


        }

}
