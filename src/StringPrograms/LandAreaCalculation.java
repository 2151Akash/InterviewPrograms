package StringPrograms;

public class LandAreaCalculation {
	public static int area(int l,int b) {
		
    	int	a=l*b;

		return a;
		
	}
	public static void farmername() {
		System.out.println(" Farmer - Sandipanna Ghate");
	}
	
public static void main(String[] args) {
	System.out.println("**************************");
	  farmername();
	  System.out.println("**************************");
	  System.out.println("------------------------");
	  
     int land1=area(10,10);
         System.out.println( "Area1 =" +land1+"sq");
     
     System.out.println("-------------------------");
     
     int   land2=area(20,20);
     
      System.out.println("Area1+Area2 =" +land1+land2+"sq");
      System.out.println("------------------------");
      
      int land3=area(5,5);
      System.out.println("Total Area =" +land1+land2+land3+"sq");
      
	
}
}
