package Day2;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("choice 1 : Addition");
		System.out.println("choice 2 : Subtraction");
		System.out.println("choice 3 : Multiplication");
		System.out.println("choice 4 : Division");
		System.out.println("Enter num1 : ");
		int num1=sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2=sc.nextInt();
		System.out.println("Enter your choice : ");
		int choice=sc.nextInt();
		
		
		switch(choice)
		{
		case 1 : System.out.println("Addition of number is :" +(num1+num2));
		        break;
		case 2 : System.out.println("Subtraction of number is :" +(num1-num2));
		        break;
		case 3 : System.out.println("Multiplication of number is :" +(num1*num2));
		        break;
		case 4 : System.out.println("Division of number is :" +(num1/num2));
		         break;
		}
	}

}
