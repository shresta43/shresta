package JDBCPack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			char ch='y';
			Connection con=null;
			PreparedStatement pst=null;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			con=DriverManager.getConnection(url,"nani","nani1234");
			while(ch=='y'||ch=='Y')
			{
				
				pst=con.prepareStatement("insert into Student values(?,?,?,?)");
				System.out.println("enter subcode");
				String r=br.readLine();
				
				System.out.println("enter subname");
				String s =br.readLine();
				
				System.out.println("enter int marks");
				int i=Integer.parseInt(br.readLine());
				
				System.out.println("enter final marks");
				int i1=Integer.parseInt(br.readLine());
				
				System.out.println("total");
				int i2=Integer.parseInt(br.readLine());
				
				pst.setString(1, r);
				pst.setString(2, s);
				pst.setInt(3, i);
				pst.setInt(4, i1);
				pst.setInt(5, i2);
				
				pst.executeUpdate();
				
				System.out.println("record");
				
				ch=(char)br.read();
			}
			Statement st=con.createStatement();
			String q="select *from student";
			ResultSet rs= st.executeQuery(q);
			while(rs.next()){
					System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4)+"\t"+rs.getInt(5));
			}
			con.close();
			st.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

}
}
