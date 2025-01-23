package Practice;

public class DuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,20,15,48,78,48};
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}

	}

}
