package com.chainsys.demo4;
import java.util.Scanner;
public class EvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        long n=sc.nextLong();
        String nStr=Long.toString(n);
        System.out.println("Even digit in the number");
        for(int i=0;i<nStr.length();i++) 
        {
        	char digitChar=nStr.charAt(i);
        	int digit=Character.getNumericValue(digitChar);
        	
        if(digit%2==0) 
        {
           System.out.println(digit);	
        }
        }
        }
       
	}
