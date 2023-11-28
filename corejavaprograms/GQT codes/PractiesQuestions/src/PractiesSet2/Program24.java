package PractiesSet2;
import java.util.Scanner;
public class Program24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the size of an array:");
		int n=sc.nextInt();
		int[] arr = new int[n];
        int[] arr1=new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the Element to Remove: ");
		int val = sc.nextInt();
		int j=0;
		for(int i=0; i<n; i++)
		{
			if(val!=arr[i])
			{
//				for(int j=i; j<(n-1); j++)
//					arr[j] = arr[j+1];
//
//				break;
				arr1[j]=arr[i];
				j++;
			}
		}
		for(int k=0; k<j; k++)
			
			System.out.print(arr1[k]+ " ");	
	}


	}


