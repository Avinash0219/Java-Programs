import java.util.*;
class NeonNum
{
	static Scanner sc= new Scanner(System.in);
	public static boolean NeonNum(int num)
	{
		int sum=0;
		int square=(num*num);
		
		while (square>0)
		{
			int digit=square%10;
			sum+=digit;
			square/=10;
		}
		return sum==num;
	}
	
	public static void main (String[]args)
	{
		System.out.println("\t\t\t Enter the number :");
		int num= sc.nextInt();
		
		if (NeonNum(num))
		{
			System.out.println("\t\t\t It is Neon Number ");
		}
		else
		{
			System.out.println("It is not Neon Number ");
		}
	}
}
