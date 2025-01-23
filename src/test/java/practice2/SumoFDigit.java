package practice2;

public class SumoFDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=546;
		int sum=0;
	while(num!=0)
	{
		int digit=num%10;
		sum=sum+digit;
		num=num/10;
		
	}
	System.out.println(sum);

	}

}
