
import java.util.*;

public class MaxLengthString
{

public static void main(String []args)
{

Scanner sc=new Scanner(System.in);
String str=sc.nextLine();

String arr[]=mysplit(str);

String arr1[]=key(arr);

maxLength(arr1);


}

public static void maxLength(String arr[])
{

int len=arr.length;
int max[]=new int[len];

for(int i=0;i<len;i++)
{
  int length=arr[i].length();
  max[i]=length;
}


int maxno=-9999;
int flag=0;
for(int j=0;j<max.length;j++)
{
if(max[j]>maxno)
 maxno=max[j];
 flag=j;

}

System.out.println("maxlength="+arr[flag]);


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
	

	



	
	public static String[] key(String[] arr)
	{
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