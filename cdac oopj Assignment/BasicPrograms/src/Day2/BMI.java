/*6)Implement a program that calculates the Body Mass Index (BMI) based on height and weight 
input using if-else to classify the BMI int categories (underweight, normal weight, overweight, 
etc.)  */

package Day2;
import java.util.*;
public class BMI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your height : ");
		double height=sc.nextDouble();
		System.out.println("Enter your Weight : ");
		double Weight=sc.nextDouble();
		
		double BMI=Weight/(height*height);
		System.out.println("Your body mass index is : "+BMI);
		
		if(BMI<=18.5)
			System.out.println("You are underweight");
		else if (BMI>18.5 && BMI<=25)
			System.out.println("You are normal weight");
		else if (BMI>25 && BMI<=30)
			System.out.println("You are overweight");
		else
			System.out.println("Please enter values again");
		
	}

}
