package Practiesset_3;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n vlue:");
		int n=sc.nextInt();
		System.out.println("enter the array");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("enter the key valu:");
		int key=sc.nextInt();
		int l=0,h=n-1,mid,found=0;
		int pos=0;
		while(l<=h) {
			mid=((l+h)/2);
			if(a[mid]==key) {
				found=1;
				pos=mid;
				break;

			}
			else
			{
				if(key>a[mid]) {
					l=mid+1;
				}
				else
				{
					h=mid-1;
				}
			}
		}
		if(found==1) {
			System.out.println("element is resent"+key);
		}
		else
		{
			System.out.println("Element not present");
		}



	}

}
