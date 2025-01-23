package aman;

import java.util.HashSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,4,8,9,10};
		
		HashSet<Integer>hs=new HashSet();
		for(int x:arr)
		{
			hs.add(x);
		}
		
		int max=arr[arr.length-1];
		
		for(int i=0;i<=max;i++)
		{
			if(!hs.contains(i))
			{
          System.out.println(i);
		}

	}

}
}
//int []arr= {10,20,40,50,70,100};
//
//HashSet<Integer>hs=new HashSet<>();
//for(int x:arr)
//{
//	hs.add(x);
//}
//
//int max=arr[arr.length-1];
//
//for(int i=10;i<=max;i+=10)
//{
//	if(!hs.contains(i))
//	{
//  System.out.println(i);
//}
//
//}