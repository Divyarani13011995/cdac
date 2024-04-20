package com.example.binarynum;

public class BinaryNumberSquarePattern7 {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++) {
		int num;
			if(i%2==0) {
				num=1;
				System.out.print(num);
			}
			else
			{
			   num=0;
				System.out.print(num);
			}
		
		for(int j=0;j<4;j++) {
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

