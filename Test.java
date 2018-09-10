// remove duplicate characters from array

import java.util.*;

public class Test
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char temp[]=str.toCharArray();
duplicate(temp);

}

public static void duplicate(char arr[])
{
int len=arr.length;
int ct=0;
char temp[]=new char[len];

for(int i=0;i<len;i++)
{
char ch=arr[i];
int flag=0;

for(int j=0;j<i;j++)
{
if(ch==arr[j])
flag=1;
}

if(flag==0)
{
temp[ct]=ch;
ct++;
}
}
for(char c:temp)
System.out.print(c);

}

}