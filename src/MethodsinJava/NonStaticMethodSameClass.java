package MethodsinJava;

public class NonStaticMethodSameClass {
	public  void m4() {
	System.out.println("execute method one");
	System.out.println("execute method one");
	}
	public  void m5() {
		m4();//non static to non static same class
		System.out.println("execute method one");
		System.out.println("execute method one");
		}

public static void main(String[] args) {
	NonStaticMethodSameClass a=new NonStaticMethodSameClass();
	a.m5();

	
}
	
}
