package week1.day1;

public class fibanoci {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int firstnum =0;
		int secnum = 1;
		int range = 8;
		int sum = 0 ;
		
		{System.out.println(firstnum);
		System.out.println(secnum);
			for (int i = 0; i <range; i++)
			{
				sum = firstnum + secnum ;
				firstnum = secnum;
				secnum = sum;
				System.out.println(sum );
			}
			
				
			}
		}

	}


