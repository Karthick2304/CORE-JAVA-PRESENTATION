package core_java_presentation;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.*;
public class Sql_java_connector {
	public static void main(String args[])
	{
	
	try
	{ 
		Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/karthick","root","@Karthick2304");
	Statement st=(Statement) con.createStatement();
	ResultSet rs=((java.sql.Statement) st).executeQuery("select * from prodt");
	while(rs.next())
	{
	System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	}
	}
	catch(Exception e)
	{
	System.out.println(e.toString());}

}
}
