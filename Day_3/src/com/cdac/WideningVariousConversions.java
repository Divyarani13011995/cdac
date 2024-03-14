/*4) Write a Program that demonstrates widening conversion from int to (double,float, boolean, string) and 
prints the result */
package com.cdac;

public class WideningVariousConversions {

	public static void main(String[] args) 
	{ 
		//conversion int=>double
		int a=10;
		double b=(double)a;
		System.out.println(a); //10
		System.out.println(b); //10.0
		//conversion int to float
		int a1=10;
		float b1=(float)a1;
		System.out.println(a1); //10
		System.out.println(b1); //10.0
		//conversion int to boolean
		//int a2=10;
	   // boolean b2=(boolean)a2;  //can not cast int to boolean.
		int a3=5;
		boolean b3=( a3==10);
		System.out.println("match than print : "+b3);  //Not match then print : false
		
		int number=1;
		//String str =(String)number; //here we will get error
		String str=Integer.toString(number);
		System.out.println(str);  // output : 1
        
				
	}

}
