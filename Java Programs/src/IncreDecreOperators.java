public class IncreDecreOperators 
{
	
	   public static void main(String[] args)
	    {
	        int a=21;
	        int b = 16-(--a);
	        int c = ++b-a++;
	        int d = --c*c++;
	        int e = ++a - b-- + d++;
	        System.out.println(a+b+c+d-e-b+20);
	        System.out.println(--c + d++ * a);
	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);
	        System.out.println(d);
	        System.out.println(e);
	    }
	}


