package String;

public class Assignment3 {

	
	public static void main(String[] args) {
		
		
		String s="aa12dd34ff45gh";
		
		String s2 = s.replaceAll("[a-z]", "0");
		
		System.out.println(s2);
		
		String[] s5 = s2.split("0");
		
		for(String s6:s5) {
			
			System.out.print(s6);
			
		}
	 
}}
