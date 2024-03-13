class Example
{
  
int display()
{
   int a=10;
  return a;
}
public static void main(String args[])
  { 
    Example example = new Example();    //object created
    int b =example.display();
   System.out.println(b);
  }

}