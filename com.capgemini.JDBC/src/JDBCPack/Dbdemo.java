package JDBCPack;
import java.sql.*;
import java.util.Properties;

public class Dbdemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//try{
		//String url="select *from employee";
		String ur="jdbc:oracle:thin:@localhost:1521:XE";
		Properties p=new Properties();
		p.put("user", "nani");
		p.put("password", "nani1234");	
		Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(ur,p);
		System.out.println("connection established");
		
	}

}
