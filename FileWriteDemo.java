package filestream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriteDemo {

	public static void main(String[] args) {
		//write in a file
		try {
			FileWriter fw = new FileWriter(" ");
			fw.write("We are learning to use File writer.");
			fw.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//read from a file
		try {
	FileReader fr = new FileReader("E:\\Java Text Files\\Letter.txt");
		    int i;
		    while((i=fr.read())!=-1)
		    {
		    	System.out.print((char)i);
		    }
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("Sucess");
	}

}
