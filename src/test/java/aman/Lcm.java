
package aman;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=12;
		int num2=15;
		
		int max=num2;
	   for(int i=max;;i++)
		{
			if(i%num1==0 && i%num2==0)
			{
				System.out.println(i);
				break;
			}
		}

	}

}
