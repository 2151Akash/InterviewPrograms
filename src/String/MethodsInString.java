package String;

public class MethodsInString {
	

	public static void main(String[] args) {
//		1. equals(String s)
//		This method returns true if both the string are exactly identical to each other otherwise false.
		
		
		String s1 = "Velocity";
		String s2 = "velocity";
		
	boolean s3 = s1.equals(s2);
	
	System.out.println(s3);//false 
	
//	2. equalsIgnoreCase(String s)
	
//	This method returns true if the content of both the strings are equal irrespective of their case (can be either lower / upper case) otherwise false.
//space then give false
	
	String s4 = "Velocity";
	String s5 = "velOcity";
	
	boolean s6 = s4.equalsIgnoreCase(s5);
	
	System.out.println(s6);//true
	
//	3. length();
//This method returns the total number of characters available inside a String .
//space also count
	
	String s7 = "abcdefghi";
	
	int s8 = s7.length();
	
	System.out.println(s8);//9
	
//	4. charAt(int index);
// This method returns character value based on the index position
	String s9 = "abcdef";
	
	char s10 = s9.charAt(4);
	
	System.out.println(s10);//b

		
		
	}
	

}
