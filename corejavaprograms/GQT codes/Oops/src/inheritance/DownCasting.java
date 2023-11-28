package inheritance;



class plane{
	void takeoff() {
		System.out.println("plane took off");
	}
	void fly() {
		System.out.println("plane is flying");
	}
	void land() {
		System.out.println("plans is land");

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




public class DownCasting {


	public static void main(String[] args) {


		// TODO Auto-generated method stub
		cagroplane cp=new cagroplane();
		Passesngerplane pp=new Passesngerplane();
		fighterplane fp=new fighterplane();
		plane ref;
		ref=cp;
		System.out.println("****** cargo plane ******");
		System.out.println();
		ref.takeoff();
		ref.fly();
		ref.land();
		cp.carryGoods();
		System.out.println();
		ref=pp;
		System.out.println("****** Passenger plane ******");
		System.out.println();
		ref.takeoff();
		ref.fly();
		ref.land();
		pp.carryHumans();
		System.out.println();
		ref=fp;
		System.out.println(" ****** fighter plane ******");
		System.out.println();
		ref.takeoff();
		ref.fly();
		ref.land();
		fp.carrywepans();

	}

}


