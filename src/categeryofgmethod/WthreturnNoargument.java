package categeryofgmethod;

public class WthreturnNoargument {	
	//c. method with return type and no argument
		
	public static int m1() {
		System.out.println("method with return type");
		
		return 100;
		
	}
	public static void main(String[] args) {
		int c =m1();
		m1();
		System.out.println(c);
		int d=m1();
		System.out.println(d);
		
		WthreturnNoargument a=new WthreturnNoargument();
		String h =a.m5();
		System.out.println(h);
		
	}
	public String m5() {
		String s="corporate";
				System.out.println(s);
		return "velocity";
	}

}
