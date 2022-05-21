package StringPrograms;

public class SpaceCount {
public static void main(String[] args) {
	String s= "My Name Is Akash";
	int d=0;
	for(int i=0;i<=s.length()-1;i++) {
		char c = s.charAt(i);
		if(c==' ') {
			d++;
		}
	}System.out.println(d);
	
	
}
}
