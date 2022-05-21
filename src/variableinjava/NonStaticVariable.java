package variableinjava;

public class NonStaticVariable {
	 int a=20;
	 int k =25;
	public static void main(String[] args) {
		NonStaticVariable d=new NonStaticVariable();
		System.out.println(d.a);
		d.m2();
		NonStaticVariable e=new NonStaticVariable();
		e.a=30;
		System.out.println(e.a);
		System.out.println(d.k);
		d.k=35;
		System.out.println(d.k);
		
	}
public  void m2()
{ int k=100;

	System.out.println(k);
}

	

}
