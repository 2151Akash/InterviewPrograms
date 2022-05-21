package variableinjava;

public class ThisKeyWorld {
	static int i=50;
	int k=60;
	public static void main(String[] args) {
		
		int i=10;
		
		System.out.println(i);//local-10
		System.out.println(ThisKeyWorld.i);
		ThisKeyWorld a=new ThisKeyWorld();
		a.m1();
		ThisKeyWorld.m3();
	}
public void m1() {
	int k=50;
	System.out.println(this.k);
	System.out.println(k);
}public static void m3() {
	int k =80;
	System.out.println(k);
	NonStaticVariable c =new NonStaticVariable();
	System.out.println(c.k);
}
}