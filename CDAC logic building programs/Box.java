class Box
{
  int height;
  int width;
  int breadth;
 
Box()
{
  height=10;
  width=10;
  breadth=10;
}

void getVolume()
{
   int Volume=height*width*breadth;
   System.out.println("Volume of box is : " +Volume);
}

void getArea()
{
   int Area=2*height*width+2*height*breadth+2*width*breadth;
   System.out.println("Area of Box is :" +Area);
}

  
public static void main(String args[])
{
  Box box1=new Box();
   box1.getVolume();
  Box box2=new Box();
   box2.getArea();
   
}}