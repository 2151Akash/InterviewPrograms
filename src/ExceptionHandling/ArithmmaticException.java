package ExceptionHandling;

public class ArithmmaticException {
	public static void main(String[] args) {
		
	
	//int k;
	
	try {
	
	int i = 10;
	int j = 0;

int	k = i / j;
	
	System.out.println(k);
	
	}
	catch(ArithmeticException e)
	{
		System.out.println("Arithmetic catch is excuting");
		
	//ex.1 Here  catch block is matching with the type of exception which comes into the try block hence the code gets terminate normally.
	}
	// ex.2 Here no catch block is matching with the type of exception which comes into the try block hence the code gets terminate abnormally.
	
	
	System.out.println("After the exception handling");
	

}


}
