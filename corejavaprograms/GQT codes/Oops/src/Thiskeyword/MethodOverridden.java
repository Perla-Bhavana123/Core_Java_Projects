package Thiskeyword;

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
		System.out.println("cagro plane fly at highy speed");
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


public class MethodOverridden {

	public static void main(String[] args) {
	
		
		// TODO Auto-generated method stub
		cagroplane cp=new cagroplane();
		Passesngerplane pp=new Passesngerplane();
		fighterplane fp=new fighterplane();
		System.out.println("cargo plane");
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.carryGoods();
         System.out.println();
		System.out.println("Passenger plane");
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.carryHumans();
		System.out.println();
		System.out.println("fighter plane");
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.carrywepans();
		
		}

}
