package day03_variables;

import java.security.spec.RSAOtherPrimeInfo;

public class EmployeeInfo {
    /*
    2. Declarethefollowingvariableswithappropriatedatatypes:
1. name
2. age
3. gender
4. companyName 5. employeeId
6. jobTitle
7. salary
8. isFullTime
     */
    public static void main(String[] args) {

        String employeeName = "Gulustan";

        System.out.println(employeeName);

        int age = 35;
        System.out.println(age);

        char gender = 'M';
        System.out.println(gender);

        String companyName = "Abbott",
                employeeId = "A19",
                jobTitle = "Scientist";

        int salary = 120000;
        boolean isFullTime = true;


        System.out.println(companyName);
        System.out.println(employeeId);
        System.out.println(jobTitle);
        System.out.println(salary);
        System.out.println(isFullTime);

        System.out.println("______________");

        //shortcut soutv + Enter

        System.out.println("employeeName = " + employeeName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("employeeId = " + employeeId);
        System.out.println("companyName = " + companyName);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);










    }
     }