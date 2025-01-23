package practice2;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Austrelia";
		
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s+=str.charAt(i);
		}
		
		if(str.equals(s))
		{
			System.out.println("Palindorme");
		}
		else {
			System.out.println("Not Palindrome");
		}
		System.out.println(s);

	}

}
