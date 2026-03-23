import java.util.*;
class  TableRange
{
	static Scanner sc= new Scanner(System.in);
	public static void TableRange( int start, int end)
	{
		for (int i=start;i<=end ;i++ )
		{
			printTables(i);
		}
	}
	
	public static void printTables( int number)
	{
		System.out.println("Tables of "+number);
		
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println(number+ "x"+i+"="+(number*i));
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter Start : ");
		int start=sc.nextInt();
		
		System.out.println("Enter End : ");
		int end= sc.nextInt();
		
		TableRange(start,end);
	}
}
