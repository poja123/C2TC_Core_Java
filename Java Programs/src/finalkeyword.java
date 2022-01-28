//The final keyword in java is used to restrict the user
/*final class finalkeyword  //finalclass
{
}
 
 class keyword extends finalkeyword
{  
  void run()
  {System.out.println("keyword class extending final keyword class");}  
    
  public static void main(String args[])
  {  
	  keyword key= new keyword();
	  keyword.run();
  }  
}
*/
 
 public class finalkeyword
 {  
	 final int speed=90;//final variable  
	 void run()
	 {  
	  speed=400;  
     }  
	 public static void main(String args[])
	 {  
	 finalkeyword obj= new finalkeyword ();  
	 obj.run();  
	 }  
	}


