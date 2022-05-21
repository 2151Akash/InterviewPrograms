package Casting;

public class NonPrimitiveChild extends NonPrimitveParent{

	public void m1()
	{
		System.out.println("m1 method of child class" );
	}
	
	public static void main(String[] args) {
		
		//up casting
		
		NonPrimitiveChild c  =  new NonPrimitiveChild();
		
		NonPrimitveParent d = (NonPrimitveParent)c;// UP casting
		
		d.m1();// child class
		
		d.m2();//parent class
		
		//down casting
		
		NonPrimitveParent p = new NonPrimitveParent();
		
//		Child cc = (Child)p;// Down casting
//		
//		cc.m1(); //but it is not valid we get ClassCastException
		
		NonPrimitiveChild g = (NonPrimitiveChild)d;// Down Casting
	
		g.m1();
		g.m2();
	
		
	}

}
