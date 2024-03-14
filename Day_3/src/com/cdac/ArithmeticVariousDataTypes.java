/*3) Write a program that performs arithmetic operations involving different data types (int, double, float) 
and observes how Java handles widening conversions automatically*/

package com.cdac;

public class ArithmeticVariousDataTypes {

	public static void main(String[] args) {
		int a=10;
		float b=20;
		double d=12.5;
		//int sum=a+b+d; //can not convert int to double error.
		double sum=a+b+d;
		System.out.println(sum); //output : 42.5
		//float sum1=a+b+d; //it also gives error like can not convert float to double.
       
	}

}
