package constructor;

public class Constructor{
	//SYNTAX
	// access specifier _classname()
//	{
//	two type of constructor     1.default Constructor
//		                        2.use Constructor
//	}
	 public Constructor() {
		 int a=10;
		 int b=20;
		 int c=a+b;
		 System.out.println(c);
		 
	 }
   public static void main(String[] args) {
	   Constructor t = new Constructor(); //constructor call by creating only object
	// Constructor t1 = new Constructor();//constructor call second time same as first time only change variable
	              t.m1();//"we can call non static method in main by using same constructor object"
}
   
   public void m1() {
	   System.out.println("we can call non static method in main by using same constructor object");
   }
   
}
