class Person 
{

   int age;
   int height;
   int weight;
    
   Person()
   {
     age=30;
     height=165;
     weight=60;
   }
   Person(int age,int height,int weight)
   {
     this.age=age;
     this.height=height;
     this.weight=weight;
   }
   
   void display()
   {
     System.out.println(age);
     System.out.println(height);
     System.out.println(weight);

     
   }
   
   
  public static void main(String args[])
   {
     Person person = new Person();
     Person person1 = new Person(29,167,55);
     person.display();
     person1.display();
   }
}