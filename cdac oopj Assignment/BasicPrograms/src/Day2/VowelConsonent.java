//5)Write a program that takes a character as input and determines whether it’s a vowel or a 
//consonant using if-else.
package Day2;
import java.util.*;
public class VowelConsonent {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character : ");
		char c=sc.next().charAt(0);
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println("IT IS VOWEL");
		}
		else
			System.out.println("IT IS CONSONENT");
		
	}

}
