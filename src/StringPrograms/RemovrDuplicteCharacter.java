package StringPrograms;

public class RemovrDuplicteCharacter {

	public static void main(String[] args) {
	String s="asdfasdf";
	String s1="";
	for(int i=0;i<s.length();i++) {
		boolean found = false;
		for(int j=0;j<s1.length();j++) 
		{
			if(s.charAt(i)==s1.charAt(j)) {
				found =true;
				break;
			}
		}
		if(found ==false) {
			s1=s1+s.charAt(i);
		}
	}
	System.out.println(s1);	
	}
}