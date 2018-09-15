
import java.util.*;
public class Mbitonic
{
public static void main(String []args)
{
System.out.println("enter no of elements");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]= new int[n];

for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int x=bitonic(arr,n);
System.out.println("maximum length of bitonic aaray:"+x);
}


public static int bitonic(int arr[],int n)
{
int inc[]=new int[n];
int dec[]=new int[n];
inc[0]=1;

dec[n-1]=1;

for(int i=1;i<=n-1;i++)
{
if(arr[i]>arr[i-1])

inc[i]=inc[i-1]+1;
else
 inc[i]=1;

}


for(int i=n-2;i>=0;i--)
{
if(arr[i]>arr[i+1])

dec[i]=dec[i+1]+1;
else
 dec[i]=1;

}
int y=0;
int max=inc[0]+dec[0]-1;
for(int i=1;i<n;i++)
{
if(inc[i]+dec[i]-1>max)
{
max=inc[i]+dec[i]-1;
 y=i;
}

}



int bit[]=new int[max];
int start=y+1-inc[y];
int ct=1;

//bitonic array

System.out.println("bitonic array");
for(int i=start;ct<=max;i++)
{
	System.out.print(arr[i]+",");
ct++;
	
}



System.out.println("bitonic point:"+arr[y]);
return max;

}
}