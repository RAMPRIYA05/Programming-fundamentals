package com.chainsys.demo4;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int var1,var2;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the value of var1:");
          var1=sc.nextInt();
          System.out.println("Enter the value of var2:");
          var2=sc.nextInt();
          if(var1<var2){
        	  System.out.println("var1 is lessthan var2");
          }
          else {
        	  System.out.println("var1 is not lessthan var2");
          }
          if(var1<=var2){
        	  System.out.println("var1 is less than or equal to var2");
          }
          else {
        	  System.out.println("var1 is not less than or equal to var2");
          }
          if(var1>var2){
        	  System.out.println("var1 is greater than var2");
          }
          else {
        	  System.out.println("var1 is not greater than var2");
          }
          if(var1>=var2){
        	  System.out.println("var1 is greater than or equal to var2");
          }
          else {
        	  System.out.println("var1 is not greater than or equal to var2");
          }
          if(var1==var2){
        	  System.out.println("var1 is equal to var2");
          }
          else {
        	  System.out.println("var1 is notequal to var2");
          }
	}

}

