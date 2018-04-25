

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBComponents{

	
	public Connection DBConnection_CSDB() throws SQLException {

		System.out.println("-------- Oracle JDBC Connection Testing ------");

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return null;

		}

		System.out.println("Oracle JDBC Driver Registered!");
		Connection connection = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@172.18.93.134:1521/CSDB", "A1EQAAUTOMATION",
					"a1eqaauto123");

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return null;

		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}		
		return connection;				    
	}
	
	public void ExecuteQuery_CSDB(String sql) throws SQLException {
		Connection connection = DBConnection_CSDB();
		
		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		//int rowsize = rs.getRow();
		int colsize = rs.getMetaData().getColumnCount();
		if(colsize != 0){
			while (rs.next()) {
				ResultSetMetaData rsmd = rs.getMetaData();
				for(int i=1;i<=colsize;i++){
					String name = rsmd.getColumnName(i);
					System.out.println("Column "+i+": "+name);
					System.out.println(rs.getString(i));		
				}
			}
			System.out.println("----------------------------------------------------------\n");
		}else{
			System.out.println("No records found");	
		}		
	}
}
