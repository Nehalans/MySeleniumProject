package programming;

public class StaticMembersEx2 {
	static double d;
	
	static int a = 21;
	
	public static void set()
	{
		int a = 10; // local variable
		System.out.println("the value of local variable a is : "+a);
		System.out.println("Apple ");
	}
	static 
	{
		int d = 34;
		System.out.println("the value of local variable a is : "+d);
System.out.println("PineApple");
	}
	public static void main(String[] args) {
		System.out.println(d);
		System.out.println(a);
		set();
	}

}
