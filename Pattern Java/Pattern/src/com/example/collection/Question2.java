//2.	Write a Java program to insert an element into the array list at the first position.

package com.example.collection;

import java.util.ArrayList;

public class Question2 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
        al.add("RED");
        al.add("BLACK");
        al.add("GREEN");
        al.add("BLUE");
        al.add("WHITE");
        al.add("VIOLET");
        System.out.println(al);
        al.add(0,"PINK");
        System.out.println(al);

	}

}
