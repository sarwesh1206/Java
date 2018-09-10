//reversing individual words
//ram is great=great is ram

import java.util.*;

public class Reverse
{

public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
String str=sc.nextLine();

char arr[]=str.toCharArray();
reverse(arr);



}

public static void reverse(char arr[])
{
	int len=arr.length;

	char temp[]=new char[len];
	int ct=0;int i=0;int j=0;
	int a=0;
	
	for(i=0;i<len;i++)
	{ 
char ch=arr[i];


		if(ch!=' ')
		{
			ct++;
			
		}
		else
		{	
	
				 a=i-1;
		   while(ct>=1)
			{
			temp[j]=arr[a];
			ct--;
			j++;
			a--;
			
			}
			temp[j++]=' ';
			
			ct=0;
		}
		
		
	
	}
	
	for(char c:temp)
  System.out.print(c);

  System.out.println(" ");
	
	
	for(int p=temp.length-1;p>=0;p--)
		System.out.print(temp[p]);
	
	
	
}


}