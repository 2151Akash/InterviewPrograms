package constructor;

public class CallingofConstructor {
	
	
	  public CallingofConstructor(){
		
		System.out.println("EXECUTE METHOD ONE");
		}
       public CallingofConstructor(int a,String b) {
    	    
    	          
    	System.out.println("calling of method two");
    }
        public CallingofConstructor(int c,String g,boolean d) {
    	
    	this(5,"RAAJ" );                                                  //this keyword can be use only at first line
                                                                    	//calling of constructor in another constructor in same class
    	
    	System.out.println("calling of method three");
    	
    } 
       public static void main(String[] args) {
    	
    	CallingofConstructor a=new CallingofConstructor(3,"asdf" ,false);
	}
}
