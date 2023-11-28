package Thiskeyword;

class Program1{
	private String a;
	private String b;
	int c;
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
class program2 extends Program1{
	void disp2() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}

public class Luanch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		program2 p2=new program2();
		p2.disp();
		p2.disp2();

	}

}
