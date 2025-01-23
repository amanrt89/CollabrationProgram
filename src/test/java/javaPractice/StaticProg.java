package javaPractice;

class Employee1{
	int empId;
	String empname;
	static String coe;
	
	public void info()
	{
		System.out.println(empId+" "+empname+" "+coe);
	}
}
public class StaticProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 e1=new Employee1();
		e1.empId=01;
		e1.empname="Aman";
		e1.coe="Zuku";
		
		Employee1 e2=new Employee1();
		e2.empId=02;
		e2.empname="Pranav";
		e2.coe="zuku";
		
		Employee1 e3=new Employee1();
		e3.empId=03;
		e3.empname="Elon";
		e3.coe="mark";
		
		e1.info();
		e2.info();
		e3.info();

	}

}
