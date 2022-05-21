package StringPrograms;

public class PrimeNumberSeries {
public static void main(String[] args) {
	
	int num =0;
	for(int a=3;a<=30;a++)
	{
		for(int b=2;b<=a-1;b++)
		{
			if(a%b==0)
			{
				num=num+1;
			}
		}
		if(num==0)
		{
			System.out.println(a);
		}
		else
		{
			num=0;
		}
	}
}
}
