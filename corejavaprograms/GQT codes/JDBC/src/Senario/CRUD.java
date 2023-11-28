package Senario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;
public class CRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Search");
			System.out.println("4.Update");
			System.out.println("5.Delete");
			System.out.println("Enter your choice");

			choice=sc.nextInt();
			switch(choice) {
			case 1:
				try {
					Connection con=null;
					java.sql.ResultSet res=null;
					PreparedStatement pstmt=null;
					DriverManager.registerDriver(new com.mysql.jdbc.Driver());
					System.out.println("Driver loaded sucessfully");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GQT","root","root");
					System.out.println("connection is established");

					String s="insert into employee values(?,?,?)";
					pstmt=con.prepareStatement(s);
					Scanner sc1=new Scanner(System.in);
					System.out.println("Enter the id of the employee");
					int tempId=sc1.nextInt();
					sc1.nextLine();
					System.out.println("Enter name of the employee");
					String tempName=sc1.nextLine();
					System.out.println("enter the salary");
					int tempsalary=sc1.nextInt();

					pstmt.setInt(1, tempId);
					pstmt.setString(2,tempName);
					pstmt.setInt(3, tempsalary);
					int rows=pstmt.executeUpdate();
					System.out.println(rows);
					if(rows==0) {
						System.out.println("Insertion of emloyee failed");
					}
					else
					{
						System.out.println("Employee details are added sucessfully");
					}
}
				catch(Exception e){
					e.printStackTrace();

				}
				break;


			case 2:
				try {
					Connection con=null;
					java.sql.ResultSet res=null;
					PreparedStatement pstmt=null;
					DriverManager.registerDriver(new com.mysql.jdbc.Driver());
					System.out.println("Driver loaded sucessfully");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GQT","root","root");
					System.out.println("connection is established");

					String s="select *from employee";
					java.sql.Statement stmt=con.createStatement();
					res=stmt.executeQuery(s);
					while(res.next()) {
						int Id=res.getInt(1);
						String name=res.getString(2);
						int salary=res.getInt(3);

						System.out.println(Id+" "+name+"  "+salary);

					}


				}
				catch(Exception e){
					e.printStackTrace();

				}
				break;
			case 3:
				try {
					Connection con=null;
				    ResultSet res=null;
					PreparedStatement pstmt=null;
					DriverManager.registerDriver(new com.mysql.jdbc.Driver());
					System.out.println("Driver loaded sucessfully");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GQT","root","root");
					System.out.println("connection is established");
					String s="select *from employee where employeId=?";
					
				
					pstmt=con.prepareStatement(s);
					System.out.println("enter the employee id");
					int tempId=sc.nextInt();
					pstmt.setInt(1, tempId);
					res=pstmt.executeQuery();
					if(res.next()) {
						int id=res.getInt(1);
						String name=res.getString(2);
						int salary=res.getInt(3);
						System.out.println(id+" "+name+" "+salary);
					}
					else
					{
						System.out.println("not found");
					}
				}
				catch(Exception e){
					e.printStackTrace();

				}
				
                 break;
                 
			case 4:
				try {
					Connection con=null;
					java.sql.ResultSet res=null;
					PreparedStatement pstmt=null;
					DriverManager.registerDriver(new com.mysql.jdbc.Driver());
					System.out.println("Driver loaded sucessfully");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GQT","root","root");
					System.out.println("connection is established");
					
					String s="update employee set employename=? where employeId=?";
					pstmt=con.prepareStatement(s);
					Scanner sc1=new Scanner(System.in);
					System.out.println("Enter the id of the employee");
					int tempId=sc1.nextInt();
					Scanner scan=new Scanner(System.in);
					System.out.println("Enter the updated name");
					String tempName=scan.nextLine();
					pstmt.setString(1,tempName);
					pstmt.setInt(2, tempId);
					
					int rows=pstmt.executeUpdate();
					System.out.println(rows);
					if(rows==0) {
						System.out.println("Updation failed");
					}
					else
					{
						System.out.println("Updated sucessfully");
					}
					
				}
				catch(Exception e){
					e.printStackTrace();

				}

				
				break;
				
				
			case 5:
				try {
					Connection con=null;
					java.sql.ResultSet res=null;
					PreparedStatement pstmt=null;
					DriverManager.registerDriver(new com.mysql.jdbc.Driver());
					System.out.println("Driver loaded sucessfully");
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GQT","root","root");
					System.out.println("connection is established");
					
					String s="delete from employee where employeId=?";
					pstmt=con.prepareStatement(s);
					Scanner sc1=new Scanner(System.in);
					System.out.println("Enter the id of the student");
					int tempId=sc1.nextInt();
					
					pstmt.setInt(1, tempId);
					
					int rows=pstmt.executeUpdate();
				
					System.out.println(rows);
					
				}
				catch(Exception e){
					e.printStackTrace();

				}
				
				break;
			}

		}while(choice!=0);

	}
}
