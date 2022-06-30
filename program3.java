//Accepts the no from user and cheak weathr the No is perfect or not

import java.util.*;

class PerfectNo
{
	public int iNo;
	
	PerfectNo(int iNo)
	{
		this.iNo=iNo;
	}
	
	boolean CheckPerfect()
	{
		int iCnt=0;
		int iSum=0;
		
		for(iCnt=1;(iCnt<=iNo/2);iCnt++)
		{
			if((iNo%iCnt)==0)
			{
				iSum=iSum+iCnt;
				
			}
		
		}
		
		if(iNo==iSum)
		{
			return true;
		
		}
		else
		{
			return false;
		
		}
	
	}

}

class program3
{
	public static void main(String Args[])
	{
		int iValue=0;
		boolean bRet=false;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the No");
		iValue=sobj.nextInt();
		
		PerfectNo pobj=new PerfectNo(iValue);
		
		bRet=pobj.CheckPerfect();
		
		if(bRet==true)
		{
			System.out.println("No is Perfect");
		
		}
		else
		{
			System.out.println("No is Not Perfect");
		
		}
		
	
	}


}
