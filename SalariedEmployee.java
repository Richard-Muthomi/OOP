package com.mycompany.Employee;

public class SalariedEmployee extends Employee {
    private double weeklysalary;
    public SalariedEmployee(String fn,String ln,String ssno,double wsal)
    {
        super(fn,ln,ssno);
        weeklysalary=wsal;
    
    }
    public void setweeklysalary(double wsal)
    {
        weeklysalary=wsal;
    
    }
    public double getweeklysalary()
    {
        return weeklysalary;
    
    }
    public double earnings()
    {
        return getweeklysalary();
    }
    public String toString()
    {
        return String.format("%s %s %s $%2f","FIRST NAME",super.getfirstname(),"WEEKLYSALARY",getweeklysalary());
    }
    
}
