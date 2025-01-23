package Practice;

public class CaharcterCounterByCountArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "   absdbasdnas3231546447821321@#!&*!@@*&#";
		int count[]=new int[256];
		for(int i=0;i<str.length()-1;i++)
		{
			char c=str.charAt(i);
			
			count[c]++;
			
		}
		for(int i=0;i<256;i++)
		{    
			if(count[i]>0 && (char)i!=' ')
			{  
				System.out.println((char)i+":"+count[i]);
			}
		}

	}

}
