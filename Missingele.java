package week1.day1;

public class Missingele {
	static int getMissingNum(int a[], int n) {
		  int i,total;
	      total =(n+1)*(n+2)/2;
	      for (i= 0; i < n; i++) 
	      {
	    	  total -= a[i];
	    	  
	      }
	      return total;
	
	}

	public static void main(String[] args)
	{
		
    int [] a = {1,2,3,4,6};
    int missingNum = getMissingNum(a, 5);
    System.out.println("the missing number is :"+missingNum);
	} 
	

} 
