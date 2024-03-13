
//1)Write a program that takes a numerical grade as input and outputs the corresponding letter 
//grade using if-else statements. 

package Day2;
import java.util.*;

public class IfElseGrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int Grade=sc.nextInt();
		
		if(Grade >=85)
			System.out.println("First class with Distinction....");
		else if(Grade>=65 && Grade <85)
		System.out.println("First Class...");
		else if (Grade >=50 && Grade <65)
		System.out.println("Second Class...");
		else if (Grade >=40 && Grade <50)
			System.out.println("Pass class");
		else
			System.out.println("Fail");
		
		

	}

}
