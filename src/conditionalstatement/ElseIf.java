package conditionalstatement;

public class ElseIf {
	public static void main(String[] args) {
		int a=20;
		int b=30;
		
		if (a>=35) {
			System.out.println("if statement is execute 35");
		}
		else if(b>=40)
		{
			System.out.println("if statement is execute 40");
		}
		else if (b>=30) {
			System.out.println("if statement is execute 30");
			
		}
		else {
			System.out.println("else statement is execute ");
		}
	}
}


