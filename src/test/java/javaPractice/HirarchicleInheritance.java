package javaPractice;

class Animal1{
	public void eat()
	{
		System.out.println("Eating");
	}
}

class Dog1 extends Animal1{
	public void bark()
	{
		System.out.println("Dog Bark");
	}
	
}
class Cow extends Animal1{
	public void walk()
	{
		System.out.println("Cow Walking");
	}
}

public class HirarchicleInheritance {

	public static void main(String[] args) {

   Dog1 d=new Dog1();
   d.eat();
   d.bark();
   
   Cow c=new Cow();
   c.eat();
   c.walk();
	}

}
