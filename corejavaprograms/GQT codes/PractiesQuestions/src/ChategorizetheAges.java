import java.util.Scanner;
public class ChategorizetheAges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Age:");
		int age=sc.nextInt();
		if(age>0 && age<=12) {
			System.out.println("child");
		}
		else if(age>13 && age<=19) {
			System.out.println("Teen");
		}
		else if(age>20 && age<=59) {
			System.out.println("Adult");
		}
		else {
			System.out.println("senior");
		}

	}

}
