//if any class os declared as abstract thn object wont  created bec there is nothing to be calculated as we r not cleared
		//bt after we get cleared we can perfrom on abstract class extending the classes
abstract class 	Vehicles
{

	void nameofvehicles()
	{
		
	}
}

class Bike extends Vehicles
{
	void bike()
	{
		System.out.println("Bike is running");
		
	}


}

class Bus extends Vehicles
{
	void bus()
	{
		System.out.println("Bus is running");
		
	}
	
}



public class abstractkeyword
{  
	    public static void main(String[] args) 
	    {  
	  
	    Bike obj=new Bike();  
	    obj.bike(); 
	    
	    Bus obj1=new Bus();  
	    obj1.bus(); 
	    
	    
	    
	    }  
}
