package keyworlds;

public class BreakKeyworld2 {
	
		public static void main(String[] args) {
				
				
				for(int j =0; j<=5; j++)
				{
				
				for(int i = 0; i<=10; i++)
				{
					System.out.println("i value is "+i);
					if(i==2)
					{
						break;
					}
					
				}//Note : Here in the above example since break is inside the inner loop hence it only terminate the inner loop and then continue with outer loop.
				
				}
				
			}


}
