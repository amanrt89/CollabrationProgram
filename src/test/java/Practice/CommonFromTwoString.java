package Practice;

public class CommonFromTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="I have Book";
      String e="We have Pen";
      
      String []str1=s.split(" ");
      String[]str2=e.split(" ");
      
      for(int i=0;i<=str1.length-1;i++) {
    	  for(int j=0;j<=str2.length-1;j++) {
    		  if(str1[i].equalsIgnoreCase(str2[j])){
    			  System.out.println(str1[i]);
    		  }
    	  }
      }
      
	}

}
