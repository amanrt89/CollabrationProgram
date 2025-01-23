package Practice;

public class UpperToLowerViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="AiWeTyUjKl";
		char c[]=str.toCharArray();
		for(int i=0;i<=c.length-1;i++)
		{
			if(c[i]>='A'&& c[i]<='Z')
			{
				c[i]=(char) (c[i]+32);
			}
			else if(c[i]>='a'&& c[i]<='z')
			{
				c[i]=(char)(c[i]-32);
			}
		}
		
		String d=new String (c);
		System.out.println(d);

	}

}
