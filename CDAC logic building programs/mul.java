import java.util.Scanner;
class Mul
{
 public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the no : ");
     int no=sc.nextInt();

     for(int i=1;i<=10;i++)
     {
        System.out.println(no*i);
       } 
     
  /*   for(int i=1;i<=10;i++)
     {
       for(int j=1;j<=10;j++)
        {
          int table=i*j;
          System.out.print(table+ " " );
        }
         System.out.println();
     }*/
}
}