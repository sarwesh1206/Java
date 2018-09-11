//counting no frequency of characters in String

import java.util.*;

public class Count
{
public static void main(String []args)
{

Scanner sc=new Scanner(System.in);
String str=sc.nextLine();

count(str);
}

public static void count(String str)
{
char arr[]=str.toCharArray();

int ct[]=new int[256];

for(int i=0;i<arr.length;i++)
{
char ch=arr[i];
int x=(int)ch;
ct[ch]++;
}



for(int a=0;a<str.length();a++)
{
//int p=ct[arr[a]];
int flag=0;

for(int b=0;b<=a;b++)
{
	if(str.charAt(a)==arr[b])
		flag++;
	
}	


//flag=1 means prints only one time
if(flag==1)
	System.out.println(str.charAt(a)+"="+ct[arr[a]]);
}
}

}