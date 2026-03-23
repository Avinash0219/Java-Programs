import java.util.*;
class evenorodd 
{
	static Scanner sc= new Scanner(System.in);
	public static void evenorodd(int number) 
	{
		if (number%2==0)
		{
			System.out.println("\t\t\t It is Even number ");
		}
		else {
			System.out.println("\t\t\t It is Odd number ");
		}
	}
	
	public static void main(String[]args)
	{
		System.out.println("\t\t\t Enter the number :");
		int number=sc.nextInt();
		
		evenorodd(number);
	}
}
