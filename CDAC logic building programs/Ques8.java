import java.util.*;
class Ques8{


   static void duplicate(int a[])
   {
    //int k;
    int arr[] = new int[a.length];
    for(int i=0,k=0;i<a.length-1;i++)
    {    
        
        if(a[i]!=a[i+1])
        {
            arr[k]=a[i];
            
            System.out.println("the new array is"+arr[k]+" ");
            
        }
        System.out.println("the dupllicatw part is"+a[i]);
    }
   

}
    public static void main(String[] agrs){
         
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of array");
        int n = sc.nextInt();
        
    //taking value of array 1st
    System.out.println("enter the value 1st array");
    int a[] = new int[n];// taking array input
    for (int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }

    duplicate(a);

    System.out.println("the array is printed");
    }

   

}

