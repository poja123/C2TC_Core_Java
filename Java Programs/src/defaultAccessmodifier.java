//default Acess Modifer = It can be used within the package bt not outside the package 
//.That is the reason why default accessmodifer is also known as Package Level Modifier
 class defaultAccessmodifier
{
	 String name = "Pranaya Nair";
	  String email = "pranaya@gmail.com";
	  int age = 23;
	  
	  public static void main(String[] args)
	  {
		  defaultAccessmodifier myObj = new defaultAccessmodifier();
	    System.out.println("Name: " + myObj.name);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	  }

}
