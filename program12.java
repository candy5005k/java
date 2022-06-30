//Accept two no from user and return the power of a to b
//input: 5  3
//output:125	(5*5*5)

import java.util.*;

class Power
{
	public int iNo1,iNo2;
	
	public Power(int iNo1,int iNo2)
	{
		this.iNo1=iNo1;
		this.iNo2=iNo2;
	
	} 
	
	int power()
	{
		int iCnt=0;
		int iMult=1;
		
		for(iCnt=1;iCnt<=iNo2;iCnt++)
		{
			iMult=iMult*iNo1;
		
		}
		
		return iMult;
	}
	

}




class program12
{
	public static void main(String args[])
	{
		int iValue1=0,iValue2=0;	
		long iRet=0;
		
		Scanner sobj =new Scanner(System.in);
		
		
		System.out.println("Enter Base No:");
		iValue1=sobj.nextInt();
		
		System.out.println("Enter Power No:");
		iValue2=sobj.nextInt();
	
		Power pobj=new Power(iValue1,iValue2);
		
		iRet=pobj.power();
		
		System.out.println(iRet);
	
	}



}
