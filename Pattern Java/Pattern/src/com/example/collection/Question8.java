//8.	Write a Java program to append the specified element to the end of a linked list.
package com.example.collection;
import java.util.LinkedList;
public class Question8 {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList();
		     l.add("RED");
		     l.add("PINK");
		     l.add("BLACK");
		     l.add("WHITE");
		     l.addLast("VIOLET");
		     System.out.println(l);

	}

}
