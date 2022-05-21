package Arrye;

public class ArryDiscussion2 {
public static void main(String[] args) {
	
//	WAP to print the values of even index position of an Array
	

	int a[]=new int[5];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	
	
	//System.out.println(a[0]);
	for(int i=0;i<=a.length;i++) {
		if(i%2==0) {
			System.out.println(a[i]);
		}
	}
}
}