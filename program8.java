//Accepts the No from user and return the sammetion of its digits

import java.util.*;
import java.io.*;

class SumDigits
{
	public int iNo;
	
	public SumDigits(int iNo)
	{
		this.iNo=iNo;
	
	}
	
	public int SumOfDigits()
	{
		int iDigit=0;
		int iSum=0;
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			
			iSum=iSum+iDigit;
			
			iNo=iNo/10;
			
		}
	
		return iSum;
	
	}

}

class program8
{
	public static void main(String Args[])
	{
		int iValue=0;
		int iRet=0;
		
		InputStreamReader iobj=new InputStreamReader(System.in);
		
		BufferedReader bobj=new BufferedReader(iobj);
		
		try
		{
			System.out.println("Enter the No:");
			iValue=Integer.parseInt(bobj.readLine());
		
		}
		catch(IOException obj)
		{
			System.out.println("Exception Found:"+obj);
			
		}
		
		SumDigits sobj=new SumDigits(iValue);
		
		iRet=sobj.SumOfDigits();
		
		System.out.println("Sum of Digits is:"+iRet);
	
	}




}
