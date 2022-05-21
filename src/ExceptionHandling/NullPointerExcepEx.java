package ExceptionHandling;

public class NullPointerExcepEx {
	
static NullPointerExcepEx a;//non primitive data type bze of class
	
	public  void m1()
	{
		System.out.println("m1 method is executing");
	}
	
	public static void main(String[] args) {
		
		
		try {
			
		a.m1();
		
		}
     catch( NullPointerException e)
		{
			System.out.println("null pointer exception arrived");
			
		}
		
		System.out.println("After catch block");
	}

	}

