package accesmodifier;

public class Class2 {
	//public access within or outside package

	public static void main(String[] args) {
		Class1 a=new Class1();
		a.test();
		System.out.println(a.a);
		System.out.println(Class1.b);
		m3();
		Class2 g=new Class2();
		g.m6();
	}
	public static void m3() {
		System.out.println("hello2");
		Class1 a=new Class1();
		a.test();
	}
	public void m6() {
		//default access another class
		ClassDefault z=new ClassDefault();
		z.m5();
		PrivateModifier v=new PrivateModifier();
	
		
	}

}