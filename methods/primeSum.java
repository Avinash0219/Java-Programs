import java.util.*;
class  PrimeSum
{
	static Scanner sc= new Scanner(System.in);
	public static int isprime(int start,int end)
	{
		int sum=0;	
		for (int i=start;i<=end ;i++ )
		{
			if (isprime(i))
			{
				sum+=i;
			}
		}
		return sum;
	}
	
	public static boolean isprime(int number)
	{
		if (number==0 || number==1)
		{
			return false;
		}
		for (int i=2;i<number ;i++ )
		{
			if (number%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\t\t\t Enter Start :");
		int start=sc.nextInt();
		
		System.out.println("\t\t\t Enter End :");
		int end=sc.nextInt();
		
		System.out.println("total sum of prime is :"+isprime(start,end));
	}
}
