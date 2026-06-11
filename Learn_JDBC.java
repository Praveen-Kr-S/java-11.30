package DB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Learn_JDBC {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/apple_tech";
		String user = "root";
		String password = "root";
		
		
		Connection c = DriverManager.getConnection(url,user,password);
//		PreparedStatement ps = c.prepareStatement("create database apple_tech");
//		PreparedStatement ps = c.prepareStatement("create table staff(name varchar(50),age int,dept varchar(50))");
//		PreparedStatement ps = c.prepareStatement("insert into staff values('Kishore',24,'Benglur')");
//		PreparedStatement ps = c.prepareStatement("insert into staff values('Vasanth',23,'IT')");
//		PreparedStatement ps = c.prepareStatement("update staff set name='Dhanush Sharan' where name = 'Dhanush'");
//		PreparedStatement ps = c.prepareStatement("delete from staff where age=25 ");
		
//		modify the columns in table
//		PreparedStatement ps = c.prepareStatement("alter table staff add column salary int");
		PreparedStatement ps = c.prepareStatement("alter table staff drop column salary");
	
		ps.execute();
		ps.close();
		
		System.out.println("New Column remove..!!!");


	}

}
