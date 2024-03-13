class Arraymin
{
  public static void main(String args[])
   {
       int a[]={5,4,3,9,1,7,9};
       int min=a[0];
       int max=a[0];
       for(int i=0;i<a.length;i++)
        {
          
          if(a[i]<min)
            {
              min=a[i];
            }
         if(a[i]>max)
            {
              max=a[i];
            }     
         }
       System.out.println("min : " +min);
       System.out.println("max : " +max);
   }
}