class Student
{
   String Name;
   int Maths;
   int Physics;
   int Chemistry;

   void assignInitialValues(int a,int b,int c)
{
   Maths=a;
   Physics=b;
   Chemistry=c;
}

   void averageMarks()
{
     int Average=(Maths+Physics+Chemistry)/3;
    System.out.println("Average Marks of student is : " +Average);
}
 
    void nameAndMarks(String name)
{ 
      Name=name;
     System.out.println("Name of Student is : " +Name);
    int Marks=Maths+Physics+Chemistry;
     System.out.println("Total Marks of Student : " +Marks);
}
   
   public static void main(String args[])
{
      Student s = new Student();
          s.assignInitialValues(10,10,10);
          s.averageMarks();
          s.nameAndMarks("Divyarani");
}
     
}
  