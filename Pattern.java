package com.chainsys.demo4;
import java.util.Scanner;
public class Pattern {
     public static int n;
     public static int i;
     public static int j;
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i,j,n;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number:");
		 n=sc.nextInt();
		 if(n>0) 
		 {
         for(i=1;i<=n;i++) 
         {
        	 for(j=1;j<=i;j++) 
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
		 }
		 else
		 {
			 System.out.println("Error");
		 }
	}

}
