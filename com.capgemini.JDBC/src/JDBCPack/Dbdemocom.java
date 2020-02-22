package JDBCPack;
import java.sql.*;
import java.util.Properties;

public class Dbdemocom {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String ur="jdbc:oracle:thin:@localhost:1521:XE";
		Properties p=new Properties();
		p.put("user", "nani");
		p.put("password", "nani1234");	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(ur,p);
		con.setAutoCommit(false);
		Statement stmt=con.createStatement();
		String url="select *from employee";
		ResultSet rs=stmt.executeQuery(url);
		System.out.println("connection established");	
	}
}
