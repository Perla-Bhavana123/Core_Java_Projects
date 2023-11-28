import java.util.Scanner;

class program1{
	void operation1() throws Exception
	{
		System.out.println("entered into op-1");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1");
		int num1=sc.nextInt();
		System.out.println("enter num2");
		int num2=sc.nextInt();
		int res=num1/num2;
		System.out.println(res);
		System.out.println("left from-op-1");
	}
}
class program2{
	void operation2()  throws Exception
	{
		System.out.println("entered into op-2");
		program1 p1=new program1();
		p1.operation1();
		System.out.println("left from op-2");
	}
}
class program3{
	void operation3() throws Exception
	{
		System.out.println("entered into op-3");
		program2 p2=new program2();
		p2.operation2();
		System.out.println("left from op-3");
	}
}


public class ThrowsKeyword {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	    System.out.println("enterd main");
		program3 p3=new program3();
		p3.operation3();
		System.out.println("left from main");
		// another method 
		try {
			System.out.println("enterd into main");
			program3 p31=new program3();
			p31.operation3();
		}
		catch(Exception e) {
			System.out.println("exception handled");
			System.out.println("left from main");
		}

	}

}
