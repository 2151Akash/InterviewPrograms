package StringPrograms;

public class ThisisString {
public static void main(String[] args) {
	String s2="This is String";
	  
	 String[] s3 = s2.split(" ");

		for(int j=s3.length-1;j>=0;j--)
		{
			System.out.print(s3[j]+" ");
		}
}

}
