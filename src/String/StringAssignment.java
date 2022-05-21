package String;

public class StringAssignment {
	
//	WAP to count a character in a String 
	
public static void main(String[] args) {
	 String a="Aaaabbbccddffgh";
	 int count =0;
	 
	 for(int i=0;i<=a.length()-1;i++) {
		char a1 = a.charAt(i);
		
		if(a1=='A')
		{
			count++;
		}
	 }
	 System.out.println(count);
}

}
