package week1.day1;

public class OddIndexUpp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Chennai";
		String[] charArr = str.split ("");
        String  sep = "";
        for (int i = 0; i < charArr.length; i++) {
        	if(i%2 == 1)
        	{
        		sep = sep + charArr[i].toLowerCase();
        		
        	}
        	else
        		sep = sep + charArr[i].toUpperCase();
        	}
        System.out.println("the result is "+sep);
	}

}
