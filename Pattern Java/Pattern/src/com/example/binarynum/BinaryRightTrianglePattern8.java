/* 
1
10
101
1010
10101

 */

package com.example.binarynum;

public class BinaryRightTrianglePattern8 {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				if(j%2==0) 
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}

	}

}