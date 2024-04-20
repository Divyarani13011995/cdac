//1.	Write a Java program to create a new array list, add some colors (string) and print out the collection
package com.example.collection;

import java.util.ArrayList;
public class Question1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
         al.add("RED");
         al.add("BLACK");
         al.add("GREEN");
         al.add("BLUE");
         al.add("WHITE");
         al.add("VIOLET");
         System.out.println(al);
	}

}
