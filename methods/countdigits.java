import java.util.*;
class  countdigits
{
	static Scanner sc=new Scanner(System.in);
	public static void countdigits(int number) 
	{
		int count=0;
		
		if (number==0)
		{
			count=1;
		}
		
		else {
				while (number>0)
				{
					number/=10;
					count++;
				}
		}	
		
		System.out.println("Total no.of.count is :"+count);
	}
	
	public static void main(String[]args)
	{
		System.out.println("\t\t\t Enter the number :");
		int number=sc.nextInt();
		
		countdigits(number);
	}
}
