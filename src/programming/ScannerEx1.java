package programming;
import java.util.Scanner; // import statement

public class ScannerEx1 
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the employee name :");
		String name = scn.next();
		
		System.out.println("Enter the employee ID :");
		int empid = scn.nextInt();
		
		System.out.println("Enter the contact number of an employee :");
		long empcno = scn.nextLong();
		
		System.out.println("Enter the salary of an employee  :");
		double empsal = scn.nextDouble();
		
		System.out.println("Enter the rating of an employee  :");
		float emprating = scn.nextFloat();
		
	}

}
