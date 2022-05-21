package Arrye;

public class AdvanceForLoop {
public static void main(String[] args) {
	

	
	byte []a=new byte [4];
	a[0]=2;
	a[1]=4;
	a[2]=6;
	a[3]=8;
	
	System.out.println(a[1]);
	
	
	for (byte d:a) {           //advance for loop
		System.out.println(d);
	}
	
	String []a1=new String [4];
	
	a1[0]="a";
	a1[1]="b";
	a1[2]="c";
	a1[3]="d";
	
	for (String d:a1) {
		if(d.equals("a"));{
		d=d+34;
		
	}
	System.out.println(d);
}
}
}
