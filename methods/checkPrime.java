import java.util.*;
class checkPrime
{
	static Scanner sc=new Scanner(System.in);
	public static boolean isprime(int number)
	{
		if (number<=1)
		{
			return false;
		}
		
		for (int i=2;i<=number/2 ;i++ )
		{
			if (number % i == 0)
			{
				return false;	
			}
		}
		return true;
	}
	
	public static void main(String[]args)
	{
		System.out.println("\t\t\t Enter the number :");
		int number=sc.nextInt();
		
		if (isprime(number))
		{
			System.out.println("It is prime number ");
		}
		
		else
		{
			System.out.println("It is not prime number ");
		}
	}
}
