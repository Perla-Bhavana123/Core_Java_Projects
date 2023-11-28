import java.util.Scanner;
public class Evenoddpositioncharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int large,small,i;
		int a[] = new int[]{30, 21, 1, 4, 5};
		int n = a.length;
		large=small=a[0];
		for(i=1;i<n;++i)
		{
		if(a[i]>large)
		large=a[i];

		if(a[i]<small)
		small=a[i];
		}
        System.out.println("the largest element in an array:"+large);
		System.out.println("the smallest element in an array:"+small);
		}
	
		
	}

