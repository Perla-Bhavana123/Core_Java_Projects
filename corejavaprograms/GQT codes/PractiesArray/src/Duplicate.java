import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<a.length;i++) {
    	a[i]=sc.nextInt();
    }
    int flag=1;
    for(int i=0;i<a.length;i++) {
    	for(int j=i+1;j<a.length;j++) {
    		if(a[i]==a[j]) {
    			System.out.println(a[i]);
     		}
    	}
   
    
    
	}
	}
}

