package com.chainsys.polymorphism;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.chainsys.oops.StudentMain;


public class TestABCBank {
    public static String name() {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("User Name:");
        String userName=sc.next();
        Pattern p=Pattern.compile("[A-Z][a-z]");
        Matcher m=p.matcher(userName);
        if(m.find())
        {	
           //System.out.println(name);
        	return userName;
        }
           else
           {
        	System.out.println("Error");
        	TestABCBank.name();
           }
		return userName;
		
	  }
    public static int phNum() {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("User phone number:");
        int userPhNum=sc.nextInt();
        String number=Integer.toString(userPhNum);
        Pattern p=Pattern.compile("^[0-9]*$");
        Matcher m=p.matcher(number);
        if(m.find())
        {	
        	return userPhNum;
        }
           else
           {
        	System.out.println("Error");
        	TestABCBank.phNum();
           }
		return userPhNum;
		
	  }
    public static String address() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        
        System.out.println("Address:");
        String userAddress=sc.next();
        Pattern p=Pattern.compile("[A-Z][a-z]");
        Matcher m=p.matcher(userAddress);
        if(m.find())
        {	
        	return userAddress;
        	
        }
           else
           {
        	System.out.println("Error");
        	TestABCBank.address();
        	
           }
		return userAddress;
		
	  }
    
    public static int aadharNumber() {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("User Aadhar number:");
        int userAadharNumber=sc.nextInt();
        String number=Integer.toString(userAadharNumber);
        Pattern p=Pattern.compile("^[0-9]*$");
        Matcher m=p.matcher(number);
        if(m.find())
        {	
        	return userAadharNumber;
        }
           else
           {
        	System.out.println("Error");
        	TestABCBank.aadharNumber();
           }
		return userAadharNumber;
		
	  }
    public static int accountNum() {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("User Account number:");
        int userAccountNumber=sc.nextInt();
        String number=Integer.toString(userAccountNumber);
        Pattern p=Pattern.compile("^[0-9]*$");
        Matcher m=p.matcher(number);
        if(m.find())
        {	
        	return userAccountNumber;
        }
           else
           {
        	System.out.println("Error");
        	TestABCBank.accountNum();
           }
		return userAccountNumber;
		
	  }
    public static int deposit() {
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("enter the amount:");
    	int amount=sc.nextInt();
    	int deposit=5000;
    	System.out.println("Deposit Amount:"+deposit);
    	deposit=deposit+amount;
    	//System.out.println(deposit);
    	System.out.println("Before deposit balance:"+amount);
    	//System.out.println("after deposit:"+deposit);
    	return deposit;
    }
//     public static int deposit(int amount,int accountNumber) {
//    	 Scanner sc=new Scanner(System.in);
//    	 amount=sc.nextInt();
//    	 int deposit=6000;
//    	 return deposit=deposit+amount;
//    	 
//     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        ABCBank bank=new ABCBank();
        bank.setUserName(TestABCBank.name());
        bank.setUserPhNum(TestABCBank.phNum());
        bank.setUserAddress(TestABCBank.address());
        bank.setUserAadharNumber(TestABCBank.aadharNumber());
        bank.setUserAccountNumber(TestABCBank.accountNum());
        bank.setDeposit(TestABCBank.deposit());
        //bank.setDeposit(TestABCBank.deposit(0, 0));
  
        System.out.println("User name:"+bank.getUserName());
        System.out.println("User address:"+bank.getUserAddress());
        System.out.println("User phonenumber:"+bank.getUserPhNum());
        System.out.println("User Aadharnumber:"+bank.getUserAadharNumber());
        System.out.println("User account number:"+bank.getUserAccountNumber());
        System.out.println(bank.getDeposit());
       // System.out.println(bank.getDeposit());

	}
     
}
