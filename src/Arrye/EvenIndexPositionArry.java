package Arrye;

public class EvenIndexPositionArry {
	
	//	WAP to print the values of even index position of an Array
	
	public static void main(String[] args) {
		
	
	
	String s1[] =new String[5];
	
	s1[0]= "abc";
	s1[1] = "def";
	s1[2] = "ghi";
	s1[3] = "klm";
	s1[4]= "nop";
	
	for(int i=0; i<5; i++)
	{
		if(i%2==0)
		{
			System.out.println(s1[i]);
		}
	}
//	WAP to add the all the elements of an array	
		int d [] = new int[5];
		int sum =0;
		d[0] = 10;
		d[1] = 21;
		d[2] = 2;
		d[3] = 60;
		d[4] = 60;
		
		for(int dd:d)
		{
			sum = sum +dd;
		}
		
		
		System.out.println(sum);

	}
}
