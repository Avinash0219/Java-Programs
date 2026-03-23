import java.util.*;
class xpowern 
{
	static Scanner sc= new Scanner(System.in);
	public static int xpowern(int x, int n)
	{
		int ans=1;
		
		for (int i=0;i<n ;i++ )
		{
			ans*=x;
		}
		return ans;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter X :");
		int x=sc.nextInt();
		
		System.out.println("Enter N :");
		int n=sc.nextInt();
		
		int res=xpowern(x,n);
		System.out.println("Result :"+res);
	}
}
