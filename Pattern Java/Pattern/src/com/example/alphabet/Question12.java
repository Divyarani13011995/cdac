/*
      A 
     A B 
    A B C 
   A B C D 
  A B C D E 
 A B C D E F 

 */
package com.example.alphabet;

public class Question12 {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
		{
			for(int j=6;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1,p='A';k<=i;k++,p++)
			{
				System.out.print((char)p+" ");
				
			}
			System.out.println();
		}

	}

	

}
