/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int count;
		while (t-->0){
		    int len=sc.nextInt();
		    String a=sc.next();
		    String b=sc.next();
		    char[] ch1=a.toCharArray();
		    char[] ch2=b.toCharArray();
		    Arrays.sort(ch1);
		    Arrays.sort(ch2);
		    if (Arrays.equals(ch1,ch2)){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
