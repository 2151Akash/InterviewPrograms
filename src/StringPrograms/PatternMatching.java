package StringPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args) {
		int count =0;
		String s="aabcdefabcdefghiabc";
		Pattern pat = Pattern.compile("abcdef");//which sting we check
		Matcher mat = pat.matcher(s);           //which string we locate
		
		while(mat.find())
		{                                       //find method return true value
			count++;
		}
		System.out.println(count);
	}

}
