package com.mycompany.multiplicationtable;

public class Multiplicationtable {

    public static void main(String[] args) {
        int size = 10;

        // Display the table header
        System.out.print("   ");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // Display table rows
        for (int i = 1; i <= size; i++) {
            System.out.printf("%3d", i);
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}

    

