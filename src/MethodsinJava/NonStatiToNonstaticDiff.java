package MethodsinJava;

public class NonStatiToNonstaticDiff {
	public  void m6() {
		System.out.println("execute method one");
		System.out.println("execute method one");
		NonStaticMethodSameClass A=new NonStaticMethodSameClass	();
				A.m4();//non static to non static different class
	}
public static void main(String[] args) {
	NonStatiToNonstaticDiff A=new NonStatiToNonstaticDiff();
			A.m6();
}
}
