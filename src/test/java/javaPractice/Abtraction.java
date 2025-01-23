package javaPractice;

abstract class Animal2{
	abstract void sound();
	
	 void eat() {
		 System.out.println("Animal Eating");
	 }
}

class Dog2 extends Animal2{
	public void sound()
	{
		System.out.println("BHO BHO");
	}

}

class Cat2 extends Animal2{
	public  void sound() {
		System.out.println("Meow Meow");
	}
	
}

public class Abtraction {

	public static void main(String[] args) {
		Dog2 d= new Dog2();
		d.eat();
		d.sound();
		
		Cat2 c= new Cat2();
		c.eat();
		c.sound();

	}

}
