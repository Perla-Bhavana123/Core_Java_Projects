package Senario2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class UserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tempname=null;
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.First time user");
			System.out.println("2.Existing user");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				Fisttime();
				break;
			case 2:
				Existinguser();
				break;
			}
		}while(choice!=0);
	}
	static void Existinguser() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.login");
		System.out.println("2.Forgot Password");
		System.out.println("3.Change Password");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			login();

			break;
		case 2:
			
			break;
		case 3:
			change();
			break;
		}

	}
	private static void change() {
		Connection con=null;
		java.sql.ResultSet res=null;
		PreparedStatement pstmt=null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("Driver loaded sucessfully");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GQT","root","root");
			System.out.println("connection is established");
			String s = "update user set password=? where password=?";
			pstmt=con.prepareStatement(s);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the old password");
			String password=sc.next();
			sc.nextLine();
			
			System.out.println("Enter the new password");
			String password1=sc.nextLine();
			String t=	encription(password1);
			pstmt.setString(1,password);
			pstmt.setString(2, password1);

			int rows=pstmt.executeUpdate();
			System.out.println(rows);
		}
		catch(Exception e){
			e.printStackTrace();

		}
		
	}
	public static void login() {
		Connection con=null;
		java.sql.ResultSet res=null;
		PreparedStatement pstmt=null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("Driver loaded sucessfully");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GQT","root","root");
			System.out.println("connection is established");
			String s = "select * from user where username=?";
			pstmt = con.prepareStatement(s);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the username");
			String un=sc.next();
			System.out.println("Enter the Password");
			String pw=sc.next();
			String t=	encription(pw);
			pstmt.setString(1, un);
			res = pstmt.executeQuery();
			if(res.next()) {
				String tempPassword = res.getString(2);
				if(tempPassword.equals(t)) {
					System.out.println("Login success");
				}
				else {
					System.out.println("Invalid password");
				}
			}
			else {
				System.out.println("Invalid user name");
			}
		}
		catch(Exception e){
			e.printStackTrace();

		}
	}

	public static void Fisttime() {
		// TODO Auto-generated method stub

		Connection con=null;
		java.sql.ResultSet res=null;
		PreparedStatement pstmt=null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("Driver loaded sucessfully");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GQT","root","root");
			System.out.println("connection is established");
			String s="insert into user values(?,?,?)";
			pstmt=con.prepareStatement(s);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the Username");
			String tempname = sc.nextLine();
			System.out.println("enter the Password");
			String temppassword=sc.nextLine();
			String t=	encription(temppassword);
			System.out.println("enter the Phone number");
			long tempphone=sc.nextLong();

			String pn=Long.toString(tempphone);

			pstmt.setString(1, tempname);
			pstmt.setString(2,t);
			pstmt.setLong(3, tempphone);
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
	}



	static String encription(String temppassword) {
		char pw[]=temppassword.toCharArray();
		String sp=" ";
		for(int i=0;i<pw.length;i++) {
			int x=pw[i];
			x+=10;
			sp=sp+(char) x;
		}
		return sp;
	}

}
