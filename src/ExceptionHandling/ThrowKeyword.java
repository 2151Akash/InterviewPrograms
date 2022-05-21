package ExceptionHandling;

public class ThrowKeyword {
	

	static int i= 21;
	static int j = 20;

		
	
	
	public static void m1()
	{
		if(i>j)
		{
		System.out.println("null pointer");
       throw new NullPointerException("throwing exception for example1");
	}
	else
	{
		System.out.println("arithmetic");
		
		throw new ArithmeticException("throwing exception for example2");
	}
	
	}
	
	public static void main(String[] args) {
		m1();
	}
	
		
}
