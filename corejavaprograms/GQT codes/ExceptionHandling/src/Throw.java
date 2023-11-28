import java.util.Scanner;
class Myprogram{
	void operation7() {
		System.out.println("enter into op-1");
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
		Myprogram p7=new Myprogram();
		p7.operation7();
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
class program4{
	void operation4() throws Exception{
	try{
		System.out.println("entered into op-3");
		program3 p3=new program3();
		p3.operation3();
		
	}
	catch(Exception e) {
		System.out.println("exception handled in operation4");
		throw e;
	}
	finally {
		System.out.println("left from op-4");
	}
}
}

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("enterd into main");
			program4 p4=new program4();
			p4.operation4();
		}
		catch(Exception e) {
			System.out.println("exception handled");
			
		}
		System.out.println("left from main");

	}

}
