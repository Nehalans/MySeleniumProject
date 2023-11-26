package programming;

public class RecursionEx2 
{
	public static void print(int n, int count )
	{
		System.out.println(n);
		n++;
		count--;
		if(n == 11) 
		{
			return;
		}
		print(n, count);
	}
	public static void main(String[] args) {
		int n =1;
		print(n,10);
	}

}
