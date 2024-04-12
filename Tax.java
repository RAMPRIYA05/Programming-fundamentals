package com.chainsys.demo4;
import java.util.Scanner;
public class Tax {
    public static double grossIncome;
    public static double savings=100000;
    public static double taxableIncome;
    public static double tenPercent,twentyPercent,thirtyPercent;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Gross income:");
       grossIncome=sc.nextDouble();
       if(grossIncome>0)
       {
       System.out.println("Savings:"+savings);
       taxableIncome=grossIncome-savings;
       System.out.println("Taxable income:"+taxableIncome);
       if(grossIncome<=100000 || taxableIncome<=100000) {
    	   System.out.println("Tax is zero");
       }
       else if(taxableIncome>100000 && taxableIncome<200000)
       {
    	   tenPercent=(10*taxableIncome)/100;
    	   System.out.println("Tax is 10%");
       }
       else if(taxableIncome>=200000 && taxableIncome<500000)
       {
    	   twentyPercent=(20*taxableIncome)/100;
    	   System.out.println("Tax is 20%");
       }
       else if(taxableIncome>=500000)
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
