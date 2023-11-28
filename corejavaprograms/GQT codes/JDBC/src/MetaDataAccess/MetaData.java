package MetaDataAccess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;

import com.mysql.jdbc.ResultSet;

import com.mysql.jdbc.Statement;



public class MetaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=null;
			java.sql.ResultSet res=null;
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("Driver loaded sucessfully");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GQT","root","root");
			System.out.println("connection is established");
			String s="select *from student";
			java.sql.Statement stmt=con.createStatement();
			res=stmt.executeQuery(s);
//			while(res.next()) {
//				int Id=res.getInt(1);
//				String name=res.getString(2);
//				int Marks1=res.getInt(3);
//				int Marks2=res.getInt(4);
//				int Marks3=res.getInt(5);
//				System.out.println(Id+" "+name+"  "+Marks1+" "+Marks2+" "+Marks3);
//
//			}
			ResultSetMetaData rsmd=res.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();i++) {
				System.out.println(rsmd.getCatalogName(i));
				System.out.println(rsmd.getColumnTypeName(i));
			}
			

		}
		catch(Exception e){
			e.printStackTrace();

		}


	}

}
