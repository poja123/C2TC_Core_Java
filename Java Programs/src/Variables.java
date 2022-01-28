//Variables 1-Local Variables 2-Instance Variables 3-Static Variables
public class Variables
{
int a =10;//instance variable
static int b = 20;//static variable

public static void main(String[] args)  //static method
{
 int c = 30;//local variable
 System.out.println(c);
 System.out.println(b); // static variable can be accessed in static method
 //System.out.println(a);(non-static variable ie instance variable cant accessed in static method directly)
 Variables v = new Variables();
 System.out.println(v.a);  // instance variable can be accessed with object creation in static method  

 
}

}

