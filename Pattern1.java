
public class Pattern1 
{

	public static void main(String[] args) 
	{
		int n=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 && j<=(n-1)/2 || i==(n-1) && j<=(n-1)/2 || j==n/4)  //I   
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++) 
			{
				if(j==0 || i==j || j==n-1)     //N
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0 && j<=(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2 || i==n-1 && j<=(n-1)/2)    //E 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==(n-1)/2 || i==n-1 && j<=(n-1)/2)     //U
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0 && j<=(n-1)/2 || j==(n-1)/2 && i<=(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2 || i-j==(n-1)/2)  //R    
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==(n-1)/2 || i==0 && j<=(n-1)/2 || i==n-1 && j<=(n-1)/2)     //O
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==j || j==n-1)     //N
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println();
			
		}
		

	}

}
