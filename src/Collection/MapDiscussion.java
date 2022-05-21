package Collection;

import java.util.Collection;
import java.util.HashMap;

public class MapDiscussion {


	public static void main(String[] args) {
		

	HashMap<Integer, String> hm=new HashMap<Integer,String>();	
		hm.put(101, "Delhi");
		hm.put(506, "Pune");
		hm.put(404, "Mumbai");
		hm.put(900, "Bengaluru");
		
		hm.put(404, "Srinagar");
		hm.put(800, "Pune");//value can be duplicated but key can not duplicated
		hm.put(100, null);//Key cannot be duplicate/null if we try to make key as duplicate/null then 
		                  //it will automatically overwrite the latest value of it
		hm.put(100, null);
		System.out.println(hm);
		
	//	Methods inside the HashMap:
		
		Collection<String> value = hm.values();//to get all values
		System.out.println(value);
		
		String val = hm.get(101);
		System.out.println(val);
		
		boolean key = hm.containsKey(101);
		System.out.println(key);
		
		boolean valueisprsent = hm.containsValue("Pune");
		System.out.println(valueisprsent);
	}
}
