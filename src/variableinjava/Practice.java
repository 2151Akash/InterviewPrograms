package variableinjava;

public class Practice {
	public  void m1()
	
	{
		System.out.println("execute method one");
	m2();
		
	}
	public  void m2() {
		System.out.println("execute method two");
	}public static void main(String[] args) {
		PracticeClass2 var=new PracticeClass2();
		var.m3();
		Practice a=new Practice();
	
	   a.m1();
		
	}
	

}
