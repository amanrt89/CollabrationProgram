package Practice;

public class AvgofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {12,15,14,15,14,155};
		int sum=0;
		int length=arr.length;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum+=arr[i];
			
		}
		int avg=sum/length;
		System.out.println(avg);
	}

}
