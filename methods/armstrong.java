import java.util.*;
class armstrong
{
	static Scanner sc= new Scanner(System.in);
	public static int countDigits(int number)
	{
		int count=0;
		
		while (number>0)
		{
			number/=10;
			count++;
		}
		return count;
	}
	
	public static int xpowern(int x,int n)
	{
		int ans=1;
		
		for (int i=1;i<=n ;i++ )
		{
			ans*=x;
		}
		return ans;
	}
	
	public static void main(String[]args)
	{
		System.out.println("\t\t\t Enter the number :");
		int number=sc.nextInt();
		
		int sum=0;
		
		int n=countDigits(number);
		
		for (int i=number;i>0 ;i/=10 )
		{
			int x=i%10;
			sum+=xpowern(x,n);
		}
		
		if (sum==number)
		{
			System.out.println("\t\t\t It is armstrong");
		}
		
		else 
		{
			System.out.println("\t\t\t It is not armstrong");
		}
	}
}