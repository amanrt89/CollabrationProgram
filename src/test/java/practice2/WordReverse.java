package practice2;

public class WordReverse {

	public static void main(String[] args) {
   String str="Java Automation Manual";
   
    String[]s=str.split(" ");
       
    for(String x:s)
    {   String u="";
    	for(int i=x.length()-1;i>=0;i--) {
    		u+=x.charAt(i);
    	}
    	System.out.print(u+" ");
    }
    
	}

}
