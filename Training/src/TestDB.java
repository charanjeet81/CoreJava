import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestDB 
{
	public static void main(String[] args)
	{
		DBTesting db = new DBTesting();
		db.databasesVerification("select * from firmware_details where vendor='QA_V'", null, null);
	}
}

class DBTesting 
{
	public static void databasesVerification(String queryName, String objValue, String methodName)
	{  
		 Connection con = null;
		 Statement stmt = null; 
		 //String DB_URL ="jdbc:oracle:thin:@172.18.93.134:1521/CSDB";
		 String DB_URL ="jdbc:oracle:thin:@xhastage-duke1.corp.cox.com:1521/QHASTAGE_GENERIC_APP.WORLD";
		 
		 String DB_USER = "DPSCBSUSER";		
		 String DB_PASSWORD = "DPSCBSUSER";
		 try
		 {
		    String dbClass = "oracle.jdbc.driver.OracleDriver";
		    Class.forName(dbClass).newInstance();
		    con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		    stmt = con.createStatement();
		 }
		 catch (Exception e)
		     {
		           e.printStackTrace();
		     }
		 int count=0;
		 String Date=null;
		 String Createdby=null;
		 try
		 {
		     String query = queryName;
		     ResultSet res = stmt.executeQuery(query);
		     while (res.next())
		     {		           
			     System.out.print(res.getString(1));
			     System.out.print("\t" + res.getString(2));
			     System.out.print("\t" + res.getString(3));
			     System.out.println("\t" + res.getString(4));
			     System.out.println("\t" + res.getDate("CREATED_DATE"));
			     Date=res.getDate("CREATED_DATE").toString(); 
			     Createdby=res.getString("CREATED_BY"); 
			     count=count+1;
		     }
		  }
	     catch(Exception e)
	     {
	            e.printStackTrace();
	     }     
	/*	  if(count==1)
			  System.out.println("pass");
		         report.updateTestLog(methodName,  objValue+" Value exist in Database at Creation Date "+ Date+" and Created By "+ Createdby, Status.PASS);
		 else
			 System.out.println("fail");
		         report.updateTestLog(methodName,  objValue+" Value DOES NOT exist in Database", Status.FAIL);
		*/
		 if (con != null) {
		     try {
		                con.close();
		         } catch (SQLException e) {
		                // TODO Auto-generated catch block
		                e.printStackTrace();
		         }
		 }
	}
}



