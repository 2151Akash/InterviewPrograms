package accesmodifier1;

import accesmodifier.Class1;
import accesmodifier.Class2;
import accesmodifier.ProtectedModifier;

//calling public in another package



public class Class3 extends ProtectedModifier{

	public static void main(String[] args) {
		Class1 a=new Class1();
		a.test();
		Class3 m=new Class3();
		m.test3();
	}
	
public void test3() {
	Class2.m3();
	Class3 n=new Class3();
	n.m9();
}
}
