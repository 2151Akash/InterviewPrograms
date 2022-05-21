package Arrye;

public class LenghtVariable {

	
public static void main(String[] args) {
		
		int [] i = new int[8];
		i[0] = 10;
		i[1] = 21;
		i[2] = 2;
		i[3] = 60;
		i[4] = 60;
		i[5] = 2;
		i[6] = 60;
		i[7] = 60;
		
		System.out.println(i.length);//8
		
		for(int a=0; a<i.length; a++)
		{
			if(a%2==0)
			{
				System.out.println(i[a]);
			}
		}
		
	}

}
