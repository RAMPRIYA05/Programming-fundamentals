package com.chainsys.demo4;
import java.util.Scanner;
public class Discount {
    public static int productquantity1;
    public static int productquantity2;
    public static int productquantity3;
    public static int totalquantity;
    public static double cost;
    public static double discount;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           System.out.println("enter the product quantity");
           productquantity1=sc.nextInt();
           productquantity2=sc.nextInt();
           productquantity3=sc.nextInt();
           if(productquantity1>0 && productquantity2>0 && productquantity3>0)
           {
           totalquantity=productquantity1+productquantity2+productquantity3;
           System.out.println("Total quantity:"+totalquantity);
           cost=totalquantity*100;
           System.out.println("cost:"+cost);
           discount=(10*cost)/100;
           if(cost>1000) {
                System.out.println("we get discount");
           	}
           else
           {
        	   System.out.println("not eligible for discount");
           }
           }
           else
           {
        	   System.out.println("error");
           }
       }
}
