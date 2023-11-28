package Polymorphism;



class plane{
	void takeoff() {
		System.out.println("plane takeoff");
	}
	void fly() {
		System.out.println("plane if flying");
	}
	void land() {
		System.out.println("plans if land");
		
	}
}
class cagroplane extends plane
{
	@Override
	void fly() {
		System.out.println("cagro plane f/.//ooly at highy speed");
	}
	void carryGoods() {
		System.out.println("cargo plane carry goods");
	}
}
class Passesngerplane extends plane
{
	@Override
	void fly() {
		System.out.println("passenger plane fly at highy speed");
	}
	void carryHumans() {
		System.out.println("passnger plsne carry humans");
	}
}
class fighterplane extends plane
{
	@Override
	void fly() {
		System.out.println("fighter plane fly at highy speed");
	}
	void carrywepans() {
		System.out.println("fighter plsne carry wepans");
	}
}
class Airport{
	void permit(plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cagroplane cp=new cagroplane();
		Passesngerplane pp=new Passesngerplane();
		fighterplane fp=new fighterplane();
		Airport a=new Airport();
		a.permit(cp);
		cp.carryGoods();
		a.permit(pp);
		pp.carryHumans();
		a.permit(fp);
		fp.carrywepans();
	
		

	}

}
