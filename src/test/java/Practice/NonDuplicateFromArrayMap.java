package Practice;

import java.util.HashMap;
import java.util.Set;

public class NonDuplicateFromArrayMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {15,15,155,20,20,48,20};	
		
		HashMap<Integer,Integer>hs=new HashMap<>();
		for(int i=0;i<=arr.length-1;i++)
		{
			int c=arr[i];
			if(hs.containsKey(c))
			{
				hs.put(c, hs.get(c)+1);
			}
			else {
				hs.put(c, 1);
			}
		}
		//System.out.println(hs);
		
		Set<Integer>allkey=hs.keySet();
		for(Integer key:allkey)
		{
		if(hs.get(key)==1) {
			System.out.println(key);
		}
		}
		
	}

}
