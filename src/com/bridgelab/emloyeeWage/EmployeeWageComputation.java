package com.bridgelab.emloyeeWage;

//UC-5 Employee Monthly wage for 20 working days
public class EmployeeWageComputation {
    static int isFullTime = 1;
    static int isPartTime = 2;
    static int wagePerHr = 20;
    static int maxWorkDay =20;

    public void display() {
        System.out.println("Well come to Employee wage computation program");
    }


    public void monthWage() {
        int workingHour = 0;
        int totalWage=0;
        int totalWorkingHour=0;
        for (int day = 1; day<=maxWorkDay; day++) {
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
            int wage = workingHour * wagePerHr;
            totalWage = totalWage + wage;
        }
        System.out.println("Monthly wage of employee: " + totalWage+ "    Total  Working hour is: " +totalWorkingHour);
    }

    public static void main(String[] args) {
        EmployeeWageComputation employee = new EmployeeWageComputation();
        employee.display();
        employee.monthWage();
    }

}