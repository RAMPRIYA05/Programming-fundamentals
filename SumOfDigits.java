package com.chainsys.demo4;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number:");
           int number=sc.nextInt();
           int sum = 0;
           int num;
           if(number>=1) 
           {
           while(number!=0)
           {
        	   num=number%10;
        	   sum=sum+num;
        	   number=number/10;
           }
           System.out.println(sum);
           }
           else {
        	   System.out.println("error");
           }
	}
}

