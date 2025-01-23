package practice2;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={10,20,50,50,10,80,90};
		
		int count[]=new int[20000];
		
		for(int i=0;i<arr.length;i++)
		{
			int c=arr[i];
			count[c]++;
		}
		
		ArrayList<Integer>al=new ArrayList<>();
     for(int i=0;i<20000;i++)
     {
    	 if(count[i]==1)
    	 {
    		 al.add(i);
    	 }
     }
     System.out.println(al);
	}

}
