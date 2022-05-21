package Collection;

import java.util.Arrays;
import java.util.HashSet;

public class RemovingDuplicatedFromArreay {

	public static void main(String[] args) {
		Integer i [] = new Integer[5];
		
		i[0]= 10;
		i[1]= 30;
		i[2]= 20;
		i[3]= 20;
		i[4]= 40;
		Arrays.sort(i);          //Through this array will get sort in ascending order.
		for(int ii:i)
		{
			System.out.println(ii);
		}
HashSet<Integer> hs1=new HashSet<Integer>(Arrays.asList(i));
System.out.println(hs1);

}
}