package Collection;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedListClass {
public static void main(String[] args) {
	LinkedList<Integer> ld=new LinkedList<Integer>();
	ld.add(20);
	ld.add(20);
	ld.remove(0);
	ld.set(0, 50);
	System.out.println(ld);
	
	//Vector is a class which implements List interface. It got introduced in 1.0 v hence it is also known as Legacy class.


	Vector<String> vc=new Vector<String>();
	vc.add("asd");
	System.out.println(vc);
	
}

}
