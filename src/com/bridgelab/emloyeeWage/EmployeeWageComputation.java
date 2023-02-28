package com.bridgelab.emloyeeWage;

public class EmployeeWageComputation {
    static int isFullTime = 1;
    static int isPartTime =2;
    static int wagePerHr =20;
    private String dailyWage;


    public int attaindance() {
        double empAttain = Math.floor(Math.random() * 10) % 3;
        if (empAttain == isFullTime)
            System.out.println("Employee is Full time Present");
        else if (empAttain == isPartTime)
            System.out.println("Employee is Part time Present");
        else
            System.out.println("Employee is Absent");
        return (int) empAttain;
    }
    public void dailyWage(int empAttain) {

        if (empAttain == isFullTime){
            int workingHour=8;
            int dailyWage= wagePerHr*workingHour;
            System.out.println("Employee daily wage : " +dailyWage);
        }
        else if (empAttain == isPartTime){
            int workingHour=4;
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
        int empAttain=employee.attaindance();
        employee.dailyWage(empAttain);
    }

}