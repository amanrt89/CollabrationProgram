package Practice;

public class SumOfDigitFromString {

	public static void main(String[] args) {
		String str="I have 10 Apple 20 Banana";
		
		String s[]=str.split(" ");
		int sum=0;
		int num=0;
		for(String x:s)
		{
			if(x.matches("[0-9]+"))
			{
				num=Integer.parseInt(x);
				sum+=num;
				
			}		
		}
		System.out.println(sum);

	}

}
