package JDBCPack;
import java.sql.*;
public class SampleJdbc {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","nani","nani1234");
			Statement stmt=con.createStatement();
			String url="select *from employee";
			ResultSet rs=stmt.executeQuery(url);
			System.out.println("employee details");
			System.out.println("-----------");
			while(rs.next()){
				int empid=rs.getInt(1);
				String empname=rs.getString(2);
				float empsal=rs.getFloat(3);
				Date empdoj=rs.getDate(4); 
				System.out.println(empid+"\t"+empname+"\t"+empsal+"\t"+empdoj);
			}
			stmt.close();
			rs.close();
			con.close();
		}
		catch(Exception e){
			System.out.println("error"+e.getMessage());
		}
	}
}