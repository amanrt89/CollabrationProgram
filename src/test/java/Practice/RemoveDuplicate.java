package Practice;

import java.util.HashMap;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str="gfdvdsfwefsdf";
		
		HashMap<Character,Integer> hs=new HashMap<>();
		for(int i=0;i<=str.length()-1;i++)
		{    char c=str.charAt(i);
			if(hs.containsKey(c))
			{
				hs.put(c, hs.get(c)+1);
			}else {
				hs.put(c, 1);
			}
		}
		
		Set<Character>all=hs.keySet();
	    for(Character c:all)
	    {
	    	System.out.print(c.toString());
	    }
	  
	    }
		
		

	
}
