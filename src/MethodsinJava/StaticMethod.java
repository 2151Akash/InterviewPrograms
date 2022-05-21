package MethodsinJava;

public class StaticMethod {
	public static void m1() {
		System.out.println("execute method one");
		System.out.println("execute method one");
		}
	public static void m2() {
		System.out.println("execute method two");
		System.out.println("execute method two");
		}
	public static void main(String[] args) {
		m1();
		m2();
		m2();
	}
}
