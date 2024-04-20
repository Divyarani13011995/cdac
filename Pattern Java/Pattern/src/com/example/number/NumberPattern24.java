/*
1  
2 6  
3 7 10  
4 8 11 13  
5 9 12 14 15  

 */

package com.example.number;

public class NumberPattern24 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int a=i;
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				a=a+5-j;
			}
			System.out.println(" ");
		}

	}

}
