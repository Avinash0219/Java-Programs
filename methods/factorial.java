import java.util.*;
class factorial 
{
	static Scanner sc=new Scanner(System.in);
	public static int findfactorial(int number) 
	{
		int ans=1;
		
		for (int i=number;i>=2 ;i-- )
		{
			ans=ans*i;
		}
		return ans;
	}
	
	public static void main(String[]args)
	{
		System.out.println("\t\t\t Enter the number :");
		int number=sc.nextInt();
		
		int res=findfactorial(number);
		
		System.out.println("factorial of "+number+ "is :"+res);
	}
}
