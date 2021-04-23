package week1.day1;

import java.util.Iterator;

public class Findsum {
	
	public static int findSum(String Str) {
		String temp = "0";
		String app ;
		int sum = 0;
		for (int i = 0; i < Str.length(); i++) {
		char charAt =	Str.charAt(i);
		if (Character.isDigit(charAt))
		{
			temp += charAt;
			
		}
		else
		{
			char[] charArray = temp.toCharArray();
		for(char c : charArray) {
			app = c +"";
			sum += Integer.parseInt(app);
			
		}
		temp ="0";
		
		}}
		return sum +Integer.parseInt(temp);
			}
		public static void main (String[] args)
		{
		
			String str ="123abc";
			System.out.println(findSum(str));
	}
	}
		
	


