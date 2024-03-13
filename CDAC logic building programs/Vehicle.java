class Vehicle{
      float Price;
      String Colour;
      String Model;

      Vehicle(float p,String c,String m)
      {
       Price=p;
       Colour=c;
       Model=m;
       }

       void display()
      { 
        System.out.println("Price of Vehicle : "+Price);
        System.out.println("Colour of Vehicle : "+Colour);
        System.out.println("Model of Vehicle : "+Model);

      }

public static void main(String args[])
{
   Vehicle v=new Vehicle(100.00f,"Grey","M55");
         v.display();
}
}