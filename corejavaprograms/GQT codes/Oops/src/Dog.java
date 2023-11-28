
public class Dog {
	private String name;
	private String color;
	private int age;
	private int cost;
	Dog(){
		
		name="Bheemu";
		color="brown";
		age=7;
		cost=7000;
	}
	Dog(String a){
		name=a;
		
	}
	Dog(String a ,String b){
		name=a;
		color=b;
		
	}
	Dog(String a ,String b,int c){
		name=a;
		color=b;
		age=c;
		
	}
	Dog(String a ,String b,int c,int d){
		name=a;
		color=b;
		age=c;
		cost=d;
		
	}
	
	String getname() {
		return name;
	}
	String gecolor() {
		return color;
	}
    int  getage() {
		return age;
	}
	int getcost() {
		return cost;
	}
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
		
	}
	

}



  