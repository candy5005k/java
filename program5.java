//Accept no from user and check weather the No is prime or not
//regular logic

import java.util.*;

class PrimeNo
{
	public int iNo;
	
	public boolean CheckPrime(int iNo)
	{
		int iCnt=0;
		int iFact=0; 
		
		
		for(iCnt=2;iCnt<=iNo/2;iCnt++)
		{
			if((iNo%iCnt)==0)
			{
				iFact++;
			
			}
		
		
		}
		
	
		if(iFact==0)
		{
			return true;
		
		}
		else
		{
			return false;
		
		}
	
	}
}


class program5
{
	public static void main(String Args[])
	{
		int iValue=0;
		boolean bRet=false;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the No:");
		iValue=sobj.nextInt();
		
		PrimeNo pobj=new PrimeNo();
		
		bRet=pobj.CheckPrime(iValue);
		
		if(bRet==true)
		{
			System.out.println(iValue+"is Prime Number");
		
		}
		else
		{
			System.out.println(iValue+"is Not a Prime Number");
		
		}
	
	
	}


}

