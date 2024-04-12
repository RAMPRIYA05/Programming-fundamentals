package com.chainsys.demo4;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=5;
       int b=3;
      if(a>0 && b>0) 
      {
       System.out.println(a<b && a==b);
       System.out.println(a>b && a==b);
       System.out.println(a>=b && a==b);
       System.out.println(a<=b && a==b);
       System.out.println(a<b || a==b);
       System.out.println(a>b || a==b);
       System.out.println(a>=b || a==b);
       System.out.println(a<=b || a==b);
       System.out.println(a>=b || a!=b);
       System.out.println(a<b || a!=b);
       System.out.println(a>b || a!=b);
       System.out.println(a<=b || a!=b);
       System.out.println(a==b || a!=b);     
	}
      else {
    	  System.out.println("Error");
      }
}
}