package com.mycompany.Employee;

public abstract class Employee 
{
    private String firstname;
    private String lastname;
    private String socialsecurityno;
    
    public Employee(String fn, String ln, String ssno){
}
public String getfirstname()
{
 return firstname;

}
public void setfirstname(String fn)
{
  firstname=fn;

}
public String getlastname()
{
  return lastname;
}
public void setlastname( String ln)
{
  lastname=ln;
  
}
public String getsocialsecurityno()
{
  return socialsecurityno;
}
public void setsocialsecurityno(String ssno)
{
  socialsecurityno=ssno;
}
public String toString()
{
  return String.format("%s",getfirstname());
}
public abstract double earnings();
public static void main(String[]args)
    {
        SalariedEmployee se= new SalariedEmployee("mdosi","boss","8888888",90000.00);
        se.setfirstname("Mdosi");
        se.setlastname("Boss");
        System.out.println("FIRST NAME: " + se.getfirstname());
        System.out.println("LAST NAME: " + se.getlastname());
        System.out.println("SALARY: " + se.getweeklysalary());
        se.setfirstname("Junior");
        System.out.println("FIRST NAME" + se.getfirstname());
        System.out.println("OBJECT STTRING" + se.toString());
        
    }

}
