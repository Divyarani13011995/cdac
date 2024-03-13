import java.util.Scanner;
class Prime
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number :");
  int no=sc.nextInt();
int count=0;
  for(int i=1;i<=no;i++)
{
  if(no%i==0)
  count++;
}
  if(count==2)
      System.out.println("Prime no..");
  else 
      System.out.println("Not Prime no..");


}
}
