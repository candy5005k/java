//problems on factors like find factor,perfect no,prime No

import java.util.*;

class Base
{
	public int iNo;
	
	public Base(int iNo)
	{
		this.iNo=iNo;
	}
	
	public void Factors()
	{
		int iCnt=0;
		
		for(iCnt=1;iCnt<=iNo/2;iCnt++)
		{
			if((iNo%iCnt)==0)
			{
				System.out.println(iCnt);
			}
		
		}
	
	}

}


class Derived extends Base
{
	public int iNo;
	
	public Derived(int iNo)
	{
		super(iValue);
		
		this.iNo=iNo;
	}
	public boolean Prime()
	{
		int iCnt=0;
		int iSum=0;
		
		for(iCnt=1;iCnt<(super.iNo);iCnt++)
		{
			if(((super.iNo)%iCnt)==0)
			{
				iSum=iSum+iCnt;
			}
		
		}
		
		if((super.iNo)==iSum)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	

}


class program13
{

	public static void main(String arg[])
	{
		int iValue=0;
		boolean bRet=false;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the No:");
		iValue=sobj.nextInt();
		 
		Derived dobj=new Derived(iValue);
		 
		 dobj.Factors();
		 bRet=dobj.Prime();
		 
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
