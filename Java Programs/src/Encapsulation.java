class Emp
{
	int id;
	String name;
	private long sal;
	Emp(int id,String name,long sal)
	{
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	//getter method
	public double getSal()
	{
		return sal;
	}
	//setter method
	public void setSal(long sal)
	{
		this.sal = sal;
	}
	
}
class Encapsulation
{
	public static void main(String[]args)
	{
		Emp e1 = new Emp(4576,"Pranaya",90000);
		e1.setSal(100000);
		System.out.println("Id="+e1.id);
		System.out.println("Name="+e1.name);
		System.out.println("Sal="+e1.getSal());
	}
}
