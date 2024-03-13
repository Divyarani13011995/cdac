import java.util.*;
class ConditionalOperatorExample
{
 public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the First number : ");
    int no1=sc.nextInt();
    System.out.print("Enter the Second number : ");
    int no2=sc.nextInt();
    
    int result = (no1>no2) ? no1 : no2;
    System.out.println("Largest Number : "+result);
    
    
  }
}