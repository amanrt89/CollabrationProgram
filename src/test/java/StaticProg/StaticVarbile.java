package StaticProg;
  
public class StaticVarbile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Employee s1=new Employee();

		s1.empID=101;
		s1.empName="Elon";
		s1.ceo="Ratan Tata";

		Employee s2=new Employee();

		s2.empID=201;
		s2.empName="Mark";
		s2.ceo="Ratan Tata";

		Employee s3=new Employee();

		s3.empID=301;
		s3.empName="Rohit";
		s3.ceo="Jamshedji Tata";	
		
		s1.empInfo();
		s2.empInfo();
		s3.empInfo();
	}


	}

