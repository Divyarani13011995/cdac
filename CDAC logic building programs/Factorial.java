import java.util.Scanner;
class Factorial
{
 public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number : ");
     int no=sc.nextInt();
    int i=1,fact=1;
    /*for(int i=1;i<=no;i++)
    {
      fact=fact*i;
    }*/
    while(i<=no)
    {
      fact=fact*i;
      i++;
    }
   

    System.out.println("Factorial of given number is : " +fact);


  }
}