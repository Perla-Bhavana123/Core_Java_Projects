package SelectData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class SelectParticularData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=null;
			java.sql.ResultSet res=null;
			PreparedStatement pstmt=null;
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("Driver loaded sucessfully");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GQT","root","root");
			System.out.println("connection is established");
			String s="insert into student values(?,?,?,?,?)";
			pstmt=con.prepareStatement(s);
			Scanner sc2=new Scanner(System.in);
			System.out.println("Enter the id of the student");
			int tempId=sc2.nextInt();
			System.out.println("enter the name");
			String tempname=sc2.next();
			System.out.println("enter Marks1");
			int tempMarks1=sc2.nextInt();
			System.out.println("enter Marks2");
			int tempMarks2=sc2.nextInt();
			System.out.println("enter Marks3");
			int tempMarks3=sc2.nextInt();
			pstmt.setInt(1, tempId);
			pstmt.setString(2, tempname);
			pstmt.setInt(3, tempMarks1);
			pstmt.setInt(4, tempMarks2);
			pstmt.setInt(5, tempMarks3);
			int rows=pstmt.executeUpdate();
			System.out.println(rows);
		}
		catch(Exception e){
			e.printStackTrace();

		}


	}

}
