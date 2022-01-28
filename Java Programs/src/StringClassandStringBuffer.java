//String class is immutable while StringBuffer is mutable
//String Class use constant pool for memory while StingBuffer uses Heap Memory
public class StringClassandStringBuffer
{
	public static void main(String[]args)
	{
		//String Class 
		String s = new String("Pooja");
		s.concat("Nair");
		System.out.println(s);   //in String class Concatenation is not possible
																			//not append
		
		
		
	   //StringBufferClass
		StringBuffer sb = new StringBuffer("Pooja");
		sb.append("Nair");
		System.out.println(sb);   //for joining append is used 
		
	}
}
