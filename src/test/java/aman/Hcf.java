package aman;

public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=12;
		int num2=15;
		int min=num1;
		
		for(int i=min;i>0;i--)
		{
			if(num1%i==0&&num2%i==0)
			{
				System.out.println(i);
				break;
			}
		}

	}

}
