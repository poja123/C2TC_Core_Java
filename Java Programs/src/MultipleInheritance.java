class Electronics 
{
    public   Electronics()
    {
        System.out.print("Class Electronics");
    }
    public void DevicType()
    {
        System.out.println("Device Type");


    }
}
    class Television extends Electronics
    {
        public  Television()
        {
            System.out.print("class Television");
        }
        public void category()
        {
            System.out.println("Category-Televsion");
        }
    }
        class LED extends Television
        {
            public LED() 
            {
                System.out.println("Class LED");
            }
            public void display_tech() 
            {
                System.out.println("Display Technology- LED");
            }
        }
public class MultipleInheritance
{
    public static void main(String[] arguments) 
    {
        LED led = new LED();
        led.DevicType();
        led.category();
        led.display_tech();
    }
}