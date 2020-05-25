package practice;

import java.util.ArrayList;
import java.util.List;

public class Palindrom {

	public static void main(String[] args) {
		
		
		String a ="RACE CAR";//MOM
		String r ="";
		List<Character> c = new ArrayList<Character>();
	
		///char[] orgArray = a.toCharArray();
		
		for (int i = a.length()-1;i>=0;i--) {
			r= r+a.charAt(i);
			
					
		}

		if (a.equals(r)) {
			System.out.println("Palindrom ");
			
		}
		else {
			System.out.println("NOt");
		}
	}
}
