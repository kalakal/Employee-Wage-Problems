package com.bridgelab.emloyeeWage;

//UC-7 Employee Monthly wage for 20 working days and 100 hours using class object and method.

public class EmployeeWageComputation {
    static int isFullTime = 1;
    static int isPartTime = 2;
    static int wagePerHr = 20;
    static int maxWorkDay = 20;
    static int maxWorkHr = 100;
    static int totalWorkingHour = 0;

    public void display() {
        System.out.println("Well come to Employee wage computation program");
    }

    public void monthWage() {
        int workingHour = 0;
        int totalWage = 0;
        for (int day = 1; day < maxWorkDay && totalWorkingHour < maxWorkHr; day++) {
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case 1:
                    workingHour = 8;
                    break;
                case 2:
                    workingHour = 4;
                    break;
                default:
            }
            totalWorkingHour = totalWorkingHour + workingHour;
            if (totalWorkingHour > maxWorkHr) {
                totalWorkingHour = maxWorkHr;
            }
        }

        totalWage = totalWorkingHour * wagePerHr;

        System.out
                .println("Monthly wage of employee: " + totalWage + "    Total  Working hour is: " + totalWorkingHour);
    }

    public static void main(String[] args) {
        EmployeeWageComputation employee = new EmployeeWageComputation();
        employee.display();
        employee.monthWage();
    }

}