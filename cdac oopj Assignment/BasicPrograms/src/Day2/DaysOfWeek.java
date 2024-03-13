//4)Write a program that takes a number representing a weekday (1-7) and prints the name of the 
//weekday using switch-case.

package Day2;
import java.util.*;
public class DaysOfWeek {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice :");
		int day=sc.nextInt();
		switch(day)
		{
		case 1 : System.out.println("Sunday");
		break;
		case 2 : System.out.println("Monday");
		break;
		case 3 : System.out.println("Tuseday");
		break;
		case 4 : System.out.println("Wednesday");
		break;
		case 5 : System.out.println("Thursday");
		break;
		case 6 : System.out.println("Friday");
		break;
		case 7 : System.out.println("Saturday");
		break;
		default :
			System.out.println("Invalid Day....1");
		
		}
		

	}

}
