package Thiskeyword;

class Dog5{
	private String name;
	private String color;
	private int age;
	private int cost;
	
	
	Dog5(){
		super();
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
		System.out.println();
		this.name="Tomy";
						 
						
		this.color="Black";
		this.age=7;
		this.cost=4500;
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
		System.out.println();
		
	}
	Dog5(String name){
		this();
		this.name=name;
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
		System.out.println();
		
	}
	
	Dog5(String name,String color){
		this("Ramu");
		this.name=name;
		this.color=color;
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
		System.out.println();
	}
	Dog5(String name,String color,int age){
		this("Rocky","white");
		this.name=name;
		this.color=color;
		this.age=age;
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
		System.out.println();
	}
	Dog5(String name,String color,int age,int cost){
		this("jocky","Brown",3);
		this.name=name;
		this.color=color;
		this.age=age;
		this.cost=cost;
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
		
	}
	String getName() {
		return name;
	}
	String getColor() {
		return color;
	}
	int getAge() {
		return age;
		
	}
	int getCost() {
		return cost;
	}
}


public class Thiskeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog5 d=new Dog5("Jockey","Grey",8,8000);
		System.out.println(d.getName());
		System.out.println(d.getColor());
		System.out.println(d.getAge());
		System.out.println(d.getCost());
		

	}

}
