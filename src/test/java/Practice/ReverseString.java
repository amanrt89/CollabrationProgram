package Practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello From Yavatamal";
		String rev="";
		
		for(int i=0;i<=str.length()-1;i++)
		{
			rev=str.charAt(i)+rev;
			
		}
		System.out.println(rev);

	}

}
