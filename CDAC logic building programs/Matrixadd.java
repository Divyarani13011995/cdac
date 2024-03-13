import java.util.*;
class Matrixadd
{
  public static void main(String args[])
   {
       int a[][]=new int[2][2];
       int b[][]=new int[2][2];
       int result[][]=new int[2][2];
       Scanner sc=new Scanner(System.in);
       
      System.out.println("Input in First Matrix : ");

       for(int i=0;i<2;i++)
       {
        for(int j=0;j<2;j++)
         {
           a[i][j]=sc.nextInt();
         }
       }
        System.out.println("Input in Second Matrix : ");
      
        for(int i=0;i<2;i++)
       {
        for(int j=0;j<2;j++)
         {
           b[i][j]=sc.nextInt();       
         }
       }  
       System.out.println("Display First Matrix : ");
      
       for(int i=0;i<2;i++)
       {
        for(int j=0;j<2;j++)
         {
           System.out.print(a[i][j]+ " ");      
         }
           System.out.print("\n");
       }
        System.out.println("Display Second Matrix : ");
      
       for(int i=0;i<2;i++)
       {
        for(int j=0;j<2;j++)
         {
           System.out.print(b[i][j]+ " ");      
         }
           System.out.print("\n");
       } 
       System.out.print("Addition of Matrix is : ");
      
       for(int i=0;i<2;i++)
       {
        for(int j=0;j<2;j++)
         {
           result[i][j]=a[i][j]+b[i][j];      
         }
           System.out.print("\n");
       }  
       for(int i=0;i<2;i++)
       {
        for(int j=0;j<2;j++)
         {
           System.out.print(result[i][j]+ " ");      
         }
           System.out.print("\n");
       }            
    }
}