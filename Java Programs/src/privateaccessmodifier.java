
//private access modifier can be accessed within class it cant access outside the class
class Acessmodifier
	{
	private void display()
		{
			System.out.println("GeeksforGeeks");
		}
	}

	public class privateaccessmodifier
	{
	public static void main(String args[])
		{
		Acessmodifier obj = new Acessmodifier();
			                                        // Trying to access private method
			                                            // of another class
			obj.display();
		}
	}



