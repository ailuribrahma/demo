package mysqltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class MysqlCon{
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://192.168.15.6:3306/salesdb","dba","NANI3xyz#");  

Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from customer");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  