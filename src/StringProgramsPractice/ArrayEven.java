package StringProgramsPractice;


public class ArrayEven {
public static void main(String[] args) {

	String s="AAkaskhh";
	int d=0;
	for(int i=0;i<=s.length()-1;i++) {
		for(int j=i+1;j<=s.length()-1;j++) {
			char c = s.charAt(i);
			char c1 = s.charAt(j);
			if(c==c1) {
				d++;
				System.out.println(c);
			}
		}
	}
	System.out.println(d);
}
}