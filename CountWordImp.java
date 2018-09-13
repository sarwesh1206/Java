
import java.util.*;

public class CountWordImp
{
	
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		
		String arr1[]=mysplit(str);
		
		String arr[]=key(str);
		
		int max[]=new int[arr.length];
		int p=0;
		
		for(String s:arr)
		{
			int ct=0;
			for(int i=0;i<arr1.length;i++)
			{
				if(s.equals(arr1[i]))
					ct++;
			}
			
			System.out.println(s+":"+ct);
			max[p++]=ct;
		}
		
		
for(int i:max)		
System.out.println(i);		
		
int in=maxcount(max);
System.out.println("max occuring word:"+arr[in]);		
		

	}
	
	
	// find max index value
	static int maxcount(int arr[])
	{
		int max=-999,flag=-1;
		for(int i=0;i<arr.length;i++)
		{ 
	    int a=arr[i];
			if(a>max)
			{
				max=a;
				flag=i;
			}
			
			
			
		}
		return flag;
		
	}
	

	// Split function 	
 public static String[] mysplit(String str)
	{
	String s1=str+" ";
	char []arr=s1.toCharArray();
	String arr1[]=new String[arr.length];
	int ct=0,in=0;
	int p=0;
	for(int i=0;i<arr.length;i++)
	{
    char c=arr[i];
    if(c!=' ')
	{
     ct++;
     }
	 else
	 {
	 int a=0;
	 char temp[]=new char[ct];
	 while(ct>0)
	 {
	   temp[a++]=arr[i-ct];
	   ct--;
	 }
	 
	   in++;
	   arr1[p++]=new String(temp);
	 
	 }
	 
	}
	
String []temp=new String[in];

int i=0;
for(;i<in;i++)
{
	temp[i]=arr1[i];
}

	
return temp;
	}	
	
	
		
	public static String[] key(String str)
	{
		String arr[]=str.split("\\s");
		int len=arr.length;
		String key[]=new String[len];
		key[0]=arr[0];
		int a=1,index=0;
		int flag=0;
		
		for(int i=1;i<len;i++)
		{
			 flag=0;
            
          for(int j=0;j<i;j++)
		  {
			 
			  if(arr[i].equals(key[j]))
			  {
				  flag=1;
				
				  
			  }  
		  }	
            if(flag==0)
			{	
             key[a]=arr[i];	
			 a++;
			}			 
		
			
		}
		
		
		String arr1[]=new String[a];
		
          for(int j=0;j<a;j++)
			  arr1[j]=key[j];
		
		
			return arr1;
	}	

	
	
	
	
	
}