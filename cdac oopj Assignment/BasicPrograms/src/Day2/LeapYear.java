
//2)Write a program that checks if a given year is a leap year or not using both if-else. 


package Day2;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year=sc.nextInt();
		if((year % 400==0) || (year %4==0) && (year%100!=0))
		
			System.out.println("This is leap year...");
		else
			System.out.println("This is not leap year...");
			
		

	}

}
