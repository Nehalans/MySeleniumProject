package programming;
import java.util.Scanner;

public class IfStatement2 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in); // creating an object to the scanner class
		
		System.out.println("Enter the value of a : ");
		int a = sn.nextInt();
		
		System.out.println("Enter the value of b : ");
		int b = sn.nextInt();
		
		if(a>b)
		{
			System.out.println(a);
		}
	}

}
