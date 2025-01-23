package javaPractice;

class Over{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public void add(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}
	
}
public class Overloading {

	public static void main(String[] args) {
	
		Over o=new Over();
		o.add(10,20);
		o.add(10,20,30);
		o.add(10, 20, 30, 40);

	}

}
