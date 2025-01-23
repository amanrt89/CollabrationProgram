package practice2;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int year=2024;
     if(year%400==0)
     {
    	 System.out.println("Its LeapYear");
     }
     else if(year%100==0)
     {
    	 System.out.println("Its not leap Year");
     }
     else if(year%4==0)
     {
    	 System.out.println("Its Leap Year");
     }
     else {
    	 System.out.println("Its not Leap Year");
     }
	}

}
