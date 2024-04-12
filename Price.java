package com.chainsys.demo6;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Price {
	public static double km;
	public static double cabPrice;
	public static double totalPrice;
	public static double discount;
	public static double actualPrice;
	public static double amount;
	//public static double Coup_5;
	//public static double Coup_2;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the user name:");
         String userName=sc.next();
         String regex = "^[a-zA-Z]+(?:['\\s-][a-zA-Z]+)*$";
         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(userName);
         if (matcher.matches()) 
         {
     	 Price.name();
     	 Price.cab();
     	 Price.discount(); 
     	 Price.coupon();
         }
         
	}
	
    public static void name()
    {
    	String dropPoint="periyar";
    	System.out.println("drop point:"+dropPoint);
    	String pickUpPoint="vadapalanji";
    	System.out.println("pickup point:"+pickUpPoint);
    }
    public static int kilometer() 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the kilometer:");
    	int km=sc.nextInt();
		return km;
    }
    
    public static double cab()
    {   
    	Scanner sc=new Scanner(System.in);
    	double km = Price.kilometer();
    	 System.out.println("enter the cab type");
    	 String cabType=sc.next();
    	switch (cabType) 
    	{
    	case "micro":
    		//cabPrice=10;
    		totalPrice=km*10;
    		amount=totalPrice;
    		System.out.println("Amount:"+amount);
    		break;
    	case "mini":
    		
    		totalPrice=km*15;
    		amount=totalPrice;
    		System.out.println("Amount:"+amount);
    		//totalPrice=km*cabPrice;
    		break;
    	case "prime":
    		
    		totalPrice=km*20;
    		amount=totalPrice;
    		System.out.println("Amount:"+amount);
    		//totalPrice=km*20;
    		break;
         default:
        	 System.out.println("invalid");
    			return 0;
    
    	}
    	return amount;
    }



    
    public static void discount()
    {
		
		if(totalPrice>2000) {
			discount=totalPrice*0.02;
			System.out.println("Discounted amount"+discount);
		}
		
		else if(totalPrice>=5000) {
			discount=totalPrice*0.05;
			System.out.println("Discounted amount"+discount);
		}
		else {
			System.out.println("no discount");
		}
		actualPrice=totalPrice-discount;
		System.out.printf("Actual amount"+actualPrice);
		
    	
    }
    
    public static void coupon() {
    	Scanner sc=new Scanner(System.in);
    	//double actualPrice=Price.discount();
    	 System.out.println("\nenter the coupon code:");
    	 String couponCode=sc.next();
    	 
    	 double COUP_2;
    	 double COUP_5;
    	 
    	 String COUP_21 = "COUP_2";
    	 String COUP_51 = "COUP_5";

    	 if (couponCode.equals(COUP_21) || couponCode.equals(COUP_51)) {
    	     System.out.println("Valid for discount");
    	 } else if (couponCode.equals(COUP_21)) {
    	     System.out.println("Get 2% discount on the bill amount");
    	 } else if (couponCode.equals(COUP_51)) {
    	     System.out.println("Get 5% discount on the bill amount");
    	 } else {
    	     System.out.println("Invalid coupon code");
    	 }
    
    }
}
    
   

