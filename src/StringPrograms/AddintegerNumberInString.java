package StringPrograms;

public class AddintegerNumberInString {

public static void main(String[] args) {
	String s="asfd45fjds8dnvs28cv5";
	int sum=0;
	int flag=0;
	String num="";
	for(int i=0;i<s.length();i++)
	{
		if(Character.isDigit(s.charAt(i))){//first find is character og digit give output true
		num=num+s.charAt(i);//store 4 in num next iteration we get 5 
		flag=1;//check we get number or not
		if(i!=(s.length()-1))
		{            //this condition is always true upto last position
			continue;//finding digit is process continue till last index postion
		}
	}
	if(flag==1) 
	{
		int value = Integer.parseInt(num);//sum =45
	sum=sum+value;//0+45=45
	num="";
	flag=0;
	}
	}
	System.out.println(sum);

	
}
}
