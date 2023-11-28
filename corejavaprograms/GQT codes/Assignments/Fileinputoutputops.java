import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileinputoutputops {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      String p1="D:\\ioprograms\\input.txt";
      String p2="D:\\ioprograms\\output.txt";
      FileInputStream fis = new FileInputStream(p1);
      int temp;
      FileOutputStream fos = new FileOutputStream(p2);
      while((temp=fis.read())!=0) {
    	  fos.write(temp);
    	  
      }
      fos.close();
      fis.close();
      
	}

}
