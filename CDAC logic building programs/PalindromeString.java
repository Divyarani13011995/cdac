class PalindromeString
{
 public static void main(String args[])
  {
   String str="hello";
   String str1=str;
   String rev="";
   
   for(int i=str.length()-1;i>=0;i--)
    {
     rev=rev+str.charAt(i);
    }
   if(str1.equals(rev))
      System.out.println("String is Palindrome...");
   else
      System.out.println("String is not palindrome....");
  }
}