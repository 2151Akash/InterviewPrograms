package String;

public class ReplaceAllMethod {
	
//	20 replaceAll(String str):
	
	
	public static void main(String[] args) {
		
	
	String s="A@@c3c4e32%#nt324ure";
	
       String s1 = s.replaceAll("[a-z]","." );
	
//	System.out.println(s1);
	
String s3 = s1.replaceAll("[a-c]", "  ");

//System.out.println(s3);

String s4 = s1.replaceAll("[A-Za-z]", "  ");

//System.out.println(s4);

String s5 = s.replaceAll("[^a-z]", "1");

//System.out.println(s5);

String s6 = s.replaceAll("[^a-zA-Z]", "1");

//System.out.println(s6);


String s7 = s.replaceAll("[0-9]", "ll");

System.out.println(s7);

	}

}
