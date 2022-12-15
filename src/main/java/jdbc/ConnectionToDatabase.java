package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionToDatabase {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginCred","root","Sureshsql@123");
		Statement st =  con.createStatement();
		ResultSet rs = st.executeQuery("select * from LoginData");
		
		while(rs.next()){
			System.out.println("Username : "+ rs.getString("uname"));
			System.out.println("Password : "+ rs.getString("pwd"));
		}
		
		con.close();

	}

}
