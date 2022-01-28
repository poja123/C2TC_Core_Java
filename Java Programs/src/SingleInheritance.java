class Animal
	{
	   public  void eat()
	    {
	        System.out.println("Hey babes");
	    }

	}
	class Dog extends Animal
	{
	   public  void bark()
	    {
	        System.out.println("Hello");
	    }
	    
	}
	class SingleInheritance
	{
	     public static void main(String[] args)
	    {
	        Dog d = new Dog();
	        d.eat();
	        d.bark();
	        
	    }
	}


