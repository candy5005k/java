import java.lang.*;
import java.util.*;
/// 0000 0000 0000 0000 000 0000 0000 1000
///	0 		0  0   0     0    0   0   8
class BitwiseX
{
 	public int OnBit(int iNo)
 	{
 	 
 		int iMask1 =0x00000008;			//1048576;
 		int iResult =0;

 		iResult = iNo | iMask1;
 		return iResult;

 	}
 
}
class CheckForthBitOn
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the Number:");
		int iValue1 = sobj.nextInt();

	 	BitwiseX bobj = new BitwiseX();
	 	int iRet =bobj.OnBit(iValue1);

	 	System.out.	println("Updated Bit is :"+iRet);
	 				
	}
}

 