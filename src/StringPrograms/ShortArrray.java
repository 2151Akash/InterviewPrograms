package StringPrograms;

import java.util.Arrays;

public class ShortArrray {

	public static void main(String[] args) {
		
		int a[]= {2,7,4,5};
		
		Arrays.sort(a);  //return output in asending order
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
