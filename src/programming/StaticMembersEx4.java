package programming;

public class StaticMembersEx4 {
	static
	{
		System.out.println("Hello");
		int a = 21;
		a = 34;
		a = 97;
		System.out.println(a);
	}
	
	static
	{
		System.out.println("Hello from 2nd mlsi");
		int d = 23;
		System.out.println(d);
		d = 99;
	}
	static double d = 23.78d;
	static double d1 = 23.456;
	
	public static void setting()
	{
		double d = 23.56;
		double d1 = 99.99;
		System.out.println(StaticMembersEx4.d1);
		System.out.println(StaticMembersEx4.d);
		
	}
	
	static int v;
	static int v1;
	
	public static void main(String[] args) {
		
		System.out.println(v);
		System.out.println(v1);
		
		v = 23;
		
		System.out.println(v);
		
		int v = 45;
		System.out.println(StaticMembersEx4.v);
		System.out.println(v);
		
		setting();
		
		System.out.println(d);
		System.out.println(d1);
		
	}

}
