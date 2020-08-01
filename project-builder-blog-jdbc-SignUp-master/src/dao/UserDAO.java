package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.LocalDate;
import model.String;
import model.User;

public class UserDAO
{
	interface UserDaoInterface
	{
		int signUp(User user)
		{
			User user = new User();
			
			String email = user.getEmail();
			String password = user.getPassword();
			LocalDate date; user.getDate();
			
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = null;
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Reset1998@");
			
			
			String sql = "insert into PROGRAD1(NAME,AGE,CITY)VALUES(?,?,?)";
			
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, email);
			st.setString(2, password);
			st.setLocalDate(3, date);
			
			st.executeUpdate();
			
			con.close();
		}
		boolean loginUser(User user)
		{
			
		}
	}
}


//1.Create a class called as UserDAO inside the dao package.
//2.Create a interface called  with the following methods.- int signUp(User user)- boolean loginUser(User user)
//.UserDAO should implement the UserDaoInterface.
//4.The signUp method is used to insert User details in the database.
//5.The loginUser method checks whether the user exists int the database or not.

