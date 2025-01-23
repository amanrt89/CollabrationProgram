package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NonDuplicateFromArray {
	public static void main(String[] args) {

		int []arr= {15,15,155,20,20,48,20};	
		int count[]=new int[20000];

		for(int i=0;i<=arr.length-1;i++)
		{
			int c=arr[i];
			count[c]++;
		}
		for(int i=0; i<count.length;i++) {
			//		if(count[i]>0) {
			//			System.out.println(i+"="+count[i]);
			//		}
			if(count[i]==1)
			{
				System.out.println(i);
			}
		}

	}
}
