package Practice;

public class WordReverseindexAsItis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="Hello From Yavtmal";
      String str[]=s.split(" ");
       
      for(String x:str)
      {  
    	  String rev="";
    	  for(int i=x.length()-1;i>=0;i--)
    	  {
    		  rev=rev+x.charAt(i);
    	  }
    	  System.out.print(rev+" ");
      }
     
	}

}
