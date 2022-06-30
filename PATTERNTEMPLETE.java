 import java.lang.*;
 import java.util.*;


class Number
{
		private int iRow ,iCol;

		public Number(int a,int b)
		{
				iRow = a;
				iCol = b;
		}

		public void Display()
		{
				
			int i= 0;
			int j= 0;
 

			for(i=iRow;i>=1;i--)
			{
				for(j=1;j<=iCol;j++)
				{
					if(j<=i)
					{
						System.out.print("*\t");	
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
 class PATTERNTEMPLETE
 {
 	public static void main(String[] args) 
 	{ 
 	
 		Scanner sobj = new Scanner(System.in);
 		
 		System.out.println("Enter The Row:");
 		int iValue1 = sobj.nextInt();
 		
 		System.out.println("Enter The Columns :");
 		int iValue2 = sobj.nextInt();

 		Number nobj = new Number(iValue1,iValue2);
 		
 		nobj.Display();

 		 
 

 	}
 }