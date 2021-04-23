package week1.day1;

public class Printduplicateelem {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,4,6,5,3,5,5};
		System.out.println(" the duplicate elements of the array is:");
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j])
					System.out.println(arr[i]);	
					
				
			}
			
		}
		
	}
}


