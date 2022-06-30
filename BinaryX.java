import java.lang.*;
import java.util.*;


class BitwiseX
{
 	public void DisplayBinary(int iNo)
 	{
 		int iDigit =0;

 		while(iNo!=0)
 		{
 			iDigit=iNo%2;
 			System.out.print(iDigit);
 			iNo=iNo/2;

 		}
 			System.out.	println();
 	}

 
}
class BinaryX
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the Number:");
		int iValue1 = sobj.nextInt();


	 	BitwiseX bobj = new BitwiseX();
	 	bobj.DisplayBinary(iValue1);


					
	}
}