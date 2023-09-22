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
		    int prob=sc.nextInt();
		    int count1=0,count2=0;
		    while(prob-->0){
		        String code=sc.next();
		        if(code.equals("START38")){
		            count1++;
		        }
		        else{
		            count2++;
		        }
		    }
		    System.out.println(count1+" "+count2);
		}
	}
}
