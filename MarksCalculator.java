package com.mycompany.markscalculator;

import java.util.Scanner;
public class MarksCalculator {

    public static void main(String[] args) {
        
        int[] catm = new int[1];
        int[] assignm = new int[1];

        Scanner scanner = new Scanner(System.in);

        // Input CAT marks
        System.out.print("Enter CAT marks (out of 50): ");
        catm[0] = scanner.nextInt();

        // Input assignment marks
        System.out.print("Enter assignment marks (out of 50): ");
        assignm[0] = scanner.nextInt();

        scanner.close();

        // Calculate total marks
        int totalMarks = catm[0] + assignm[0];

        // Display the result
        System.out.println("Total marks: " + totalMarks);
    }
}

    

