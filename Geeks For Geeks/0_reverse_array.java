import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	   int T=sc.nextInt();
	   while(T>0)
	   {
	       int N=sc.nextInt();
	       int A[]=new int[N];
	       for(int i=0;i<N;i++)
	       {
	           A[i]=sc.nextInt();
	       }
	       int a=0;
	       int b=A.length-1;
	       int temp=0;
	       while(a<=b)
	       {
	           temp=A[a];
	           A[a]=A[b];
	           A[b]=temp;
	           a++;
	           b--;
	       }
	       for(int i=0;i<N;i++)
	       {
	           System.out.print(A[i]+" ");
	       }
	       T--;
	       System.out.println();
	   }
	}
}