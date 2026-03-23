import java.util.*;
class HappyNum
{
	static Scanner sc= new Scanner(System.in);
	public static int SumOfSquares(int number)
	{
		int sum=0;
		
		while (number>0)
		{
			int digit=number%10;
			sum+=(digit*digit);
			number/=10;
		}
		return sum;
	}
	
	public static boolean ishappy(int number)
	{
		while (number!=1 && number!=4)
		{
			number=SumOfSquares(number);
		}
		
		if (number==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[]args)
	{
		System.out.println("\t\t\t Enter the number :");
		int number=sc.nextInt();
		
		if (ishappy(number))
		{
			System.out.println("\t\t\t It is Happy Number");
		}
		else
		{
			System.out.println("\t\t\t It is not Happy Number");
		}
	}
}