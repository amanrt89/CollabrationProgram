package Practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Cafe";
		String str2="Face";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char[]c1=str1.toCharArray();
		char []c2=str2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("Its Anagarm");
		}
		else
		{
			System.out.println("Its not Anagaram");
		}
		
		

	}

}
