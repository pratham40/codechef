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
		int max;
		while (t-->0){
		     int n = sc.nextInt();
		    int []arr = new int[12];
		    for (int i=0;i<n;i++){
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        if(b>arr[a])
		            arr[a]=b;
		    }
		    int sum =0;
		    for (int i=0;i<=8;i++) 
		    sum=sum+arr[i];
		    System.out.println(sum);
		  //  System.out.println(Arrays.toString(arr));
		}
		
	}
}
