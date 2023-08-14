package com.mycompany.Employee;

public class HourlyEmployee extends Employee 
{
  private double wage;
  private double hours;
  public HourlyEmployee(String fn,String ln,String ssno,double wg,double hr)
  {
      super(fn,ln,ssno);
  } 
  public double getwage()
  {
      return wage;
  }
  public void setwage(double wg)
  {
      wage=wg;
  }
  public double gethours()
  {
      return hours;
  }
   public void sethours(double hr)
  {
      hours=hr;
  }
  public double earnings()
  {
      return 1.1;
  }
  public String toString()
  {
      return String.format("%s %s %s Ksh%,.2f HOURS %,.2f",super.getfirstname(),super.getlastname(),super.getsocialsecurityno(),gethours(),getwage());
      
  }
}
