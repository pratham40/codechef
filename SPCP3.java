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
		    int a=sc.nextInt();   // chef's marble
		    int b=sc.nextInt();   // friend's marble
		    if(a%b==0){
		        System.out.println(0);
		    }
		    else{
		        int c=a;
		        int d=b;
		        int ans1=0,ans2=0,ans3=0,ans4=0;
		        while(a>1){
		            a--;
		            b++;
		            ans3++;
		            if(a%b==0){
		                ans1=1;
		                break;
		            }
		        }
		        while(d>1){
		            c++;
		            d--;
		            ans4++;
		            if(c%d==0){
		                ans2=1;
		                break;
		            }
		        }
		        if(ans1==1 && ans2==1){
		            System.out.println(Math.min(ans3,ans4));
		        }
		        else if (ans1==1){
		            System.out.println(ans3);
		        } 
		        else{
		            System.out.println(ans4);
		        }
		    }
		    
		}
	}
}
