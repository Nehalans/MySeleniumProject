package programming;


public class PatternP {
	public static void main(String[] args) {
		int n = 5, i, j, x = (n/2)+1;
		for(i=1; i<=n; i++)
		{
			for(j=1; i<=n; j++)
			{
				if ((i==1 &&j<=x) || j==1
					|| (j==x && i<=x)
					|| (i==x && j<=x))
					System.out.println("* ");
				else
					System.out.println(" P");
			}
			System.out.println();
		}
	}

}
