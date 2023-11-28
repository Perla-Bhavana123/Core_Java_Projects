package Delete;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;
public class Delete {
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
			String s="delete from student where id=?";
			pstmt=con.prepareStatement(s);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id of the student");
			int tempId=sc.nextInt();
			pstmt.setInt(1, tempId);
			int rows=pstmt.executeUpdate();
			System.out.println(rows);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
