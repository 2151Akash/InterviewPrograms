package Loop;

public class Prime1 {
public static void main(String[] args) {
	
	for(int i=1;i<=8;i++) 
	{
		for(int j=1;j<=8;j++)
		{
		if(i%j==0 && i%2==1)
		{
			System.out.println(i);
		}
		i++;
		}
		
	}
	
}
}
