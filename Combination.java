public class Combination
{

	/* A naive solution to print all combination of 4 elements in A[]
	with sum equal to X */
	
	public static void sum(int arr[],int n,int x)
	{
		for(int i=0;i<n-3;i++)
		{
			for(int j=i+1;j<n-2;j++)
			{
				for(int k=j+1;k<n-1;k++)
				{
					
					for(int l=k+1;l<n;l++)
					{
						if(arr[i]+arr[j]+arr[k]+arr[l]==x)
							System.out.println(arr[i]+","+arr[j]+","+arr[k]+","+arr[l]);
						
					}
				}	
				
			}	
		}
				
	}

	// Driver program to test above functions
	public static void main(String[] args) 
	{
		Test1 findfour = new Test1();
		int A[] = {10, 20, 30, 40, 1, 2};
		int n=A.length;
		int X = 91;
		sum(A,n,X);
	}
}
