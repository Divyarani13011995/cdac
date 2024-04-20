/*
1
121
12321
1234321
123454321
12345654321
1234567654321

 */

package com.example.number;

public class NumberPattern19 {

	public static void main(String[] args) {
		
		int odd=1;
		for(int i =1;i<=7;i++) {
			int k=0;
			for(int j=1;j<=odd;j++) {
				if(j<=i)
					k=k+1;
				else
					k=k-1;
				System.out.print(k);
			}
			System.out.println();
			odd=odd+2;
		}

	}

}
