
//6.	Write a Java program of swap two elements in an array list.
package com.example.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Question6 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
        al.add(10);
        al.add(10);
        al.add(90);
        al.add(40);
        al.add(50);
        al.add(30);
        al.add(70);
        Collections.swap(al,1,2);
        System.out.println(al);
		

	}

}
