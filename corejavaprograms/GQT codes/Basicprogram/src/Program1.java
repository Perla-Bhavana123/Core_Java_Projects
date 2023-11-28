class Dog{
	String name;
	String color;
	int cost;
	String breed;
	void run() {
		System.out.println("dog runs");
	}
	void eat() {
		System.out.println("dog eating");
	}
	
}
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		d1.name="Chichu";
		d1.color="black";
		d1.cost=7000;
		d1.breed="RK";
		d1.run();
		d1.eat();
		System.out.println(d1.name);
		System.out.println(d1.color);
		System.out.println(d1.cost);
		System.out.println(d1.breed);
		

	}

}
