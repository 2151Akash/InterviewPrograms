package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundEx {

	public static void main(String[] args)  {
		
		try
		{
			
		System.out.println("before tracking the file");
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN$\\Downloads\\Exception Handling.docx");
		
		}
		catch(FileNotFoundException e)
		
		{
			System.out.println("file not found exception arrived and catch is executing");
		}
		
		
		System.out.println("after tracking the file");
		
	}

}
