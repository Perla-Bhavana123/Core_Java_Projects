import java.io.File;
import java.io.IOException;

public class FileCreateing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     File f =new File("C:\\Iooperations\\test.txt");
     f.createNewFile();
     System.out.println("file cfreated");
     System.out.println(f.canExecute());
     System.out.println(f.canRead());
     System.out.println(f.length());
     System.out.println(f.toURL());
//     System.out.println(f.delete());
     System.out.println(f.getTotalSpace());
     System.out.println(f.lastModified());
     System.out.println(f.separatorChar);
     System.out.println(f.canWrite());
	}

}
