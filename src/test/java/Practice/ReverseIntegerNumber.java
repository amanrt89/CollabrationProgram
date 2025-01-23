package Practice;

public class ReverseIntegerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num=143;
      int org=num;
      int rev=0;
      while(num!=0)
      {
    	  int digit=num%10;
    	  rev=rev*10+digit;
    	  num=num/10;
      }
      System.out.println(rev);
  	if(rev==org) {
		System.out.println("its Palindrom");
	}
	else
	{
		System.out.println("Its not Palidrom");
	}
	}


}
