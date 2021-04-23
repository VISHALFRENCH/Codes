package week1.day1;

public class SumofIndexes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, n = 123;
		while(n!=0) {
			sum = sum +n % 10;
			n = n/10;
		}
System.out.println(sum);
	}

}
