package StringPrograms;

public class Pelendrom {
public static void main(String[] args) {
	String s="Nayan";
	String reverse="";
	for(int i=s.length()-1;i>=0;i--) {
		char c = s.charAt(i);
		reverse=reverse+c;
		
	}
	System.out.println(reverse);
	if(s.equalsIgnoreCase(reverse)) {
		System.out.println("String is pelendrom");
	}
	else {
		System.out.println("String is not pelendrom");
	}
	
}
}
