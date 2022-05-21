package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetInterface {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("pune");
		hs.add("aurangabad");            //insertion order is not preserverd
		hs.add("mumbai");
		hs.add("pune");                  //dupliated value are not allowed
		hs.add(null);                    //only one null value is allowed
		hs.add(null);
		System.out.println(hs);
		
		String[] s= {"aaa","bbb","cccc"};
		HashSet<String> hs1=new HashSet<String>(Arrays.asList(s));
		System.out.println(hs1);
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("pune");
		lhs.add("aurangabad");          
		lhs.add("mumbai");
		lhs.add("pune");                 
		lhs.add(null);                    
		lhs.add(null);
		System.out.println(hs);
	}

}
