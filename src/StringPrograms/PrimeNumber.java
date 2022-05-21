package StringPrograms;

public class PrimeNumber {
public static void main(String[] args) {
	int a=7;
	int num=0;
	for(int c=2;c<=a-1;c++) 
	{
		if(a%c==0) 
		{
			num=num+1;
		}
	}
	
	if(num==0) 
	{
		System.out.println("number is prime");
	}
	else
	{
		System.out.println("number is not prime");
	}
}
}
