package programming;

public class NonStaticMembersEx2 {
	public static void main(String[] args) {
		NonStatics ns = new NonStatics();
		
		System.out.println(ns.x);
		System.out.println(ns.a);
		System.out.println(ns.name);
		System.out.println("Qspiders Global");
		ns.nonStatics();
		System.out.println(ns.x);
		
	}

}

class NonStatics
{
	{
		int a = 21;
		System.out.println("the value of a is : "+a);
		a=35;
		System.out.println("The modified value of a is : "+a);
		
	}
	int a = 99;
	double x;
	{
		System.out.println("The addition of two numbers");
		
		int x1 = 20;
		double x = 99.66;
		
		double sum = x+x1;
		System.out.println("The sum is : "+sum);
		
	}
	public void nonStatics()
	{
		System.out.println("Hello people is from non static method!");
		x = 99.99;
		System.out.println(" The value of non static variable x is : "+x);
	}
	String name = "QSPIDERS";
	{
		name = "PYSPIDERS";
		System.out.println(name);
		
		name = "JSPIDERS";
		System.out.println(name);
	}
	}