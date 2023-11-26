package programming;

public class RecursionEx 
{
	public static void disp(int a) 
	{
		System.out.println(a);
		disp(a); // method call statement // recursion
	}

	public static void main(String[] args) {
		disp(10);
	}

}
// recursion always flow stack overflow