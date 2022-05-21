package String;

public class CountChar {

	
//	WAP to count a character in a String 
	
	public static void main(String[] args) {
		
	
	
	String s28 = "aabbaaccd";
	
	int count =0;
	
	for(int i=0; i<s28.length(); i++)
	{
		char c = s28.charAt(i);
		
		if(c=='b')
		{
			count++;
		}
	
	}
	System.out.println(count);

}}
