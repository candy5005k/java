import java.lang.*;
import java.util.*;

class StarX
{
	private int iRow,iCol;

	public StarX(int a,int b)
	{
		this.iRow= a;
		this.iCol= b;			
	}

	public void Display()
	{
		int i = 0;
		int j = 0;
		int k=0;
		for(i=1,k=iRow;i<=iRow;i++,k--)
		{
			for(j=1;j<=iCol;j++)
			{
				if(k==j)
				{
					System.out.print("#\t");	
				}	
				else if(k<j)
				{
					System.out.print("@\t");
				}
				else	
				{
					System.out.print("*\t");
				}			
			}
				System.out.println();
		}
			
	}
		 
}

class Ass18_2
{
	public static void main(String[] args) 
	{
		Scanner	sobj = new Scanner(System.in);

		System.out.println("Enter the Row:");
		int iValue1 =sobj.nextInt();

		System.out.println("Enter the Columns:");
		int iValue2 =sobj.nextInt();

		StarX obj = new StarX(iValue1,iValue2);
		obj.Display();

	}
}