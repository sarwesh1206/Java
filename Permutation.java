
//permutation of String

import java.util.*;

public class Permutation
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int r=str.length();

permute(str,0,r-1);

}


public static void permute(String str,int l,int r)
{ 
  if(l==r)
    System.out.println(str);
	
	else
	{
	  for(int i=l;i<=r;i++)
	  {
	    str=swap(str,l,i);
	   permute(str,l+1,r);
	
	    str=swap(str,l,i);  //*backtracking
	  }
	
	}


}

public static String swap(String str,int l,int i)
{
	char arr[]=str.toCharArray();
	
	char temp=arr[l];
	arr[l]=arr[i];
	 arr[i]=temp;
	
	String mystr=null;
	return mystr.valueOf(arr);
	
	
	
	
}






}
