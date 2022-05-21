package String;

public class ReverseString {
public static void main(String[] args) {
	
// print reverse of a String value
	

    String s9 = "Velocity";
  
	for(int a1= s9.length()-1;a1>=0;a1--) {
     
	char s10 = s9.charAt(a1);
	
	System.out.print(s10);//b
	}
	ReverseString f=new ReverseString();
	String d="";
	System.out.println(d);
	f.m1();
	
}
public void m1() {
	String a="Velocity";
	
	for(int d=0;d<=a.length()-1;d++) {
	char b = a.charAt(d);
	System.out.println(b);
	}
}
}
