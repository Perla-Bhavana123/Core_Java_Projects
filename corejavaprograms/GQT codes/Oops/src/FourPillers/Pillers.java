package FourPillers;

abstract class Shapes{
	double area;
	abstract void CollectData();
	abstract void Calculate();	
void Display() {
	System.out.println(area);
}
}
  class Circle  extends Shapes{
	  private double r;
	  final double pi=3.147;
	  void CollectData() {
		  System.out.println("enter the Radious");
		 
	  }
	  void Calculate() {
		  System.out.println("area of circle");
	  }
	  void setData(double r) {
		  
	  }
  }
 
  class squares extends Shapes{
	  private double r;
	  final double pi=3.147;
	  void CollectData() {
		  System.out.println("enter the radious");
		 
	  }
	  void Calculate() {
		  
		  System.out.println("area of square");
	  }
  }
  class Rectangle extends Shapes{
	  private double l;
	  private double b;
	  final double pi=3.147;
	  void CollectData() {
		  System.out.println("enter the data");
	  }
	  void Calculate() {
		  System.out.println("area of rectangle");
	  }
  }
  class Geometry{
	  void permit(Shapes s) {
		  s.CollectData();
		  s.Calculate();
		  s.Display();
	  }
  }
  
  


public class Pillers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		squares s=new squares();
		Rectangle r=new Rectangle();
		Geometry g=new Geometry();
		g.permit(c);
		g.permit(s);
		g.permit(r);
		
	}

}
