package com.bridgelab.emloyeeWage;

//UC-4 Employee daily wage using Switch case statement
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
        int workingHour=0;
        switch (empAttain){
            case 1:
                workingHour = 8;
                break;
            case 2:
                workingHour = 4;
                break;
            default:
        }
        int wage = workingHour * wagePerHr;

        System.out.println(" wage of employee: " +wage);
    }

    public static void main(String[] args) {
        System.out.println("Well come to Employee wage computation program");
        EmployeeWageComputation employee = new EmployeeWageComputation();
        int empAttain=employee.attaindance();
        employee.dailyWage(empAttain);
    }

}