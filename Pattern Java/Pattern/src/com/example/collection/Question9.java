//9.	Write a Java program to insert the specified element at the specified position in the linked list.
package com.example.collection;

import java.util.LinkedList;

public class Question9 {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList();
	     l.add("RED");
	     l.add("PINK");
	     l.add("BLACK");
	     l.add("WHITE");
	     l.addLast("VIOLET");
	     System.out.println(l);
	     LinkedList<String> l1=new LinkedList();
	     l1.add("GREEN");
	     l1.add("GRAY");
	     l1.addAll(1,l);
	     System.out.println(l1);
	     

	}

}
