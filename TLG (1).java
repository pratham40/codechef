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
		int score1=0,score2=0;
		int max=0;
		while(t>0){
		    int player1=sc.nextInt();
		    int player2=sc.nextInt();
		    score1+=player1;
		    score2+=player2;
		    int lead=score1-score2;
		    if(Math.abs(lead)>Math.abs(max)){
		        max=lead;
		    }
		    t--;
		}
		if(max>0){
		    System.out.print("1 "+max);
		}
		else{
		    System.out.print("2 "+Math.abs(max));
		}
	}
}
