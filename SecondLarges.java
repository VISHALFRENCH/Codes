package week1.day1;

import java.util.Arrays;

public class SecondLarges {
	public static int getSecondlargest( int []a, int total) {
		
		Arrays.sort(a);
		return a[total-2];
		
	}public static void main(String args[]) {
	
		
		int a[]= {1,2,3,5};
		int b[]= {6,16,89,56};
		System.out.println("Second largest"+getSecondlargest(a, 4));
		System.out.println("second largest "+getSecondlargest(b, 4));
	}

}

	



