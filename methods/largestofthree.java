import java.util.*;
class largestofthree 
{
	static Scanner sc= new Scanner(System.in);
	public static int largestofthree(int a,int b,int c)
	{
		if (a>b && a>c)
		{
			return a;
		}
		else if (b>c)
		{
			return b;
		}
		else {
			return c;
		}
	}
	
	public static void main(String[]args)
	{
		System.out.println("\t\t\t Enter a :");
		int a=sc.nextInt();
		
		System.out.println("\t\t\t Enter b :");
		int b=sc.nextInt();
		
		System.out.println("\t\t\t Enter c :");
		int c=sc.nextInt();
		
		int res=largestofthree(a,b,c);
		
		System.out.println("Largest of three is :"+res);
	}
}
