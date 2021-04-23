package week1.day1;

public class PrimeNumber {

	
	public static void main(String[] args){
		
		
		int i, m=0, flag=0; 
		int input = 3;
		 m = input/2;
		if(input == 0 || input == 1) {
			System.out.println("Not a prime number");
		} else {
			for (i = 0; i < args.length; i++) {
				if (input%i == 0) {
					System.out.print("not a prime number");
				flag = 1;
				break;
				
				}	}
				if (flag == 0) {
					System.out.print("it is a prime number");
					

}}}}
