package String;

public class MethodsInString1 {
	
public static void main(String[] args) {
	

//	5. replace(char old, char new)
//: This method replace the old char with new character 
	
	String s13 = "abcdef";
	
	String s14 = s13.replace('b', 'f');
	
	System.out.println(s14);
	
//	6. replace(String old, String new)
// This method returns a replaced String value
	String s15 = "Constructor";
	
	String s16 = s15.replace("truc", "tor");
	
	System.out.println(s16);


//	7. substring(int index):
//This method returns a String value which is starting from the provided index value.
	
	String s17 = "Velocity";
	
	String s18 = s17.substring(4);
	
	System.out.println(s18);
	
//	8. substring(intbeginindex, intendindex)
//: This returns a string value which starts from the beginindex position to the endindex position-1.
	String s19 = "Corporate";
	
	String s20 = s19.substring(2, 7);
	
	System.out.println(s20);
	
//	9. contains(String value)
//: This method returns the true if the sequence we have provided is matched 
	String s21 = "abcdefghijklk";
	
	boolean s22 = s21.contains("lk");
	
	System.out.println(s22);//true
	
//	10. toLowerCase()
//: This method returns a String which is actually a String with all the characters in lowercase.
	String s23 = "VELOciTy";
	
	String s24 = s23.toLowerCase();
	
	System.out.println(s24);
	
//	11. toUpperCase()
//This method returns a String which is actually a String with all the characters in Uppercase.
	String s25="VeLOcity";
	String s26 = s25.toUpperCase();
	
	System.out.println(s25);//VELOCITY


	
	
//	12. indexOf(char char)
//This method returns an index position of the character that we have provided from the string value.
	
	String s27= "abcdefabc";
	
	int s28 = s27.indexOf('b');
	
	System.out.println(s27);//1
	

	
//	13. trim()
//This method is used to remove all the spaces associated with the String at starting and trailing point.
	
	String s29 = "     Happy new year     ";
	
	String s30 = s29.trim();
	System.out.println(s30);//Happy new year
	
//	To convert String to primitive data type we have to use parseXxx();
	
//parasxxx -convert string into primitive 
	
     String s36 = "10";
	
	int s37 =Integer.parseInt(s36);
	
	int addedvalue = s37+2;
	
	System.out.println(addedvalue);//12

String d1="56.23";
double d2 = Double.parseDouble(d1);

System.out.println(d2);

	
//18. isDigit(char c)  ): This method returns true if the provided character is a digit otherwise it returns false.

char s43 = '8';
	
boolean s44 = Character.isDigit(s43);

System.out.println(s44);//true

	 char d4='5';
	boolean d5 = Character.isDigit(d4);
	System.out.println(d5);
	

//	19. isAlphabetic(char ch);): This method returns true if the provided character is an alphabet otherwise it returns false.
	
	char s45 = 'g';
	
	boolean s46 = Character.isAlphabetic(s45);
	
	System.out.println(s46);//true


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	

}
}