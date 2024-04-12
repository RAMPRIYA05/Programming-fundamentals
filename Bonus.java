package com.chainsys.demo4;
import java.util.Scanner;
public class Bonus {
	public static String user;
    public static double salary;
    public static double netbonus;
    public static int yearofservice;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the salary:");
      salary=sc.nextDouble();
      if(salary>0) 
      {
      System.out.println("Enter the year of service");
      yearofservice=sc.nextInt();
      if(yearofservice>0) 
      {
      netbonus=(salary*5)/100;
      System.out.println(netbonus);
      if(yearofservice>5)
      {
    	  System.out.println("We get bonus");
      }
      else
      {
    	  System.out.println("we don't get bonus");
      }
      }
      else
      {
    	  System.out.println("Error");
      }
      }
      else
      {
    	  System.out.println("error");
      }
	}

}
