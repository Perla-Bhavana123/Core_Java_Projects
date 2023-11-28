import java.util.Scanner;
public class Stringrevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
//String s=sc.next();
//System.out.println(s);
//String c=" ";
//
//for(int i=s.length()-1;i>=0;i--) {
//	c=c+s.charAt(i);
//	
//}
//System.out.println(c);
//	}

int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
}

for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}

	}
	

}
