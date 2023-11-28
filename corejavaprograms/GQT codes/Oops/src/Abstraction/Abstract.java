package Abstraction;
 
abstract class Plane{
	void takeoff() {
		System.out.println("Plane takeoff");
	}
	abstract void fly();
	void land() {
		System.out.println("Plane land");
		
	}
	
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo plane fly low");
	}
	
	
}
class Passengerplane extends Plane{
	@Override
	void fly() {
		System.out.println("passenger plane fly at medium height");
	}
}

class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Fighter plane fly at the top");
	}
}
class Airport{
	void Permit(Plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Plane p=new CargoPlane();
		CargoPlane cp=new CargoPlane();
		Passengerplane pp=new Passengerplane();
		FighterPlane fp=new FighterPlane();
		Airport a=new Airport();
		a.Permit(cp);//a.Permit(p);
		a.Permit(pp);
		a.Permit(fp);

	}

}
