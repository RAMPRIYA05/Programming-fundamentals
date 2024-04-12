package com.chainsys.demo4;
import java.util.Scanner;
public class Tax {
    public static double grossincome;
    public static double savings=100000;
    public static double taxableincome;
    public static double tenpercent,twentypercent,thirtypercent;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Gross income:");
       grossincome=sc.nextDouble();
       if(grossincome>0)
       {
       System.out.println("Savings:"+savings);
       taxableincome=grossincome-savings;
       System.out.println("Taxable income:"+taxableincome);
       if(grossincome<=100000 || taxableincome<=100000) {
    	   System.out.println("Tax is zero");
       }
       else if(taxableincome>100000 && taxableincome<200000)
       {
    	   tenpercent=(10*taxableincome)/100;
    	   System.out.println("Tax is 10%");
       }
       else if(taxableincome>=200000 && taxableincome<500000)
       {
    	   twentypercent=(20*taxableincome)/100;
    	   System.out.println("Tax is 20%");
       }
       else if(taxableincome>=500000)
       {
    	   System.out.println("Tax is 30%");
       }
       }
       else 
       {
    	   System.out.println("Error");
       }
	}

}
