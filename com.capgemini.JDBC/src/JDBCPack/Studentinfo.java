package JDBCPack;

import java.sql.*;


public class Studentinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","nani","nani1234");
			Statement stmt=con.createStatement();
			String url="select *from student";
			ResultSet rs=stmt.executeQuery(url);
			String subjectcode="";
			//String subjectname;
			String grade="";
			char res;
			int total=0 ;
			//String sqlUpdate = "insert into student(total) values (?)";
	 
	//PreparedStatement pstmt = con.prepareStatement(sqlUpdate);
	
			while(rs.next()){
				 subjectcode=rs.getString(1);
				String  subjectname=rs.getString(2);
				
				
				int intmarks=rs.getInt(3);
				int externalmarks=rs.getInt(4);
				total=intmarks+externalmarks;

				//pstmt.setInt(5, total);
				//pstmt.setString(1, subjectcode);
				
				
	/*			if(total>40){
						res='p';
						if(total>80){
							grade="o";
						}
						else if(total<80){
							grade="a";
						}
						
				}
				else{
					res='f';
				}*/

				System.out.println(subjectcode+"\t"+subjectname+"\t"+intmarks+"\t"+externalmarks+"\t"+total+"\t"+grade+"\t");


				
			}
			 String query = "update users set total = ?";
		      PreparedStatement pstmt = con.prepareStatement(query);
		      while(rs.next()){
		      pstmt.setInt   (5, total);
		      }
			pstmt.executeUpdate();
	

				System.out.println("rows ");
			
		
			stmt.close();
			rs.close();
			con.close();
		}
		catch(Exception e){
			
		}

	}

}
