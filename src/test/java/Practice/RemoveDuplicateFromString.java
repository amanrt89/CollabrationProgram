package Practice;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sggstsrefh";
		String op="";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			String s=String.valueOf(c);
			if(!op.contains(s))
			{
				op+=s;
			}
		}
 System.out.println(op);
	}

}
