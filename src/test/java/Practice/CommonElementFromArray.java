package Practice;

public class CommonElementFromArray {

	public static void main(String[] args) {
		
		int []arr= {1,2,5,6,7,66};
		int[] arr2= {1,2,5,9,8,7,4,5};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
              if(arr[i]==arr2[j])
              {
               System.out.println(arr[i]);
               break;
			
		}

	}
		
}
}}