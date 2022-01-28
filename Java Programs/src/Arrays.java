//Arrays is an object which contains similar types of data in fixed memory . It is index based
//SingleDimension Array
//				Syntax-dataType[] arr; (or)  
//					   dataType []arr; (or)  
//					   dataType arr[]; 

//		Instantiation of an array-	arrayRefVar=new datatype[size];  
public class Arrays
{

	public static void main(String[]args)
	{
		
	
	int a[] = new int[5];  //declaration , Instantiation
	a[0] = 12;   //initialization
	a[1] = 56;
	a[2] = 43;
	a[3] = 78;
	a[4] = 8;
	
	for (int m=0; m<a.length; m++)
	{
		System.out.println(a[m]);
	}
	
	System.out.println("===============================================");
	
	
	int b[] = {34,65,87,76}; //declaration,initialization , instantiation
	for (int i =0;i<b.length;i++)
	{
		System.out.println(b[i]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

