package programming;

public class ParaMethod2 {
public static void potato() // no argument method
{
	System.out.println("Hello from potato");
	}
public static void tomato(float x) {
System.out.println(x);
x = 99;
System.out.println(x);

}
public static float carrot (int s)
{
	return s;
	}
public static double brinjal(float c, float d)
{
	return c+d;
	
	}
public static int spinach(int a, int b)
{
	return a-b;
	
	}
public static void main(String[] args) {
	System.out.println("START");
	potato();
	tomato(9);
	System.out.println(carrot(21));
	System.out.println(brinjal(2.3f, 9.9f));
	System.out.println(spinach(10,19));
	System.out.println("STOP");
}
}
