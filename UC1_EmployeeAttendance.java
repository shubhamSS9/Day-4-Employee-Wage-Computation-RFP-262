package com.Assignments;
import java.util.Random;
public class UC1_EmployeeAttendance {
    public static void main(String[] args) {
        Random r=new Random();

        int checkPresent=2;
        int intRandom=r.nextInt(checkPresent);

        if(intRandom==1)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is absent");
        }
    }
}
