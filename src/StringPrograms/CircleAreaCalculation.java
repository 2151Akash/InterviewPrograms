package StringPrograms;

public class CircleAreaCalculation {
public static double area(int r) {
		
    	double pi=3.14;
		double	a= (r*r*pi);

		return a;
		
	}
public static void main(String[] args) {
	double areaofcircle=  area(10);
	System.out.println(areaofcircle);
	
	double areaofcircle2=area(4);
	System.out.println(areaofcircle2);
	
}
}
