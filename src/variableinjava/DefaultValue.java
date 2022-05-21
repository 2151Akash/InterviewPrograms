package variableinjava;

public class DefaultValue {
	String s;
	int i;
	char c;
	static float f;
	boolean b;
	public static void main(String[] args) {
		DefaultValue a= new DefaultValue();
		
		System.out.println(a.i);//0
		System.out.println(a.c);//space
        System.out.println(f);//0.0
		System.out.println(a.b);//true false
		System.out.println(a.s);//null
	}

}
