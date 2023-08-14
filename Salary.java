

package com.mycompany.salary;
import java.util.Scanner;


public class Salary {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        int salary = scanner.nextInt();

        if (salary >= 1000000) {
            System.out.println("Salary in millions");
        } else if (salary >= 100000) {
            System.out.println("Salary in hundred thousands");
        } else if (salary >= 1000) {
            System.out.println("Salary in thousands");
        } else if (salary >= 100) {
            System.out.println("Salary in hundreds");
        } else if (salary >= 10) {
            System.out.println("Salary in tens");
        } else {
            System.out.println("Salary in ones and less");
        }
    }
}


