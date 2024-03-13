import java.util.*;
class Matrixequal
{
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int a[][]=new int[2][2];
     int b[][]=new int[2][2];
     System.out.println("Input first Matrix : ");
     for(int i=0;i<2;i++)
     {
       for(int j=0;j<2;j++)
        {
          a[i][j]=sc.nextInt();
        }
     }  
     System.out.println("Input second Matrix : ");
     for(int i=0;i<2;i++)
     {
       for(int j=0;j<2;j++)
        {
          b[i][j]=sc.nextInt();
        }
     } 
     System.out.println("Display first Matrix : ");
     for(int i=0;i<2;i++)
     {
       for(int j=0;j<2;j++)
        {
          System.out.print(a[i][j]+ " ");
        }
         System.out.println();
     }   
     System.out.println("Display second Matrix : ");
     for(int i=0;i<2;i++)
     {
       for(int j=0;j<2;j++)
        {
          System.out.print(b[i][j]+ " ");
        }
       System.out.println(); 
     }
       for(int i=0;i<2;i++)
     {
       for(int j=0;j<2;j++)
        {
          if(a[i][j]==b[i][j])
            System.out.println("Matrices are equal"); 
         else
            System.out.println("Matrices are not equal");  
         
        }
     }
     
     
   }
}