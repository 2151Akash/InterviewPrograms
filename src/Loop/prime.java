package Loop;

public class prime {
	public static void main(String[] args) {
	int value=30;
	int count=0;
	int base=1;
	
	while(base>0)
	{
		int num=base;
		int i=2;
		
		while(num>i)
		{
			if(num%i==0) {
				break;
			}
			i++;
		}
		if(num==i)
		{
			System.out.println("prime="+num);
			count++;
		}
		if(count==value) {
			break;
		}
		base++;
	}
	}
}
	