package com.mycompany.Account;

public class Account {
    
    double balance;
    int id;
    Account(double bl,int idno){
         balance=bl;
         id=idno;
    }

    public static void main(String[] args) {
        
        Account x= new Account(80000,123);
        System.out.println("Your balance is:" + x.balance);
        System.out.println("Your id number is:" + x.id);
        
    }
}
