import java.util.*;
class perfect
{
	static Scanner sc=new Scanner(System.in);
	public static boolean isperfect(int number)
	{
		int sum=0;
		
		for (int i=1;i<=number/2 ;i++ )
		{
			if (number%i==0)
			{
				sum+=i;
			}
		}
		return number==sum;
	}
	
	public static void main(String[]args)
	{
		System.out.println("\t\t\t Enter the number :");
		int number= sc.nextInt();
		
		if (isperfect(number))
		{
			System.out.println("It is perfect number ");
		}
		else
		{
			System.out.println("It is not perfect number ");
		}
	}
}