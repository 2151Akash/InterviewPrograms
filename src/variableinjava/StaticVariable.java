package variableinjava;

public class StaticVariable {
	static int a=10;
	public static void main(String[] args) {
		System.out.println(a);//calling of static variable in same class
		a =a+5;
		System.out.println(a);
		a=20;
		System.out.println(a);//take recent value
		
		System.out.println(Test.b);//different class calling static variable
		StaticVariable d=new StaticVariable();
		d.nonstatic();


	}
	public void nonstatic() {
		int a=20;
		System.out.println(a);
	}
}

	


