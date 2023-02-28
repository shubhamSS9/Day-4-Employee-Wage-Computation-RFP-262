package com.Assignments;

public class UC3_EmployeeWagePartTime {
    int wagePerHour;
    int fullDayHour;
    int partTimeHour;

    public static void main(String[] args) {
        UC3_EmployeeWagePartTime dailyWage = new UC3_EmployeeWagePartTime();
        UC3_EmployeeWagePartTime partTime = new UC3_EmployeeWagePartTime();

        dailyWage.wagePerHour = 20;
        dailyWage.fullDayHour=16;

        partTime.partTimeHour=8;

        int calculate = (int)(dailyWage.wagePerHour * dailyWage.fullDayHour);
        System.out.println("The full time employee wage is :"+calculate+"rs");

        calculate = (int)(dailyWage.wagePerHour * partTime.partTimeHour);
        System.out.println("The part time employee wage is :"+calculate+"rs");
    }
}
