package Interfacejava18;
@FunctionalInterface
interface Calculator{
	void add();
	void add2();

static void sub() {
	System.out.println("hi from sub");
}
default void mul() {
	System.out.println("hi from mul");
}
int a=10;
void add1();
}



/*public class Classinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator() {
			@Override
			public void add() {
			             System.out.println("Hi from main");
				}
			};
			c.add();
        Calculator.sub();
        c.mul();
	}*/



