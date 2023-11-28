import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferReaderWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 String p1="C:\\Iooperations\\input.txt";
		    String p2="C:\\Iooperations\\output3.txt";
		    
		    FileReader fr = new FileReader(p1);
		    BufferedReader br=new BufferedReader(fr);
		    int temp;
		    
		    FileWriter fw = new FileWriter(p2);
		    BufferedWriter bw=new BufferedWriter(fw); 
		    while((temp=br.read())!=-1) {
		    	bw.write(temp);
		    }
		    bw.flush();
		    bw.close();
		    br.close();
		    fw.close();
		    fr.close();

	}

}
