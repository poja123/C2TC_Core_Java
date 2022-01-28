//polymorphism- one object has many form it is achieved by method overloading(same method name with different fa) 
class Poly
{
	void add()
	{
		int a = 10;
		int b = 23;
		int c = a + b;
		System.out.println(c);
		
	}
	void add(int x ,int y)
	{
		int z= x+y;
		System.out.println(z);
		
	}
	void add(int d ,int e , double f)
	{
		double g = d+e+f;
		System.out.println(g);
	}
	
}
 class PolymorphismCT extends Poly
{
	public static void main(String[]args)
	{
		Poly p = new Poly();
		p.add();
		p.add(34, 89);
		p.add(56, 76, 87.98);
	}
}