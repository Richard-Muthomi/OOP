package db;

import java.sql.*;
public class dB {
   static Connection con;
    static Statement st;
   
    public static void main(String[] args) {
       try {
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "");
       st=con.createStatement();
       st.executeUpdate("insert into payroll(Emp_Name,Emp_Salary,Emp_ID) VALUES('YY',8.8,'KKK')");
       ResultSet rs= st.executeQuery("Select * from payroll");
       ResultSetMetaData rsmd=rs.getMetaData();
       int col=rsmd.getColumnCount();
       for(int i=1; i<=col; i++) {
           System.out.printf("%-8s\t",rsmd.getColumnName(i));
       }
       while(rs.next()){
           System.out.println("\n");
          for(int i=1;i<=col; i++) {
           System.out.printf("%-8s\t", rs.getObject(i));
       }
       }
       } catch(SQLException se) 
       {
           se.printStackTrace();
       }
    }
    
}
