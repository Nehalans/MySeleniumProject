package programming;
import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter an int type of value : ");
		int i1 = s1.nextInt();
		
		System.out.println("Enter long type value : ");
		long l1 = s1.nextLong();
		
		System.out.println("Enter byte type value : ");
		byte b1 = s1.nextByte();
		
		System.out.println("Enter float type of value : ");
		float f1 = s1.nextFloat();
		
		System.out.println("Enter short type of value : ");
		short s = s1.nextShort();
	}

}
