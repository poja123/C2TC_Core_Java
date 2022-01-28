
public class MultiDimensionalArray 
{
	public static void main(String[]a)
	{
		//2D Array
//    Syntax- dataType[][] arrayRefVar; (or)  
//    Syntax- dataType [][]arrayRefVar; (or)  
//    Syntax- dataType arrayRefVar[][]; (or)  
//    Syntax- dataType []arrayRefVar[];   
		
// int[][] arr=new int[3][3];//3 row and 3 column 
		
		int[][] d = new int[3][3];
		d[0][0] = 45;
		d[0][1] = 67;
		d[0][2] = 45;
		d[1][0] = 78;
		d[1][1] = 89;
		d[1][2] = 89;
		d[2][0] = 90;
		d[2][1] = 87;
		d[2][2] = 33;
	
		for (int i=0;i<d.length;i++)
		{
			for (int j=0;j<d.length;j++)
			{
				System.out.println(d[i][j]);
			}
		}
		
		System.out.println("===============================================");
		
		
		//3D Array
		
		int[][][] r = new int[2][2][2];
		r[0][0][0] = 66;
		r[0][0][1] = 90;		
		r[0][1][0] = 77;
		r[0][1][1] = 55;
		r[1][0][0] = 688;
		r[1][1][0] = 898;
		
		for (int m=0;m<r.length;m++)
		{
			for (int n=0;n<r.length;n++)
			{
				for (int x=0;x<r.length;x++)
				{
					System.out.println(r[m][n][x]);
				}
			}
		}
		
		
		
		
		
		
		
	}

}
