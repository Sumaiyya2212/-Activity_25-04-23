package filestream;
import java.io.FileOutputStream;
public class FileOutputStreamdemo {

	public static void main(String[] args) {
        try {
  	FileOutputStream fos = new FileOutputStream("E:\\Java Text Files\\Letter.txt");
    //fos.write(65);//ASCII code
  	String s = "Welcome to java stream";
  	byte b[] = s.getBytes();//converting String into byte array
  	fos.write(b);
  	fos.close();
  	System.out.println("Success");
        }
        catch(Exception e) {
             System.out.println((e.getMessage()));	
        }
	}

}
