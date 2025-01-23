package javaPractice;
class Parent{
	public void Property() {
		System.out.println("5Acer");
	}
}

class Child extends Parent
{
	public void Property() {
		super.Property();
		System.out.println("15Acer");
	}
}
public class OverRiding_TypeCasting{

	public static void main(String[] args) {
		Child child=new Child();
		child.Property();
		System.out.println("-----------------------------------");
		Parent p= new Parent();
		p.Property();
		
		
		System.out.println("___________Upcast_________________");
		Parent p1=new Child();
		p1.Property();
		
        System.out.println("___________DownCast_______________");		
		Child c=(Child)p1;
		c.Property();
		
//		

	}

}
