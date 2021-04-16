package week1.day1;

public class charOccurance {

	public static void main(String[] args) {

		String str = "welcomeeeeeetochenwnai";
		int count =0;
		int[] freq = new int[str.length()];
		int i = 12,j;
		char[] chr = str.toCharArray();
		
		System.out.println("the equalent is" + " " + chr[i]);
		int len = chr.length;
		System.out.println("the character length is " + " " + len);
		for (i =0; i< chr.length;i++ ) 
			if (chr[i] =='w') {
				count++;
				
			}
							
System.out.println("the count of w is :"+count );
	}}