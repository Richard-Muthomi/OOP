package com.mycompany.extendinheri;

public class Extendinheri extends SavingsAccount {

    public static void main(String[] args) {
        System.out.println("Hello World!From super class");
        SavingsAccount sa= new SavingsAccount();
        System.out.println("Balance is:" + sa.amount());
    }
}
