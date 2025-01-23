package javaPractice;


class A
{
	private int d;

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}
	 
	 }
public class EncapSulation {

	public static void main(String[] args) {
      A a=new A();
      a.setD(10);
      System.out.println(a.getD()); 
		
	}

}
