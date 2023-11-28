import java.util.Scanner;
public class CubeRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num=sc.nextInt();
    int cube=0;
    cube=num*num*num;
    System.out.println("The cube root of "+num+":"+cube);
	}

}
