package programming;

public class StaticMembersEx1 {
	static int s;
	static String xyz = "Hello people! Welcome to the session";
	static
	{
		System.out.println("Hello good morning people");
	}
	public static void display()
	{
		System.out.println("Hello from display");
	}
	public static void main(String[] args) {
		System.out.println("START");
		System.out.println("The valu of static variable s is (using the class name): "+StaticMembersEx1.s);
		System.out.println("The valu of static variable s is (using the class name): "+s);
		
		display();
		StaticMembersEx1.display();
		System.out.println("the value of single linenstatic initializer xyz (using its name): "+xyz);
		System.out.println("the value of single linenstatic initializer xyz (using its name) is: "+StaticMembersEx1.xyz);
		System.out.println("STOP");
		
	}

}
