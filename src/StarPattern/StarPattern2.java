package StarPattern;

public class StarPattern2 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)// outer for loop
		{
			for(int j = 1; j<=9; j++)// inner for loop
		{
			if((j>=6-i)&&(j<=i+4	))

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




}
