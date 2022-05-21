package MethodsinJava;

public class StaticToNonStatic {public static void m7() {
	System.out.println("execute method one");	
	}
public  void m6() {
	System.out.println("execute method one");
	  m7();//static to non static same class
	  StaticMethod. m1();//static to non static different class
}
}
