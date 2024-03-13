import java.util.Scanner;
class Calculator
{
  public static void main(String args[])
  {
    System.out.println("*****Simple Calculator*****");
    System.out.println("----------------------------");
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the first number : ");
     int Number1=sc.nextInt();
    System.out.print("Enter the Second number : ");
     int Number2=sc.nextInt();

    System.out.println("Choose your option");
    System.out.println("1 . Addition");
    System.out.println("2 . Subtraction");
    System.out.println("3 . Multiplication");
    System.out.println("4 . Division");
   
    int choice=sc.nextInt();
    System.out.println("Enter your choice : " +choice);

    switch(choice)
       {
        case 1 : System.out.println("Result : " +Number1+ " + "  +Number2+ " = " +(Number1+Number2));
        break;
         
        case 2 : System.out.println("Result : " +Number1+ " - "  +Number2+ " = " +(Number1-Number2));
        break;
        
        case 3 : System.out.println("Result : " +Number1+ " * "  +Number2+ " = " +(Number1*Number2));
        break;

        case 4 : System.out.println("Result : " +Number1+ " / "  +Number2+ " = " +(Number1/Number2));
        break;
        
        default : System.out.println("Invalid Choice....");

    
       }
    
  }
}