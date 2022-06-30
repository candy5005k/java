import java.lang.*;
import java.util.*;

class BitwiseX
{
 	public boolean CheckBit(int iNo)
 	{
 	 
 		int iMask1 = 1048576;
 		int iResult =0;

 		iResult = iNo & iMask1;

 		if(iResult ==0 )
 		{
 			return false;
 		}
 		else
 		{
 			return true;
 		}

 	}
 
}
class Check21StBit
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the Number:");
		int iValue1 = sobj.nextInt();

	 	BitwiseX bobj = new BitwiseX();
	 	boolean bRet =bobj.CheckBit(iValue1);

	 	if(bRet==true)
	 	{
	 		System.out.	println("Bit is on");
	 	}
	 	else
	 	{
	 		System.out.	println("Bit is off");

	 	}
						
	}
}

/*
 		int iDigit = 0;
 		int Mask1 = 4;
 		int iMask =0;
 		iDigit = iNo%2;

 		iMask = Mask1 %2;

 		if(iDigit & iMask)
 		{
 			return true;
 		}
 		else
 		{
 			return false;
 		}


*/