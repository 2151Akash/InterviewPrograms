package ExceptionHandling;

public class TrycatchFinal {
	
public static void main(String[] args) {
		
		
		try {
			
		int i=10;
		int j = 0;
		int k = i /j;
		
		}
		
		catch(ArithmeticException e)
		{
			String message = e.getMessage();
			System.out.println(message);
			System.out.println("Arithmetic exception block");
		}
		
		finally
		{
			System.out.println("finally block");
		}
	
		
	}



//Example try –finally:

public static void main2(String[] args) {
		
		
		try {
			System.out.println("inside the try block");
			int i=10;
			int j = 0;
			int k = i /j;
		}
		
		finally
		{
			System.out.println("finally block");
		}
	}

}




