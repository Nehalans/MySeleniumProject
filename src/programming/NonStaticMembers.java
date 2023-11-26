package programming;

public class NonStaticMembers {
	public static void main(String[] args) {
		NonStatic var = new NonStatic();
		System.out.println("The value of non static variable a is : "+var);
		System.out.println("The value of single line non static variable x is : "+var.x);
		var.NonStaticMembers();
		
	}
}

class NonStatic
{
	int a;
	String x = "TESTYANTRA";
	
	public void NonStaticMembers()
	{
		System.out.println();
	}
	}
