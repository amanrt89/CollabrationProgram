package Practice;

public class NoDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,20,15,48,78,48};
		
		int count[]=new int[20000];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			int c=arr[i];
			count[c]++;
			
		}
		for(int i=0;i<20000;i++) {
			if(count[i]==1)
			{
				System.out.println(i);
			}
			
		}
		

	}

}
