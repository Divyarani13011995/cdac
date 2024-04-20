//Write a Java program to sort a given array list.

package com.example.collection;
import java.util.ArrayList;
import java.util.Collections;
public class Question4 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
          al.add(10);
          al.add(10);
          al.add(90);
          al.add(40);
          al.add(50);
          al.add(30);
          al.add(70);
          Collections.sort(al);
          System.out.println(al);
          
	}

}
