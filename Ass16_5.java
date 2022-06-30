 /*
Enter the Row
4
Enter the Col
4
	1	2	3	4
		2	3	4
			3	4
				4


 */
import java.lang.*;
import java.util.*;

class NumberX
{
	private int iRow,iCol;

	public NumberX(int a,int b)
	{
		this.iRow=a;
		this.iCol=b;
	}

	public void DispalyAlpha()
	{
		int i=0;
		int j=0;
 
		 for(i=1;i<=iRow;i++)
		 {
		 	for(j=1;j<=iCol;j++)
		 	{
		 		if(i==j)
		 		{
		 			System.out.print("\t"+j);
		 		}
		 		else if(j>i)
		 		{
		 			System.out.print("\t"+j);
		 		}
		 		else
		 		{
		 			System.out.print("\t");
		 		}
		 		 
		 		 
		 	}
			System.out.println();
		 }

	}
}
class Ass16_5
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the Row");
		int iValue1=sobj.nextInt();


		System.out.println("Enter the Col");
		int iValue2=sobj.nextInt();

		NumberX nobj =new NumberX(iValue1,iValue2);

		nobj.DispalyAlpha();


	}
}