package com.bridgelab.emloyeeWage;

public class EmployeeWageComputation {

    static int isFullTime = 1;
    static int wagePerHr =20;
    private String dailyWage;


    public int attaindance() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isFullTime)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
        return (int) empCheck;
    }
    public void dailyWage(int empStatus) {
        if (empStatus == isFullTime){
            int workingHour=8;
            int dailyWage= wagePerHr*workingHour;
            System.out.println("Employee daily wage : " +dailyWage);
        }
        else {
            int workingHour = 0;
            int dailyWage = wagePerHr*workingHour;

            System.out.println("Employee daily wage : " +dailyWage);
        }
    }

    public static void main(String[] args) {
        System.out.println("Well come to Employee wage computation program");
        EmployeeWageComputation employee = new EmployeeWageComputation();
        int empStatus=employee.attaindance();
        employee.dailyWage(empStatus);
    }

}
