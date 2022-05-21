package Collection;

import java.util.ArrayList;

public class ListInterface {
	public static void main(String[] args) {
		
	

	ArrayList al=new ArrayList();  //it not prefared because it shows warning

	al.add(50);
	al.add("abc");
	al.add(true);
	//System.out.println(al);
	
    ArrayList<String> al1=new ArrayList<String>();
    al1.add("abc");
    al1.add("def");
    al1.add("ghi");
    al1.remove(0);                                   //remove index o position
    al1.add(1, "mno");                               //replace index 1 position
    al1.set(1, "jkl");
    al1.add("mno");
    al1.add("mno");                                   //duplicate value allowed
    System.out.println(al1);
    
    ArrayList<String> al2=new ArrayList<String>();
    al2.add("Delhi");
    al2.add("Mumbai");
    al2.add("kolcatta");
    al2.add("pune");
    al2.addAll(al1);                                 //Addition of contents to another ArrayList:
    System.out.println(al2);                         //give output recent arraylist

boolean ispresent = al2.containsAll(al1);
	
	System.out.println(ispresent);
	
	 al2.removeAll(al1); //To check whether all the content of al1 is present inside the Al2 or not

	  System.out.println(al2);//To remove all the contents of al1 from al2 use removeAll method
	}
}