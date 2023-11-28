import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Cricketer implements Serializable
{
	int cric_id;
	String name;
	String country;
	int runs;
	Cricketer(int cric_id,String name,String country,int runs){
		this.cric_id=cric_id;
		this.name=name;
		this.country=country;
		this.runs=runs;
	}
	String getData() {
		return "id="+cric_id+"name="+name+"country="+country+"runs="+runs;
	}
public class Deserialization {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Cricketer c=new Cricketer(1,"rohith","india",1000000);
		System.out.println(c.getData());
		String path="C:\\Iooperations\\Cricketer1.txt";
	       FileOutputStream fis=new FileOutputStream(path);
	       
	}
}
}
