package com.bridgelab.emloyeeWage;

import java.util.Scanner;

//UC-8 Employee monthly salary for multiple company.

public class EmployeeWageComputation {
    public static void wage(String companyName, int WAGE_PER_HR, int MAX_WORKING_DAYS, int MAX_WORKING_HRS) {
        final int PART_TIME = 1;
        final int FULL_TIME = 2;

        int totalWage = 0;
        int workingHrs = 0;
        for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
                && totalWorkingHrs < MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs) {

            int empType = (int) (Math.random() * 100) % 3;
            switch (empType) {
                case FULL_TIME:
                    workingHrs = 8;
                    break;
                case PART_TIME:
                    workingHrs = 4;
                    break;
                default:
                    workingHrs = 0;
                    break;
            }
            int wage = workingHrs * WAGE_PER_HR;
            totalWage += wage;
        }
        System.out.println("Total wage of  " + companyName + "  for a month is  " + totalWage);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of company");
        int numOfComp = sc.nextInt();
        for (int i = 1; i <= numOfComp; i++) {
            System.out.println("Enter company details");
            System.out.println("Enter company name");
            String compName = sc.next();
            System.out.println("Enter Wage per hour for : " + compName);
            int WagePerHr = sc.nextInt();
            System.out.println("Enter maximum working day for : " + compName);
            int maxWorkDay = sc.nextInt();
            System.out.println("Enter maximum working hour for  : " + compName);
            int maxWorkHr = sc.nextInt();
            wage(compName, WagePerHr, maxWorkDay, maxWorkHr);
        }
    }
}