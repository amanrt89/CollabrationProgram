package Practice;

public class PrimeNumber1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=100;
		for(int i=1;i<=num;i++)
		{
			int count=0;
			for(int j=1;j<=num;j++)
			{
				if(i%j==0) 
				{
					count++;
				}
			}
			if(count==2) {
			System.out.print(i+" ");
			}
		}

	}

}
