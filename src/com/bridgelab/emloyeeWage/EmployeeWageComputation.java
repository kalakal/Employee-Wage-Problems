package com.bridgelab.emloyeeWage;

public class EmployeeWageComputation {

    static int isFullTime=1;
    public void attaindance() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isFullTime)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
    public static void main(String[] args) {
        System.out.println("Well come to Employee wage computation program");
        EmployeeWageComputation employee = new EmployeeWageComputation();
        employee.attaindance();
    }

}
