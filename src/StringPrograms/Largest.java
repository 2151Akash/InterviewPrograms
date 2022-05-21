package StringPrograms;

public class Largest {

	public static void main(String[] args) {
		String s="Welcome To Automation";
		String lower ="";
		String upper="";
		for(int i=0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			if(ch>=65 && ch<=90) {
				upper=upper+ch;
			}
			else {
				lower=lower+=ch;
			}
		}
		System.out.println(lower);
		System.out.println(upper);
	}
}
