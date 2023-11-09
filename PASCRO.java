import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int toWin(String A , String B){
        int n=A.length();
        int win=0;
        for (int i=0;i<n;i++){
            if(A.charAt(i) == 'R' && B.charAt(i) == 'S'){
                win++;
            }
            else if(A.charAt(i)=='S' && B.charAt(i)=='P'){
                win++;
            }
            else if(A.charAt(i)=='P' && B.charAt(i)=='R'){
                win++;
            }
        }
        
        return win;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    String chef=sc.next();
		    String chefina=sc.next();
		    int point1=toWin(chef,chefina);
		    int point2=toWin(chefina,chef);
		    if(point1==point2){
		        System.out.println("1");
		    }
		    else if (point1>point2){
		        System.out.println("0");
		    }
		    else if (point2>point1){
		        System.out.println((point2-point1)/2 +1);
		    }
		}
	}
}