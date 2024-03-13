import java.util.Scanner;
class Sumofdigit
{
 public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Number : ");
      int no=sc.nextInt();
      int r,sum=0;
      while(no>0)
       {
          r=no%10;
          sum=sum+r;
          no=no/10;
       }
      System.out.println(sum);
   }
}
