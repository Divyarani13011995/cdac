class ArraySecondLargest
{
  public static void main(String args[])
   {
      int a[]={5,3,9,7,1};
      int temp;
      for(int i=0;i<a.length-1;i++)
      {
       for(int j=i+1;j<a.length;j++)
       {
         if(a[i]<a[j])
         {
           temp=a[i];
           a[i]=a[j];
           a[j]=temp;
         }
         
       }
       
       }
System.out.println("Second largest element is : "+a[1]);
 }    

}