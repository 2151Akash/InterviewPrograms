package Collection;

import java.util.TreeSet;

public class TreeSetDiscussion {
public static void main(String[] args) {
	
	TreeSet<String> ts=new TreeSet<String>();
	ts.add("pune");
	ts.add("bangalure");
	ts.add("csk");
	ts.add("mumbai");
	 ts.add("pune");
   //ts.add(null);     null value are not allowed and duplicated value alseo
	//System.out.println(ts);
	//bydefault stored value in asending order
	
       //	Representing data in descending order:
	 
   TreeSet<String> ts2 = new TreeSet<String>(new MyComp());
	
	ts2.add("Delhi");
	ts2.add("Mumbai");
	ts2.add("Kolkata");
	ts2.add("Chennai");
	ts2.add("Pune");
	ts2.add("Delhi");
	
	System.out.println(ts2);
	
	
}

}
