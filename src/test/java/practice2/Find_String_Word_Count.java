package practice2;

import java.util.HashMap;
import java.util.Set;

public class Find_String_Word_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Java is Java Because Java is Language";
		String []s=str.split(" ");
		HashMap<String,Integer> hs=new HashMap<>();
		for(int i=0;i<s.length;i++)
		{  String c=s[i];
		    if(hs.containsKey(c))
		    {
		    	hs.put(c, hs.get(c)+1);
		    }else {
		    	hs.put(c, 1);
		    }
		    
		}
		System.out.println(hs);
		
		Set<String>f=hs.keySet();
		for(String x:f)
		{
			if(hs.get(x)==1)
			{
				System.out.println(x+":"+hs.get(x));
			}
		}

	}

}
