package ExceptionHandling;

public class test2 {
	
public static void main(String[] args) throws InterruptedException  {
		//throws we can take
//	multiple exception handaling and also parent exception
	
//	Example :FileNotFoundException, InterruptedException
	
	//: A kind of exception whose code will suggest to handle the exception at the time of compilation of program is called checked category.
	
		System.out.println("First line");
		
		//try {
			Thread.sleep(2000);
		
		//}
	//	catch(InterruptedException e)
		
	//	{
	//	}
			System.out.println("last line after 2 sec");
}
}
