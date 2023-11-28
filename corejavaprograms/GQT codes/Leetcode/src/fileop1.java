import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileop1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s1="C:\\Iooperations\\input.txt";
		String s2="C:\\Iooperations\\output.txt";
        FileReader fr = new FileReader(s1);
        FileWriter fw = new FileWriter(s2);  
        int temp;
        while((temp=fr.read())!=-1) {
        	fw.write(temp);
        }
        fw.close();
        fr.close();
	}

}
