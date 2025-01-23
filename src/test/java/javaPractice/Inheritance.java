package javaPractice;
   class Animal{
	   public void bark() {
		   System.out.println("barking");
	   }
   }
   
   class Dog extends Animal{
	   
	   public void labra()
	   {
		   System.out.println("labraDog");
	   }
//	   public void bark()
//	   {
//		   System.out.println("Labrabark");
//	   }
   }
   
public class Inheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
		d.labra();

	}

}
