package com.chainsys.demo4;
import java.util.Scanner;
public class Raining {
    public static char raining;
    public static int temp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("is it raining:");
    raining=sc.next().charAt(0);
    if(raining=='Y'||raining=='N')
    {
	if(raining=='Y')
	{
		System.out.println("Get an umbrella");
	}
	else
	{
		System.out.println("no need for an umbrella");
	}
	System.out.println("Enter the temperature");
    temp=sc.nextInt();
    if(temp>0) 
    {
	if(temp<32)
	{
		System.out.println("Bring heavy jacket");
	}
	else if(temp>=32 && temp<=50)
	{
	   System.out.println("Bring light jacket");	
	}
	else 
	{
		System.out.println("no jacket");
	}
	}
    else {
    	System.out.println("error");
    }
    }
    else
    {
    	System.out.println("error");
    }

}
}
