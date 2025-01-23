package practice2;

public class Index_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String str="Java Automation Manual";
		 
     
		   String s="";
		  String s1[]=str.split(" ");
		  
		  for(int i=s1.length-1;i>=0;i--) {
			   s+=s1[i]+" ";
		  }
		  System.out.println(s);

	}

}
