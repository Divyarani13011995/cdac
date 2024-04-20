
//Write a Java program to print all the elements of a ArrayList using the position of the elements.
package com.example.collection;

import java.util.ArrayList;

public class Question7 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
        al.add("RED");
        al.add("BLACK");
        al.add("GREEN");
        al.add("BLUE");
        al.add("WHITE");
        al.add("VIOLET");
        System.out.println("printing arraylist :: ");
        System.out.println(al);
        System.out.println("Arraylist using position of the elements :: ");
        for(int i=0;i<al.size();i++) {
           System.out.println(al.get(i));
	}

}
}