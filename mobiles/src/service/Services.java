package service;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import bean.Customer;
import bean.Mobile;
import exception.MyException;

public class Services {
	
	public void display()
	{
		try
		{
		FileReader fr=new FileReader("C:/Users/Ashish Aggarwal/workspace/mobiles/src/database.properties");
		Properties p=new Properties();
		p.load(fr);
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
		Statement stmt=con.createStatement();
		String sql="Select * from mobiles";
		ResultSet rs=stmt.executeQuery(sql);
		System.out.println("MOBILEID\tName\t\t\tPRICE\t\t\tQUANTITY");
		while(rs.next())
			{
				int mobileid=rs.getInt(1);
				String mobilename=rs.getString(2);
				double price=rs.getDouble(3);
				String quantity=rs.getString(4);
				
				System.out.println(mobileid+"\t\t"+mobilename+"\t\t"+price+"\t\t\t"+quantity);
			}
			con.close();
			rs.close();
			stmt.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

	public void update( Customer c,Mobile m) {
		// TODO Auto-generated method stub
		try {
			FileReader fr=new FileReader("C:/Users/Ashish Aggarwal/workspace/mobiles/src/database.properties");
			Properties p=new Properties();
			p.load(fr);
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
		PreparedStatement selectQ = con.prepareStatement("select quantity from mobiles where mobileid=?");
		selectQ.setInt(1, m.getMobileId());
		ResultSet rs = selectQ.executeQuery();
		if(rs.next()){
			int quant = Integer.parseInt(rs.getString(1));
		String sql="insert into purchasedetails(purchaseid,cname,mailid,phoneno,purchasedate,mobileid)values (purchaseidseq.nextval,?,?,?,to_date(sysdate,'DD/MM/YYYY'),?)" ;
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setString(1,c.getName());
		stmt.setString(2,c.getEmail());
		stmt.setDouble(3,Double.parseDouble(c.getPhno()));
		stmt.setInt(4,m.getMobileId());
		stmt.execute();
		quant-=1;
		PreparedStatement upd = con.prepareStatement("update mobiles set quantity=? where mobileid=?");
		upd.setString(1, Integer.toString(quant));
		upd.setInt(2, m.getMobileId());
		
			upd.execute();
			System.out.println("Upadate Successful");
		}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void delete( int mid) {

		try
		{
			FileReader fr=new FileReader("C:/Users/Ashish Aggarwal/workspace/mobiles/src/database.properties");
			Properties p=new Properties();
			p.load(fr);
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
			PreparedStatement ps1 = con.prepareStatement("delete from purchasedetails where mobileid= ?");
			ps1.setInt(1, mid);
			ps1.executeUpdate();
			PreparedStatement pr=con.prepareStatement("delete from mobiles where mobileid=?");
			pr.setInt(1,mid);
			pr.executeUpdate();
			System.out.println("Mobile deleted successfully");
		}
		catch(Exception e)
		{
			System.out.println("Errro"+e.getMessage());
		}
	}

	public void insert(Customer c, Mobile m) throws MyException {
		// TODO Auto-generated method stub
		try {
				FileReader fr=new FileReader("C:/Users/Ashish Aggarwal/workspace/mobiles/src/database.properties");
				Properties p=new Properties();
				p.load(fr);
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
				PreparedStatement selectQ = con.prepareStatement("select quantity from mobiles where mobileid=?");
				selectQ.setInt(1, m.getMobileId());
				ResultSet rs = selectQ.executeQuery();
				if(rs.next())
				{
					int quant = Integer.parseInt(rs.getString(1));
					if(quant==0)
					{
						throw new MyException("out of stock");
					}
				else
					{
						System.out.println("SOLD");
					}
				}
				else
					{
						System.out.println("mobile not found");
					}
				con.close();
				selectQ.close();
			}
		catch(Exception e){
				System.out.println(e.getMessage());
			}
	}

	public void SearchOnPrice(int range1, int range2) {
		try
		{
			FileReader fr=new FileReader("C:/Users/Ashish Aggarwal/workspace/mobiles/src/database.properties");
			Properties p=new Properties();
			p.load(fr);
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
			PreparedStatement pr= con.prepareStatement("Select mobileid,name,price,quantity from mobiles where price between ? and ?");
			pr.setDouble(1, range1);
			pr.setDouble(2,range2);
			ResultSet rs=pr.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
			}
			int count=pr.executeUpdate();
			System.out.println("Total mobiles in the Specified range"+count);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		
	}
}
