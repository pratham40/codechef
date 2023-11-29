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
		while(t-->0){
		    int x=sc.nextInt();
		    int n=sc.nextInt();
		    int ans=(n-x*100);
		    int count=0;
		    while(ans>0){
		        count++;
		        ans-=100;
		    }
		    System.out.println(count);
		}
	}
}
