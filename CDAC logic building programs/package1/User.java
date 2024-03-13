//Virtual Library Management System
 import java.util.*;

class User
{
  int userId;
  String name;
  boolean booksBorrowed;
  User()
  {
    userId=101;
    name="Divya";
    booksBorrowed=true;
  }
  
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  
  Book book = new Book();
  System.out.println("Welcome to the Virtual Library Management System!");
  System.out.println("1. Borrowed a Book");
  System.out.println("2. Return a Book");
  System.out.println("3. Display Available Book");
  System.out.println("4. Display Borrowed Book");
  System.out.println("5. Exit");
  System.out.println("Enter your choice :");
  int choice=sc.nextInt();
  
  
  
} 
}
