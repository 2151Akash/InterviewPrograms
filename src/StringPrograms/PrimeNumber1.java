package StringPrograms;

public class PrimeNumber1 {
	public static void main(String[] args) {
	String s="this is string";
	String rev="";
	for(int i=0;i<=s.length()-1;i++) {
		char value = s.charAt(i);
		rev=rev+value;
		System.out.println(value);
	}
	
}}