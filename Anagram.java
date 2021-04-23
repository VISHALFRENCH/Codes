package week1.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args)
	{
		
		String s1 =" step";
		String s2 = "pet";
		
		boolean isAnagram = false;
		if (s1.length() == s2.length()) {
		char[] charArr1 = s1.toCharArray();
		char[] charArr2 = s2.toCharArray(); 		
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		for (int i = 0; i < charArr1.length; i++) {
			for (int j = 0; j < charArr2.length; j++) {
				if (charArr1[i] == charArr2[j]) 
					isAnagram = true;
					
				}
			
				
			}
			
		}
		if (isAnagram) {
			System.out.print(s1 +" &" + s2+" both are Anagram");
		}else
		{
			System.out.println(s1+" & "+s2+"both are not anagrams");
		}}
		
			
		}

	

