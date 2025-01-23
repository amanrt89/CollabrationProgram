package javaPractice;


public class ConstructorP {
	
	String op;
	String g;
	public ConstructorP() {
		System.out.println("Hello from Prameterless");
	}
   
	public ConstructorP(String str)
	{
		System.out.println(str);
	}
	public ConstructorP(String op,String g)
	{
		this.op=op;
		this.g=g;
	}
	
	public static void main(String[] args)
	{
		ConstructorP c=new ConstructorP();
		ConstructorP cp=new ConstructorP("Hello form Parameterize");
		ConstructorP d=new ConstructorP("HEllo","Hey");
		System.out.println(d.op);
		System.out.println(d.g);

	}

}
