/*package whatever //do not write package name here */

//sum of subset problem

import java.util.*;
import java.lang.*;
import java.io.*;

class  Subset{
	public static void main (String[] args) throws Exception {
	
	Scanner sc=new Scanner(System.in);
	
       int nt=sc.nextInt();

	for(int i=1;i<=nt;i++)
	{
	    int n=sc.nextInt();

	    int arr[]=new int[n];
	    for(int j=0;j<n;j++)
	       {
			  
	           arr[j]=sc.nextInt();
	           
	       }
		   
		   int sum=sc.nextInt();
		 
	    
	    permute(arr,sum);
	    
	}
	}
	
	public static void permute(int arr[],int sum)
	{
	    int len=arr.length;
	    
	    int ct=0,k=0;
		int j=len-1;
		int i=0;
	        
			while(i<j)
	        {
	            
	            if(arr[i]+arr[j]==sum)
	               {
					   
	                  ct++;
	      System.out.println(arr[i]+" "+arr[j]+" "+sum); 
		  i++;
	               }
				  
				  
				  else
				  {
				  
					  if(arr[i]+arr[j]>sum)
						  j--;
				  else
					  i++;
					  
				  }
	            
	        }
			
	        
	        
	    
	    
	if(ct==0)
		System.out.println("-1");
			
			
	}
}