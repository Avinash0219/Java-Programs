import java.util.*;
class  StrongNum
{
	static Scanner sc= new Scanner(System.in);
	public static int findFactorial(int number)
	{
		int ans=1;
		
		for (int i=number;i>=2 ;i-- )
		{
			ans*=i;
		}
		return ans;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the number :");
		int number=sc.nextInt();
		
		int sum=0;
		
		for (int i=number;i>0 ;i/=10 )
		{
			int digit=i%10;
			sum+=findFactorial(digit);
		}
		
		if (sum==number)
		{
			System.out.println("\t\t\t It is Strong number");
		}
		else
		{
			System.out.println("\t\t\t It is not Strong number");
		}
	}
}
