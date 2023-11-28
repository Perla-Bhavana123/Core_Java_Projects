import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Dogs implements Serializable
{
	String name;
	String color;
	int cost;
	Dogs(String name,String color,int cost){
		this.name=name;
		this.color=color;
		this.cost=cost;
	}
		String getData() {
			return "name="+name+"color="+color+"cost="+cost;
		}
}
class cars  implements Serializable
{
	String name;
	String color;
	int cost;
	int age;
	cars(String name,String color,int cost,int age){
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.age=age;
	}
	String getData1() {
		return "name="+name+"color="+color+"cost="+cost+"age ="+age;
	}
}
public class Dog {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Dogs d=new Dogs("chinnu","white",10000);
		cars c=new cars("isa","black",300000,5);
		System.out.println(d.getData());
		System.out.println(c.getData1());
		String path="C:\\Iooperations\\Dogs5.txt";
		FileOutputStream fos=new FileOutputStream(path);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.writeObject(c);
		FileInputStream fis=new FileInputStream(path);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dogs d1=(Dogs) ois.readObject();
		cars c2=(cars) ois.readObject();
		System.out.println(d1.getData());	
		System.out.println(c2.getData1());
	}

}
