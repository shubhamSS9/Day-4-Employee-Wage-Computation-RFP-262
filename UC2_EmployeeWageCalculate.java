package com.Assignments;

public class UC2_EmployeeWageCalculate {
    int wagePerHour;
    int fullDayHour;

    public static void main(String[] args) {
        UC2_EmployeeWageCalculate dailyWage=new UC2_EmployeeWageCalculate();
        dailyWage.wagePerHour=20;
        dailyWage.fullDayHour=8;

        int calculate=(int)(dailyWage.wagePerHour*dailyWage.fullDayHour);
        System.out.println("The daily employee wage is :" +calculate);
    }
}
