package practice2;

import java.util.HashSet;

public class MisssingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,6,9,10};
		
		int max=arr[arr.length-1];
		
		HashSet<Integer> hs=new HashSet<>();
		
		for(Integer i:arr)
		{
			hs.add(i);
		}
		
		for(int i=1;i<=max;i++)
		{
			if(!hs.contains(i))
			{
				hs.add(i);
				System.out.print(i+" ");
			}
		}
		System.out.println(hs);

	}

}
