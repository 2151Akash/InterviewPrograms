package variableinjava;

public class College {
	String name ;
	
	static String collegename;
	
	int mathsmarks;
	
	int age;
	
	static String collegecity;
	
	String nativeplace;
	public static void main(String[] args) {
		
		College s=new College();
		s.name="Akash";
		collegename="pune";
		s.age=23;
		s.mathsmarks=145;
		collegecity="narhepune";
		
		College s2=new College();
		s2.name="sandip";
		collegename ="pune";
		
		System.out.println(s.name);
		System.out.println(collegename);
		System.out.println(collegecity);
		System.out.println(s2.name);
		System.out.println(collegename);
		System.out.println(collegename);
	}
	

}
