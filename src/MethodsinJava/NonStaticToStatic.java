package MethodsinJava;

public class NonStaticToStatic {
	public  void m4() {
	System.out.println("execute method one");
	
	}   public static void m1() {
		System.out.println("execute method one");
		System.out.println("execute method one");
		NonStaticToStatic A=new NonStaticToStatic();
		A.m4();//SAME CLASS
		NonStatiToNonstaticDiff b=new NonStatiToNonstaticDiff();	
		b.m6();//different class
	}
public static void main(String[] args) {
	NonStaticToStatic b=new NonStaticToStatic();
b.	m4();
	m1();
}
}
