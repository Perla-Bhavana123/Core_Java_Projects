package com.gqt.calculator.project;
import java.util.Scanner;
public class Shopping {
	public static int key;
	public static void Exit() {
		Scanner sc=new Scanner(System.in);

		boolean Exit=sc.nextBoolean();
		if(Exit==true) {
			System.out.println("Thank you");
		}
		else {
			main(null);
		}
	}

	public static void s3333() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to sports:");
		System.out.println("Please select the option:\n"
				+"1.Real Games\n"
				+"2. Video cars games"
				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("1.Real Games\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");
			System.out.println("Price                RS.1000\n"+"Types          bats\n ");
			System.out.println();
			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.1,000\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          1,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             1,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}
        }
		}
		break;
		case 2:{
			System.out.println("Video Car Games\n");

			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");
			System.out.println("Price                RS.2,000\n"+"Quality       Gmaming Systems\n "+"Type             Remote ");
			System.out.println();
			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {


			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.2,000\n"+"\t\tquantity          1\n"+"\t\tColor            black\n"+"\t\tCost*1          2,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             2,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}

			}
			

		}
		break;
		}
	  }
	public static void s2222() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to sports equipments:");
		System.out.println("Please select the option:\n"
				+"1.Bats\n"
				+"2.Net"
				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Bats\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");

			System.out.println("Price                RS.1,000\n"+"Quality       Wood item\n "+"size             10%");
			System.out.println();
			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				

			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.1,000\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          1,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             1,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}
				}
		}
		
		break;
		case 2:{
			System.out.println("Net\n");

			System.out.println();
			System.out.println("Details of the product:");
            System.out.println("-----------------------------------");
			System.out.println("Price                RS.500\n"+"Quality        Plastic\n "+"color             Black");
			System.out.println();
			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {


			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.500\n"+"\t\tquantity          1\n"+"\t\tColor            Black\n"+"\t\tCost*1          500");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             500");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}

			}
			

		}
		break;
		}
	}
  public static void s1111() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to sports wears:");
		System.out.println("Please select the option:\n"
				+"1.Shoes\n"
				+"2.Dress"
				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Shoes\n");
			System.out.println();
			System.out.println("Details of the product:");
            System.out.println("-----------------------------------");
			System.out.println("Price                RS.5,000\n"+"Quality       Flexible\n "+"color             orenge");
			System.out.println();
			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {

				

			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.5,000\n"+"\t\tquantity          1\n"+"\t\tColor            orenge\n"+"\t\tCost*1          5,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             5,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}


				
			}
		
		}
		break;
		case 2:{
			System.out.println("Dress\n");
			System.out.println();
			System.out.println("Details of the product:");
            System.out.println("-----------------------------------");
			System.out.println("Price                RS.700\n"+"Quality       silk\n "+"color             Pink");
			System.out.println();
			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {

				}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.700\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          700");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             700");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}

			}
			

		}
		break;
		}
	}
public static void s333() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to vegitables:");
		System.out.println("Please select the option:\n"
				+"1.Cabage\n"
				+"2.potato"
				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("cabage\n");
			System.out.println();
			System.out.println("Details of the product:");
            System.out.println("-----------------------------------");
			System.out.println("Price                RS.40\n"+"Quality            big\n "+"Type            small,big ");
			System.out.println();
            System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {

				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.40\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          40");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             40");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}



				
			}
		}
		
		break;
		case 2:{
			System.out.println("Potato\n");
			System.out.println();
			System.out.println("Details of the product:");
            System.out.println("-----------------------------------");
			System.out.println("Price                RS.60\n"+"Quality       Fresh\n ");
			System.out.println();
            System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {

				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.60\n"+"\t\tquantity          1\n"+"\t\tColor            potato\n"+"\t\tCost*1          60");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             60");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}

			}
		}
		break;

		}
	}
public static void s222() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to juice:");
		System.out.println("Please select the option:\n"
				+"1.Mango juice\n"
				+"2.Apply juice"
				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Mango juice\n");
			System.out.println();
			System.out.println("Details of the product:");
            System.out.println("-----------------------------------");
			System.out.println("Price                RS.150\n"+"Quantity       1\n "+"color             yellow");
			System.out.println();
			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {

				

			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.150\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          150");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             150");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}
             }
		}
		
		break;
		case 2:{
			System.out.println("Apply juice\n");
			System.out.println();
			System.out.println("Details of the product:");
            System.out.println("-----------------------------------");
			System.out.println("Price                RS.130\n"+"Quality       1Glass\n "+"color             red");
			System.out.println();
            System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {

				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.130\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          130");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             130");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}
               }
			}
		break;
		}
	}
public static void s111() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to fruits:");
		System.out.println("Please select the option:\n"
				+"1.Mango\n"
				+"2.Apple"
				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Mango\n");
			System.out.println();
			System.out.println("Details of the product:");
            System.out.println("-----------------------------------");
			System.out.println("Price                RS.200\n"+"Quality       6\n "+"color             yellow");
			System.out.println();
			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {

				

			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.200\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          200");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             200");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}


				
			}
		}
		
		break;
		case 2:{
			System.out.println("Apply\n");
			System.out.println();
			System.out.println("Details of the product:");
            System.out.println("-----------------------------------");
			System.out.println("Price                RS.300\n"+"Quality       6\n "+"color             red");
			System.out.println();
            System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {

				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.300\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          300");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             300");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}

			}
		}
		break;

		}
	}
public static void s33() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to childrens:");
		System.out.println("Please select the option:\n"
				+"1.small dress\n"
				+"2.small pants"
				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("small dress\n");
			System.out.println();
			System.out.println("Details of the product:");
            System.out.println("-----------------------------------");
			System.out.println("Price                RS.3,000\n"+"Quality       full Gole\n "+"color             Pink");
			System.out.println();
            System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {

				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.3,000\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          3,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             3,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}


				
			}
		}
		
		break;
		case 2:{
			System.out.println("small pants\n");
			System.out.println();
			System.out.println("Details of the product:");
            System.out.println("-----------------------------------");
			System.out.println("Price                RS.2,000\n"+"Quality       dress with pant\n "+"color             Pink");
			System.out.println();
            System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {

				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.2,000\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          2,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             2,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}

			}
		}
		break;

		}
	}
public static void s22() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to women:");
		System.out.println("Please select the option:\n"
				+"1.dress\n"
				+"2.sarees"
				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("dress\n");
			System.out.println();
			System.out.println("Details of the product:");
           	System.out.println("-----------------------------------");
			System.out.println("Price                RS.5,000\n"+"Quality       Longdress\n "+"color             Pink");
			System.out.println();
			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {

				

			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.5,000\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          5,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             5,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}


				
			}
		}
		break;
		case 2:{
			System.out.println("sarees\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");
			System.out.println("Price                RS.4,000\n"+"Quality       silk\n "+"color             Pink");
			System.out.println();

			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {

				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.4,000\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          4,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             4,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}

			}
		}
		break;

		}
	}
public static void s11() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to men:");
		System.out.println("Please select the option:\n"
				+"1.shirt\n"
				+"2.shots"
				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("shirt\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");
			System.out.println("Price                RS.2,000\n"+"Quality       cotton\n "+"color             Pink");
			System.out.println();

			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {

				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.2,000\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          2,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             2,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}
				}
		}
		break;
		case 2:{
			System.out.println("Pants\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");
			System.out.println("Price                RS.1,000\n"+"Quality       stretchble\n "+"color             blue");
			System.out.println();

			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.1,000\n"+"\t\tquantity          1\n"+"\t\tColor            blue\n"+"\t\tCost*1          1,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             1,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}

			}
		}
		break;

		}
	}
  public static void s4() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to watches:");
		System.out.println("Please select the option:\n"
				+"1.Colorfit\n"
				+"2.Noice"
				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Colorfit\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");
			System.out.println("Price                RS.5,000\n"+"Quality       Screen Tougch\n "+"color             pink");
			System.out.println();
			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.5,000\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          5,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             5,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}

			}
        }
		break;

		case 2:{
			System.out.println("Noice\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");
			System.out.println("Price                RS.2,000\n"+"Quality       Touch\n "+"color             Black");
			System.out.println();

			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.2,000\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          2,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             5,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}

			}
		}
		break;

		}
	}
public static void s3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to Laptops:");
		System.out.println("Please select the option:\n"
				+"1.Lenovo\n"
				+"2.HP\n"
				+ "3.Dell"
				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Lenovo\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");
			System.out.println("Price                RS.40,000\n"+"Processor         IntelCOREi7\n "+"color             black");
			System.out.println();
			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				

			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.40,000\n"+"\t\tquantity          1\n"+"\t\tColor            Black\n"+"\t\tCost*1          40,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             40,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}

			}
}
		break;

		case 2:{
			System.out.println("HP\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");
			System.out.println("Price                RS.60,000\n"+"Processor      intel Corei3\n "+"color             Black");
			System.out.println();

			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.60,000\n"+"\t\tquantity          1\n"+"\t\tColor            Black\n"+"\t\tCost*1          60,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             60,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}
              }

			}
		break;

		case 3:{
			System.out.println("Dell\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");
			System.out.println("Price                RS.90,000\n"+"Quality       flexible\n "+"color             Black");
			System.out.println();
			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				

			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.90,000\n"+"\t\tquantity          1\n"+"\t\tColor            Black\n"+"\t\tCost*1          90,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             90,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}

			}
		}

		break;

		}

	}
   public static void s2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to Head phones:");
		System.out.println("Please select the option:\n"
				+"1.Bluetooth\n"
				+"2.Buds"
				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Bluetooth\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");
			System.out.println("Price                RS.1,500\n"+"Quality       good\n "+"color             Pink");
			System.out.println();

			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.1,500\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          1,500");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             1,500");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}

			}
         }
		break;

		case 2:{
			System.out.println("Buds\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");
			System.out.println("Price                RS.2,000\n"+"Quality       good\n "+"color             Pink");
			System.out.println();

			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.2,000\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          2,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             2,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}

				else {
					System.out.println("Thank you for visiting");

				}

			}
		}
       
		break;
	}
		
	}
public static void s1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to mobile:");
		System.out.println("Please select the option:\n"
				+"1.Redmee\n"
				+"2.One pluse"
				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Redmee\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");


			System.out.println("Price                RS.20,000\n"+"RAM        4GB\n "+"color             Pink");
			System.out.println();

			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.20,000\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          20,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             20,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}
				
			}
		}
		break;
      case 2:{
			System.out.println("One Pluse\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");

			System.out.println("Price                RS.30,000\n"+"RAM            4GB\n "+"color             Black");
			System.out.println();

			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.30,000\n"+"\t\tquantity          1\n"+"\t\tColor            Black\n"+"\t\tCost*1          30,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             30,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}

			}
		}
		break;
		}
	}
public static void select5() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to Kichen Decors:");
		System.out.println("Please select the option:\n"
				+"1.Plastic Box set\n"
				+"2.spoons"
				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Plastic Box set\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");

			System.out.println("Price                RS.200\n"+"Quality       Plastic\n "+"color             green");
			System.out.println();

			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.200\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          200");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             200");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}

			}
			
		}
		break;
      case 2:{
			System.out.println("spoons\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");
			System.out.println("Price                RS.500\n"+"Type            Steel\n "+"color             steel");
			System.out.println();

			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.500\n"+"\t\tquantity          1\n"+"\t\tColor            Steel\n"+"\t\tCost*1          500");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             500");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}
              }
          }
		break;
		}
	}
    public static void select4() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to carpets:");
		System.out.println("Please select the option:\n"
				+"1.Red corpet\n"
				+"2.Blue corpet"
				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Red carpet\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");

			System.out.println("Price                RS.2,000\n"+"Quality       Hard\n "+"color             Red");
			System.out.println();

			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.2,000\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          2,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             2,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}
				}
		}
		break;
     case 2:{
			System.out.println("Blue carpets\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");
			System.out.println("Price                RS.1,000\n"+"Quality          hard\n "+"color             Red");
			System.out.println();

			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				

			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.1,000\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          1,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             1,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}
             }
			}
		break;
		}
	}
   public static void select3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to Blankets:");
		System.out.println("Please select the option:\n"
				+"1.Rajasthani blanket\n"
				+"2.cotton blanket"
				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Rajasthani blanket\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");

			System.out.println("Price                RS.800\n"+"Quality       Smooth\n "+"color             Pink");
			System.out.println();

			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				

			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.800\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          800");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             800");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}
				}
		}
		break;
       case 2:{
			System.out.println("cotton blanket\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");
			System.out.println("Price                RS.500\n"+"Quality       smooth cloth\n "+"color             Pink");
			System.out.println();
			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.500\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          500");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             500");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}

			}
          }
		break;
		}
	}
        public static void select() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to furniture:");
		System.out.println("Please select the option:\n"
				+"1.Tables\n"
				+"2.sofa\n"
				+"3.chairs\n"
				+"4.Fans\n"

				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println(" You are selected Tables\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");
			System.out.println("Price                RS.30,000\n"+"Table quality          Wood item\n "+"color                 Black");
			System.out.println();


			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				

			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.30,000\n"+"\t\tquantity          1\n"+"\t\tColor            Black\n"+"\t\tCost*1          30,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             30,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}
				
			}
			
		}
		break;


		case 2:{
			System.out.println("You are selected sofa\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");

			System.out.println("Price                RS.50,000\n"+"Quality       Wood item\n "+"color             Pink");
			System.out.println();

			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				

			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.50,000\n"+"\t\tquantity          1\n"+"\t\tColor            Pink\n"+"\t\tCost*1          30,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             30,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");

				}
				
			}
			break;
		}
	    case 3:{
			System.out.println("You are selected Chairs\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");
			System.out.println("Price                RS.2,000\n"+"Quality       Wood item\n "+"color             gold");
			System.out.println();

			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				

			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.2,000\n"+"\t\tquantity          1\n"+"\t\tColor            gold\n"+"\t\tCost*1          2,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             2,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					
				}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);

				}
				else {
					System.out.println("Thank you for visiting");
                }
             }
			break;
		}
      case 4:{
			System.out.println("You are selected Fans\n");
			System.out.println();
			System.out.println("Details of the product:");

			System.out.println("-----------------------------------");

			System.out.println("Price                RS.3,000\n"+"Feature              High Speed\n "+"color                Blue");
			System.out.println();

			System.out.println("Do You want to purchace");
			String c=sc.next();
			if(c.equalsIgnoreCase("Yes")) {
				
			}
			else {
				System.out.println("Thank you for visiting");
				Exit();
			}
			System.out.println("Do you want to make payment");
			String key=sc.next();
			if(key.equalsIgnoreCase("Yes")) {
				System.out.println( "\t\tReciept");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tActual Price     RS.3,000\n"+"\t\tquantity          1\n"+"\t\tColor            Blue\n"+"\t\tCost*1          3,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println("\t\tTotal             3,000");
				System.out.println("\t\t-------------------------------------");
				System.out.println();
				System.out.println("Thank you for purchasing");
				System.out.println();
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
				}
				else {
					
						System.out.println("Thank you for visiting");
					}
			}
			else {
				System.out.println("Do you want purchace more products");
				String b=sc.next();
				if(b.equalsIgnoreCase("Yes")){
					main(null);
                  }
				else {
					System.out.println("Thank you for visiting");
				}
				}
			}
		break;
		}
   }
public static void CollectItems5() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to  sports:");
		System.out.println("Please select the option:\n"
				+"1.sports wears\n"
				+"2.sports Equipments\n"
				+"3.sports\n"

				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("1.sports wears")  ;
			s1111();
			break;
		}
		case 2:{
			System.out.println("2.sports shets")  ;
			s2222();
			break;
		}
		case 3:{
			System.out.println("3.sports")  ;
			s3333();
			break;
		}
      }
	}
 public static void CollectItems4() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to  Instamart:");
		System.out.println("Please select the option:\n"
				+"1.Fruits\n"
				+"2.Juices\n"
				+"3.Vegitables\n"

				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("1.Fruits")  ;
			s111();
			break;
		}
		case 2:{
			System.out.println("2.Juices")  ;
			s222();
			break;
		}
		case 3:{
			System.out.println("3.vegitables")  ;
			s333();
			break;
		}

		}
	}
  public static void CollectItems3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to  Fashions:");
		System.out.println("Please select the option:\n"
				+"1.men\n"
				+"2.women\n"
				+"3.children\n"

				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("1.men")  ;
			s11();
			break;
		}
		case 2:{
			System.out.println("2.women")  ;
			s22();
			break;
		}
		case 3:{
			System.out.println("3.children")  ;
			s33();
			break;
		}

		}
	}
	public static void CollectItems2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to  Electronics:");
		System.out.println("Please select the option:\n"
				+"1.Mobiles\n"
				+"2.Head Phones\n"
				+"3.Laptops\n"
				+"4.watches\n"
				);
		int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("mobiles")  ;
			s1();
			break;
		}
		case 2:{
			System.out.println("2.Head phones")  ;
			s2();
			break;
		}
		case 3:{
			System.out.println("3.laptops")  ;
			s3();
			break;
		}
		case 4:{
			System.out.println("4.watches")  ;
			s4();
			break;
		}
		}
	}
     public static void CollectItems() {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcom to home Decores:");
		System.out.println("Please select the option:\n"
				+"1.Furniture\n"
				+"2.Blankets\n"
				+"3.corpets\n"
				+"4.Kitchen Decores\n"
				);
        int choice =sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("1.Furniture")  ;
			select();
			break;
		}
		case 2:{
			System.out.println("2.Blankets")  ;
			select3();
			break;
		}
		case 3:{
			System.out.println("3.corpets")  ;
			select4();
			break;
		}
		case 4:{
			System.out.println("4.Kitchen Decors")  ;
			select5();
			break;
		}
		}
	}
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("\t**** Welcome to Flipkart *****\t\t\t");
		System.out.println();

		System.out.println("Please select the option:\n"
				+"1.Home Decors\n"
				+"2.Electronics\n"
				+"3.Fashions\n"
				+"4.Instamart\n"
				+"5.sports");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Home Decores");
			CollectItems();
			break;
           }
		case 2:{
			System.out.println("Electronics");
			CollectItems2();
			break;
           }
		case 3:{
			System.out.println("Fashion");
			CollectItems3();
			break;
         }
		case 4:{
			System.out.println("Instamart");
			CollectItems4();
			break;
          }
		case 5:{
			System.out.println("sports");
			CollectItems5();
			break;
          }
		}
	}
}
