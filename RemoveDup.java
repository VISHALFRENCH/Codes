package week1.day1;


public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =" welcome to java java program";
		String [] word = str.split("\\s");
		System.out.println("original string:"+str);
		
		for (int i = 0; i < word.length; i++) {
			for (int j = 0; j < word.length; j++) {
				if(word[i].equals(word[j]))
				{
					if(i != j) {
						word[i] = "";
						
					}
					
						}
					}
				}
		for (int k = 0; k < word.length; k++) {
			if (word [k] != "") {
				System.out.print(word[k]+"  ");
					
			}
		}

	}

}
