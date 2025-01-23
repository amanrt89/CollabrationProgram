package Practice;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		for(int i=2;i<num;i++)
		{
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}

}
