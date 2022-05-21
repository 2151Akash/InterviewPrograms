package Arrye;

public class Methods {
	
	public static void main(String[] args) {
		
	
		// 14. split(String s)
				
			String s32 = "This is String";
				
			String[] s33 = s32.split("i");
			
			for(String ss:s33)
			{
				System.out.println(ss);
			}
	
//			15. toCharArray():: This method returns a char array of the given String.
			
			String s34 = "String Value #123";
			
			char[] chararray = s34.toCharArray();
			
			int sizee = chararray.length;
			
			for(int ii= 0; ii<sizee; ii++)
			{
				System.out.println(chararray[ii]);
			}
			
			
//			16. ValueOf(primitive data type)
			
			int val = 100;
			String stringvalue = String.valueOf(val);
			
			System.out.println(stringvalue+55);//10055

	

	}

}
