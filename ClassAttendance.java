package com.chainsys.demo4;
import java.util.Scanner;
public class ClassAttendance {
	public static String student;
    public static int noofclassattended;
    public static int noofclassheld;
    public static int percentagenoofclassattended;
    public static char medicalcause;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       //String student;
       //int noofclassattended;
       //int noofclassheld;
       System.out.println("Enter No Of Class Held");
       noofclassheld=sc.nextInt();
       if(noofclassheld>0) 
       {
           System.out.println("Enter No Of Class Attended");
           noofclassattended=sc.nextInt();
       if(noofclassattended>0)
       {
              System.out.println("Enter the medical cause 'Y'/'N':");
              medicalcause=sc.next().charAt(0);
       if(medicalcause=='Y'||medicalcause=='N') 
       {
             percentagenoofclassattended=(noofclassattended*100)/noofclassheld;
       if(percentagenoofclassattended>0)      
       {
       if(percentagenoofclassattended>=75) 
       {
    	   System.out.println("Allow student to sit");
       }
       else if(medicalcause=='Y'){
    	   System.out.println("Allow to sit");
       }
       else
       {
    		System.out.println("Not Allow to sit");
    	}
       }
       else {
    	   System.out.println("error");
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
       else {
    	   System.out.println("error");
       }
	}
}