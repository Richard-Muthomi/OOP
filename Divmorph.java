package com.mycompany.divmorph;

public class Divmorph {

    public static void main(String[] args) {
        div(8.2,4.2);
       div(10,2);
       div(20,3.5);
       div(40.5,5);
    }
    public static void div(double a, double b)
    {
        double x=a/b;
        System.out.println("The div is:" + x);
    
    }
    public static void div(int a, int b)
    {
      
        int x=a/b;
        System.out.println("The div is:" + x);
    
    }
    public static void div(int a, double b)
    {
        double x=a/b;
        System.out.println("The div is:" + x);
    
    }
    public static void div(double a, int b)
    {
        double x=a/b;
        System.out.println("The div is:" + x);
    
    }
  
}

