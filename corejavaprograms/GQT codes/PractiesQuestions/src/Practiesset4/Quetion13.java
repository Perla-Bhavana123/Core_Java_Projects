package Practiesset4;


class Book{
	private String Title;
	private String Author;
	private int Price;
	void setData(String a,String b, int c) {
		Title=a;
		Author=b;
		Price=c;
	}
	void getData() {
		System.out.println(Title);
		System.out.println(Author);
		System.out.println(Price);
	}
}
public class Quetion13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book();
		b.setData("Rich Man","ram",4000);
		b.getData();
	}

}


