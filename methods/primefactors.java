import java.util.*;
class primeFactors
{
	static Scanner sc= new Scanner(System.in);
	public static void primeFactors(int n)
	{
		for (int i=1;i<=n/2 ;i++ )
		{
			if (n%i==0)
			{
				System.out.println("Factors of "+n+ " is :"+i);
			}
		}
	}
	
	public static void main(String[]args)
	{
		System.out.println("\t\t\t Enter the number :");
		int n=sc.nextInt();
		
		primeFactors(n);
	}
}
