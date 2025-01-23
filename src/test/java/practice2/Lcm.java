package practice2;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num1=15;
     int num2=12;
     int max=num1;
     
     for(int i=max;;i++)
     {
    	 if(i%num1==0 && i%num2==0) {
    		
    		 System.out.println(i);
    		 break;
    		 
    	 }
     }
	}

}
