package com.chainsys.demo4;

public class Fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int number=1;number<=100;number++) 
		{ 
		if(number%3==0 && number%5==0) 
		{
			System.out.println(number+": FizzBizz");
		}
		else if(number%5==0)
		{
			System.out.println(number+":Buzz");
		}
		else if(number%3==0) 
		{
		System.out.println((number+":Fizz"));
	    }
		}
	}
}

