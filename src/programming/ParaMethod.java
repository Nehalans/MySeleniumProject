package programming;

public class ParaMethod {
	public static void setting(int a)
	{
		System.out.println(a);
	}
	public static int setting(int x, int y) {
		System.out.println(x);
		return y;
		
	}
	public static double add(int w, int s)
	{
		return w+s;
		
	}
	public static double adds(double d, double e)
	{
		return d+e;
		
	}
	public static void main(String[] args) {
		setting(10);
		int res = setting(10, 20);
		System.out.println(res);
		double res1 = add(21, 35);
		System.out.println(res1);
		double res2 = adds(23.78, 99.0987);
		System.out.println(res2);
		
	}

}
