//3.	Write a Java program to retrieve an element (at a specified index) from a given array list.

package com.example.collection;

import java.util.ArrayList;

public class Question3 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
        al.add("RED");
        al.add("BLACK");
        al.add("GREEN");
        al.add("BLUE");
        al.add("WHITE");
        al.add("VIOLET");
       System.out.println(al.get(0));
       System.out.println(al.get(3));
        

	}

}
