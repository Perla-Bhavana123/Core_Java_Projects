import java.util.Scanner;
public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		    System.out.println("enter the n value:");
		    int n=sc.nextInt();
		    System.out.println("enter the m value:");
		    int m=sc.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[m];
		    for(int i=0;i<a.length;i++) {
		    	System.out.println("enter the a value:"+(i+1));
		    	a[i]=sc.nextInt();
		    }
		    for(int i=0;i<b.length;i++) {
		    	System.out.println("enter the b value:"+(i+1));
		    	b[i]=sc.nextInt();
		    }
		    for(int i=0;i<a.length;i++) {
		    	for(int j=0;j<b.length;j++) {
		    
		    if(a[i]==b[i]) {
		    	System.out.println("eual");
		    }
		    else
		    {
		    	System.out.println("not equal");
		    }
		   /* for(int i=0;i<a.length;i++) {
		    	for(int j=i+1;j<a.length;j++) {
		    	int temp=0;
		    		if(a[i]>a[j]) {
		    			temp=a[i];
		    			a[i]=a[j];
		    			a[j]=temp;
		    	}
		    }
		    }
		    for(int i=0;i<b.length;i++) {
		    	for(int j=i+1;j<b.length;j++) {
		    	int temp=0;
		    		if(b[i]>b[j]) {
		    			temp=b[i];
		    			b[i]=b[j];
		    			b[j]=temp;
		    	}
		    }
		    }
		    	
		    for(int i=0;i<a.length;i++) {
		    	System.out.print(a[i]+" ");
		    }
		    System.out.println();
		    for(int i=0;i<b.length;i++) {
		    	System.out.print(b[i]+" ");
		    }*/
		    /*for(int i=0;i<a.length;i++) {
		    	for(int j=0;j<b.length;j++) {
		    		if(a[i]==b[i]) {
		    			System.out.println("equal");
		    		}
		    		else
		    		{
		    			System.out.println("Not equal");
		    		}*/
		    	}
		    
		    }
	}
}
	

	


