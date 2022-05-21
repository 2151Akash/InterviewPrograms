package variableinjava;

public class LocalVariable {
	
	public static void main(String[] args) {
	int i=24; 
		System.out.println(i); 
		LocalVariable d=new LocalVariable();
		if(i<20)
		{
			System.out.println(i);
			
			 int k = 50;
			
			System.out.println(k);
		}
		else
		{ System.out.println("i is not greater than 20");
  
	} 
	
          d.addition();
} public   void addition() {
	int i = 20;
	int j= 30;
	int k = i+j;
	
	System.out.println("The added output is "+k);

	}
}