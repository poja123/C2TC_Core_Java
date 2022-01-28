//The protected access modifier is accessible within package and outside the package but through inheritance only.
public class protectedaccessmodifier 
{
	protected void msg()
	{
		System.out.println("Protected AccessModifier");
	}
}

 class AccessModifier extends protectedaccessmodifier 
{
	public static void main(String[]args)
	{
		
		AccessModifier prm = new AccessModifier();
		prm.msg();
		
	}
	
}
