class Arrayavg
{
  public static void main(String args[])
   {
      int a[]={5,4,3,9,1,7,9};
      int sum=0;
      for(int i=0;i<a.length;i++)
       {
           sum=sum+a[i];
       }
      System.out.println(sum);
      float avg=sum/a.length;
      System.out.println(avg);
   }
}