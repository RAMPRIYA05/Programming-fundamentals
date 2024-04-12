package com.chainsys.demo4;

import java.util.Scanner;

public class OddEvenCube {
    public static int n,i;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a number");
         n=sc.nextInt();
         if(n>0) 
         {
         for(i=1;i<=n;i++)
         {
         if(i%2==0)
         {
        	 System.out.println("n is even: "+i);
         }
         else if(i%2!=0)
         {
        	 System.out.println("n is odd: "+i);
         }
         System.out.println(i+"*"+i+"*"+i+"= "+i*i*i);
	     }
         }
	     else
	     {
		     System.out.println("Error");
	     }

}
}
