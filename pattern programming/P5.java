class p5 
{
	public static void main(String[] args) throws Exception
	{
		int n=5;
		
		for (int i=0;i<n ;i++ )
		{
			char data='A';
			
			for (int j=0;j<n ;j++ )
			{
				if (i>=j)
				{
					System.out.print(i%2==0 ? data+ " ":(j+1));
					data++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
	}
}