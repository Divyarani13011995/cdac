//5.	 Write a Java program to reverse elements in a array list.
package com.example.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Question5 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
        al.add("RED");
        al.add("BLACK");
        al.add("GREEN");
        al.add("BLUE");
        al.add("WHITE");
        al.add("VIOLET");
        System.out.println("Before reversing :: ");
        System.out.println(al);
        Collections.reverse(al);
        System.out.println("After reversing :: ");
        System.out.println(al);

	}

}
