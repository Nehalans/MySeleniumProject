package programming;

import java.util.Scanner;

public class SwitchDynamic {
	public static void main(String[] args) {
		

	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter the case value in between 1 to 5");
	int n = s.nextInt();
	
	switch(n)
	{
	case 1 :
	{
		System.out.println("QSPIDERS!");
	}
	break;
	case 2 :
	{
		System.out.println("JSPIDERS!");
	}
	break;
	case 3 :
	{
		System.out.println("PYSPIDERS!");
	}
	break;
	case 4 :
	{
		System.out.println("TESTYANTRA!");
	}
	break;
	case 5 :
	{
		System.out.println("QSPIDERS GLOBAL!");
	}
	} 

}
}