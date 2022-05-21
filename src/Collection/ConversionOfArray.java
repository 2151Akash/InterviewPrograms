package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionOfArray {

	public static void main(String[] args) {
		
		//conversion from array to arraylist
		
		String s[]= {"aaa","bbb","ccc"};
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(s));
		System.out.println(al);
		
		//conversion from arraylist to array
		ArrayList <Integer> al1=new ArrayList<Integer>();
		al1.add(12);
		al1.add(23);
		al1.add(45);
		int length = al1.size();
		
		Integer a[]=new Integer[length];
		al1.toArray(a);
		
		for(int aa:a) 
		{
			System.out.println(aa);
		}
	}

}
