import java.util.Scanner;
public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<a.length;i++) {
    	a[i]=sc.nextInt();
    }
    int a2[]=new int[n];
    int j=0;
    for(int i=0;i<a.length-1;i++) {
    	if(a[i]!=a[i+1]) {
    		a2[j++]=a[i];
    	}
    }
    for(int i=0;i<a2.length;i++) {
    	System.out.println(a2[i]);
    }
	}

}
