package com.chainsys.demo4;
import java.util.Scanner;
public class MultiplicationTable {
    public static int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a num:");
         num=sc.nextInt();
         if(num>0) 
         {
         int i;
         for(i=1;i<=10;i++) {
        	 System.out.println(num+"*"+i+"="+num*i);
         }
         }
         else {
        	 System.out.println("Error");
         }
	}
}
