package String;

public class FirstCapitalLetterConvert {
	public static void main(String[] args) {
		 String s5=" my name is akash";
		 String s6="";
		 for(int i=0;i<=s5.length()-1;i++) 
		 {
			char ch = s5.charAt(i);
			
			if(ch==' ') 
			{
				s6=s6+ch;
				i++;
				ch=s5.charAt(i);
				s6=s6+Character.toUpperCase(ch);
			}
			else
			{
				s6=s6+ch;
			}
		 }
		 System.out.println(s6);
	}

}
