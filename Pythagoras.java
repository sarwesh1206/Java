import java.util.*;

public class Pythagoras
{
public static void main(String []args)
{

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];

for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();

}


num(arr,n);

}

public static void num(int arr[],int n)
{
int i,j,k;
for(i=0;i<=n-3;i++)
  {
     for(j=i+1;j<=n-2;j++)
      {
       for(k=0;k<=n-1;k++)
           {

            int x=arr[i]*arr[i];

               int y=arr[j]*arr[j];

                  int z=arr[k]*arr[k];
                    
					if(x==y+z||y==x+z||z==x+y)
                        {
                      System.out.println("pythagoras triplet:"+arr[i]+","+arr[j]+","+arr[k]); 
                        
						return;

                          }

}

}
}


}



}
