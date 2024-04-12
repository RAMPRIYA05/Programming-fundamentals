package com.chainsys.demo4;
import java.util.Scanner;
public class EvenDigit {
        public static int n;
        public static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        if(n>0)
        {
        for(i=1;i<=n;i++) 
        {
        if(i%2==0) 
        {
           System.out.println(i);	
        }
        }
        }
        else
        {
        	System.out.println("Error");
        }
	}
}
