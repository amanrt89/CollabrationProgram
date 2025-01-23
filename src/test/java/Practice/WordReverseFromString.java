package Practice;

public class WordReverseFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello From Yavatmal";

		String s[]=str.split(" ");
		String f="";
		
		for(int i=s.length-1;i>=0;i--) 
		{
			f=f+s[i]+" ";

		}
		System.out.println(f);
	}

}
