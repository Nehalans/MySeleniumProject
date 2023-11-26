package programming;

public class StaticMembersEx3 {
	static int y = 21;
	
	static int z = 23;
	
	static
	{
		int y = 0;
		int z = 10;
		
		System.out.println(y);
		System.out.println(z);
		
	}
	
	static double c;
	static float d;
	
	public static void method()
	{
		double c = 29.098;
		float d = 1.2f;
		
		System.out.println(c);
		c = 99.9087;
		d = 23.67f;
		System.out.println(d);
		System.out.println(c);
		
	}
	static 
	{
		int r = 23;
		int m = 99;
	}
	
	public static void main(String[] args) {
		int xyz = 26;
		System.out.println(xyz);
		double c = 0.9;
		System.out.println(d);
		System.out.println(StaticMembersEx3.c);
		System.out.println(c);
		System.out.println(y);
		System.out.println(z);
		System.out.println(c);
		System.out.println(d);
		method();
		
	}

}
