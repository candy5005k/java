//Accept the No from user and check weather the No is Armstrong or Not
import java.lang.*;
import java.io.*;

class Armstrong
{
	public int iNo;	
	
	public Armstrong(int iNo)
	{
		this.iNo=iNo;
	}

	boolean CheckArmstrong()
	{
		int iDigit=0,iDigitCnt=0,iCnt=0;
		int iTemp=0,iSum=0;
		
		iTemp=iNo;
		int iMult=1;
		
		while(iNo!=0)
		{
			iDigitCnt++;
			
			iNo=iNo/10;
		
		}
		
		iNo=iTemp;
		
		while(iNo!=0)
		{
			iMult=1;
			
			iDigit=iNo%10;
				
			for(iCnt=1;iCnt<=iDigitCnt;iCnt++)
			{
				iMult=iMult*iDigit;
			
			}
			
			iSum=iSum+iMult;
			
			iNo=iNo/10;
			
		}
		
		if(iSum==iTemp)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	
	}
}


class program11
{
	public static void main(String Args[])
	{
		int iValue=0;
		boolean bRet=false;
		
		InputStreamReader iobj=new InputStreamReader(System.in);
		BufferedReader bobj=new BufferedReader(iobj);
		
		try
		{
			System.out.println("Enter the No:");
			iValue=Integer.parseInt(bobj.readLine());
		}
		catch(IOException obj)
		{
			System.out.println("Exception found:"+obj);
		
		}
		
		Armstrong aobj=new Armstrong(iValue);
		
		bRet=aobj.CheckArmstrong();
		
		if(bRet==true)
		{
			System.out.println("No is Armstrong");
		}
		else
		{
			System.out.println("No is Not Armstrong");
		
		}
		
	}


}
