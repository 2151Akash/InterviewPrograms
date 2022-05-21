package MethodsinJava;

public class StaticMethodCalling {
	public static void m2() {
	System.out.println("execute method one");	
	}
	public static void m3() {
		System.out.println("executing methid two");
		m2();//static to static same class
	}
public static void main(String[] args) {
	m2();
	m3();
	StaticMethod.m1();//static to static different class
	
}
}
