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
		    int len=sc.nextInt();
		    int[] arr=new int[len];
		    for (int i=0;i<len ;i++ ){
		        arr[i]=sc.nextInt();
		    }
		    int x=0;
		    for (int i=0;i<len ;i++ ){
		        x^=arr[i];
		    }
		    int min=x;
		    for (int i=0;i<len ;i++ ){
		        int a=x^arr[i];
		        min=Math.min(min,a);
		    }
		    System.out.println(min);
		}

	}
}
