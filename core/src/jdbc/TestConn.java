package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConn {

	static Connection getcon()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testcon", "root","");
			if(con!=null)
			{
				System.out.println("connected");
			}
			else
			{
				System.out.println("not connected");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		getcon();
	}

}
