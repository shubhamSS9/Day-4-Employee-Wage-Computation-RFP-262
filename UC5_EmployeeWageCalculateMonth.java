package com.Assignments;
import java.util.Random;
public class UC5_EmployeeWageCalculateMonth {
    short wagePerHour;
    short fullDayHour;
    short partTimeHour;
    int workingDayMonth;
    public static void main(String arg[])
    {
        Random rand = new Random();

        int checkPresent=2;
        int intRandom=rand.nextInt(checkPresent);

        UC5_EmployeeWageCalculateMonth dailyWage = new UC5_EmployeeWageCalculateMonth();
        UC5_EmployeeWageCalculateMonth partTime = new UC5_EmployeeWageCalculateMonth();
        UC5_EmployeeWageCalculateMonth workingDay = new UC5_EmployeeWageCalculateMonth();

        dailyWage.wagePerHour = 20;
        dailyWage.fullDayHour= 16;

        partTime.partTimeHour=8;

        workingDay.workingDayMonth = 20;

        int calculateFullTime = (int)(dailyWage.wagePerHour * dailyWage.fullDayHour);
        System.out.println("The full time employee wage is :"+calculateFullTime+"rs");


        int calculatePartTime = (int)(dailyWage.wagePerHour * partTime.partTimeHour);
        System.out.println("The part time employee wage is :"+calculatePartTime+"rs");

        int calculateMonthwage=0;
        switch (intRandom){
            case 0:
                calculateMonthwage = (calculatePartTime * workingDay.workingDayMonth);
                System.out.println("The "+workingDay.workingDayMonth+" day employee part time wage is :"+calculateMonthwage+"rs");
                break;
            case 1:
                calculateMonthwage = (calculateFullTime * workingDay.workingDayMonth);
                System.out.println("The "+workingDay.workingDayMonth+" day employee full time wage is :"+calculateMonthwage+"rs");
                break;
        }
    }
}
