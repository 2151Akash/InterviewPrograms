package String;

public class BasicConcept {
	//String it is a class present under java package

	
	public static void main(String[] args) {
		
		String s = new String("abc");//object created in heap and scp area
		
		String s1 =  new String("def");
		
		String ss = "jkl";//object created in only scp AREA
		
		String ss1 = "jkl";
		
		String s2 =  new String("jkl");
		
		String s3 = new String("abc");
		
		String ss2 = "abc";
		
		
	boolean ispointingsame = ss==ss1;
	System.out.println(ispointingsame);//true check object
	
	
	boolean ispointsameobj = ss==s2; //object are different
	
	System.out.println(ispointsameobj);//false
		
	
	
	boolean isequal = s3.equals(s);//only check content are equal or not
	
	System.out.println(isequal);//true check content
	
	
	boolean isequal2 = ss.equals(s2);
	System.out.println(isequal2);// true
	
	
	
	String var1 = "Velocity";
	
	
      var1.concat(" Corporate");
// To change the original String we have to assign the new value to the original String 
      
 // var1  = var1.concat(" Corporate");// Output of String is Velocity Corporate
	
	System.out.println("Output of String is "+var1);// Velocity--> Immutable not concat
	
	
	System.out.println("*********************************");
	
	StringBuffer sb = new StringBuffer("Velocity");
	
	sb.append(" Corporate");
	
	System.out.println("Output of String Buffer is "+sb);// Velocity Corporate ---> Mutable concat
	
	
	
	}
}
