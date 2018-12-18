package Thread;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConnectionPooling {
	private static List<Connection> availableConnection = new ArrayList<Connection>();
	private static List<Connection> usedConnection = new ArrayList<Connection>();
	private final int MAX_CONNECTIONS = 5;

	private static final String DB_DRIVER_CLASS = "driver.class.name";
	private static final String DB_USERNAME = "db.username";
	private static final String DB_PASSWORD = "db.password";
	private static final String DB_URL = "db.url";

	private static Connection connection = null;
	private static Properties properties = null;

	private Connection getConnection() {
		try {
			properties = new Properties();
			properties.load(new FileInputStream("src/database.properties"));
			Class.forName(properties.getProperty(DB_DRIVER_CLASS));
			connection = DriverManager.getConnection(properties.getProperty(DB_URL),
					properties.getProperty(DB_USERNAME), properties.getProperty(DB_PASSWORD));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public ConnectionPooling() {
		 for (int count = 0; count <MAX_CONNECTIONS; count++) {
			 availableConnection.add(this.getConnection());
			 System.out.println(availableConnection.size());
	        }
	}
	public static Connection getCon()
	{
		if(availableConnection.size()==0)
		{
			System.out.println("sorry all connection are busy");
			return null;
		}
		else
		{
			Connection con=availableConnection.remove(availableConnection.size()-1);
			usedConnection.add(con);
			return con;
		}
	}
	
	public static boolean releaseConnection(Connection con)
	{
		if(con !=null)
		{
			usedConnection.remove(con);
			availableConnection.add(con);
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		ConnectionPooling c=new ConnectionPooling();
		
		try {
			Connection con=getCon();
			for(Connection cc:availableConnection)
			{
				System.out.println("availabe connection is       "+cc);
			}
			releaseConnection(con);
			for(Connection cc:availableConnection)
			{
				System.out.println("availabe connection after release       "+cc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
