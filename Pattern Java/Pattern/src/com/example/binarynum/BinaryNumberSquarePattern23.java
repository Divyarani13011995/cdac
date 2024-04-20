/*
1010101
0101010
1010101
0101010
1010101
0101010
1010101


 */



package com.example.binarynum;

public class BinaryNumberSquarePattern23 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			int num;
			if(i%2==0) {
				num=0;
				System.out.print(num);
			}else
				{
					num=1;
					System.out.print(num);
				}
			for(int j=1;j<7;j++) {
				if(num==1)
				
					num=0;
					
				else
				
					num=1;
					System.out.print(num);
				
				
			}
			System.out.println();
		}

	}

}
