package Arrye;

public class ArryAssignment2 {

	
	public static void main(String[] args) {
//		WAP to print  the reverse string without reversing the letters but the words
//		ex. This is String ----> String is This 
		
		String s32 = "This is String";
		
		String[] s33 = s32.split(" ");
		
	
		for(int i=s33.length-1;i>=0;i--)
			
		{
			
			
			System.out.print(s33[i]+" ");
		}
	}
}