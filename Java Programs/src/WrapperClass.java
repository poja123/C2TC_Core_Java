
public class WrapperClass
{
	public static void main(String[]args)
	{
			int a=20; 
			
			System.out.println("AutoBoxing");
			//Explicitly
			Integer i=Integer.valueOf(a);
			Integer j=a;
			System.out.println("a= "+a+" "+"i= "+i+" "+"j= "+j);
			
			//AnotherMethod
			Integer intobj=a;   
			System.out.println("intobj= "+intobj+" "+"a= "+a);  
			
			
			System.out.println("UnBoxing");
			//Implicitly
			Integer a1=new Integer(20);    
			int i1=a1.intValue();//converting Integer to int explicitly  
			int j1=a1;//unboxing, now compiler will write a.intValue() internally    
			    
			System.out.println("a1= "+a1+" "+"i1=" + i1+" "+"j1="+j1);    
			
			//AnotherMethod
			int intvalue=intobj;  
			System.out.println("initvalue=" + intvalue);
		   
	}  
}


