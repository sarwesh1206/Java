import java.util.*;

public class Mysub
{
	
 static int []arr;
 static int []inc;
static int m;
static int n;

public static void subset(int i,int wt,int m,int total)
{
  
	if((promise(i,wt,total)))
	{
      
       if(wt==m)
       {

         print();


       }
         
         else
         {
              
        inc[i+1]=1;
          subset(i+1,wt+arr[i+1],m,total-arr[i+1]);

          inc[i+1]=0;
            subset(i+1,wt,m,total-arr[i+1]);

            

          
         }


	}
	

}


public static boolean promise(int i,int wt,int total)
{

if((wt+total>=m)&&(wt==m)||wt+arr[i+1]<=m)
   return true;

   else
    return false;



}


public static void print()
{


for(int i=0;i<arr.length;i++)
{
       if (inc[i]==1) 
       {
       	System.out.print(arr[i]+" ");
       }
 

}
System.out.println();

}


public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
  System.out.println("enter the number of elements");
  n=sc.nextInt();
  System.out.println("enter elements of set");
  arr=new int[n+5];
int sum=0;

 inc =new int[n+5];
  for(int i=0;i<n;i++)
  {

  arr[i]=sc.nextInt();
  sum=sum+arr[i];

  }

  System.out.println("enter the required sum");
  m=sc.nextInt();

arr[n]=9999;




 System.out.println("required subset is:");
subset(0,0,m,sum);

}

}



