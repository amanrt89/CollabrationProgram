package practice2;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int sum=0;
		int org=num;
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		if(sum==org)
		{
			System.out.println("its ArmStrong");
		}
		else {
			System.out.println("Not ArmStrong");
		}
		
		
	}

}
