//InstanceOfOperator-It is used to test whether the object is an instance of the specified type (class or subclass or interface)
//Syntax  after creation of obj  (objname instanceof Classname)
public class InstanceofOperator 
{
	 public static void main(String args[])
	 {  
		 InstanceofOperator iop =new InstanceofOperator();  
		 System.out.println(iop instanceof InstanceofOperator);   //if obj is not an instance thn it will compilation error
		 
		 InstanceofOperator op1 = null;
		 System.out.println(op1 instanceof InstanceofOperator);  //if we apply instance variable with null it will give false 
		 
		 
      }  

}
