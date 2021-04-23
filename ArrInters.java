package week1.day1;

public class ArrInters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10, 20, 56, 62};
		int[] arr2 = { 20, 16, 53, 63};
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				
				if(arr1[i] == arr2[j])
				{
					System.out.println(arr2[j]);
				}
					
			}
		}

	}

}
