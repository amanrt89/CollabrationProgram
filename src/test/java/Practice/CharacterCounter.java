package Practice;

import java.util.HashMap;

public class CharacterCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "   absdbasdnas3231546447821321@#!&*!@@*&#";
		 
		HashMap <Character,Integer>hs=new HashMap<>();
		for(int i=0;i<=str.length()-1;i++)
		{
			char c=str.charAt(i);
			if(hs.containsKey(c)) {
				hs.put(c, hs.get(c)+1);
			}else {
				hs.put(c, 1);
			}

		}
		System.out.println(hs);
	}

}
