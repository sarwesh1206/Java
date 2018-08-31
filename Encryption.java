import java.util.*;

public class Encryption
{
	
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	
	encrypt(str);
	
}	
	public static void encrypt(String str)
	{
		//int len1=str.length();
			String arr1[]=str.split("\\s");	
int len1=arr1.length;			
		String cstr="";
		for(int x=0;x<len1;x++)
		{
		
		int len=arr1[x].length();
		char arr[]=arr1[x].toCharArray();
		int ct=0;
		int diff=0;
		cstr=arr1[x];
		for(int j=0;j<len;j++)
		{
			diff=len-1-ct;
			ct++;
		//char ch=arr[j];
	char ch=cstr.charAt(j);
        int a=(char)ch;
		
		
		
		
		
		
         a=a+diff;
		 
		if(a>=97&&a<=122)
		{
     ch=(char)a;
     arr[j]=ch;	
		}
		else
		{
			a=a-122-1;
			a=97+a;
			
     ch=(char)a;
     arr[j]=ch;	
		}
	 
		}
	 String mystr=new String(arr);
	 
arr1[x]=mystr;


		}
		
		for(String st:arr1)
         System.out.print(st+" ");
			
	}
}
		