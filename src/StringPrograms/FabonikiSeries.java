package StringPrograms;

public class FabonikiSeries {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int c;
	    c=b;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	while(c<=50) {
		a=b;
		b=c;
		c=a+b;
		System.out.println(c);
	}
	
	
	
}
}
