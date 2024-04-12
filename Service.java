package com.chainsys.demo4;
import java.util.Scanner;
public class Service {
	public static int age;
	public static char sex;
	public static char maritalstatus;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter age:");
      age=sc.nextInt();
      if(age>0)
      {
       System.out.println("Enter Marital status(Y/N):");
       maritalstatus=sc.next().charAt(0);
      if(maritalstatus=='Y' || maritalstatus=='N')
      {
      System.out.println("Sex(F/M):");
      sex=sc.next().charAt(0);
      if(sex=='F' || sex=='M')
      {
    
      if(sex=='F')
      {
    	  System.out.println("only work in urban areas");
      }
      else if(sex=='M' && (age>=20 && age<40)) 
      {
    	  System.out.println("He may work in anywhere");
      }
      else if(sex=='M' && (age>=40 && age<60))  {
    	  System.out.println("He will work in urban areas");
      }
      else {
    	  System.out.println("ERROR");
      } 
	  }
      else 
      {
    	  System.out.println("Error");
      }
      }
      else {
    	  System.out.println("Error");
      }
      }
      else {
    	  System.out.println("Error");
      }
	}
	
}
