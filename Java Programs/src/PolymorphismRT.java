//Polymorphism RT is achieved by Method overrdidng (same method name with same fa)


class Super
{
	void print()
	{
		System.out.println("Super Class Method is executed");
	}
}
class Sub extends Super
{
	@Override
	void print()
	{
		//super.print();-it will execute super class method 
		System.out.println("Sub class Method is executed");
	}
}
class PolymorphismRT
{
	public static void main(String[]args)   
	{
		Sub su = new Sub();
		su.print();   //if method wont override super class method wiill execute
		
	}
}