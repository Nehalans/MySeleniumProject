package programming;
import java.util.Scanner;


public class IfStatement3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = s.nextInt();
		
		System.out.println("Enter the number : ");
		int a = s.nextInt();
		
		if(n>0 && n!=0 || n>=5)
		{
			System.out.println("Hello good morning");
		}
		if(a==0 || a>=0 && (a<-1 || a!=0))
		{
			System.out.println("Hello all Afternoon");
		}
	}

}
