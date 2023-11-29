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
		    int n=sc.nextInt();   // total student
		    int x=sc.nextInt();   // Boys
		    int k=sc.nextInt();    //trekking group
		    int no_of_girl=n-x;
		    System.out.println(Math.abs(x%k-no_of_girl%k));
		}
	}
}
