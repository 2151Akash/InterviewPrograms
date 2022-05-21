package StarPattern;

public class Diamond {
	public static void m1()
	{
		
   for	(int i=1;i<=4;i++) 
   {
	
	for (int j=1;j<=7;j++)
	{
		
		
		if((j>=5-i)&&(j<=i+3))
			
		{
			
			System.out.print("*");
			
		}
		else
		{
				System.out.print(" ");
			}
		
			}
	          System.out.println();	
	}
	}
	      public static void m2()
     	{
		for	(int i=5;i<=7;i++)
		{
		
		for (int j=1;j<=7;j++) {
			
			
			if((j>=i-3)&&(j<=11-i))
			{
				
				System.out.print("*");
				
				
			}
			else
			{
					System.out.print(" ");
				}
			}
		           System.out.println();
		}
		
	}public static void main(String[] args) {
		m1();
		m2();
	}
	
}
