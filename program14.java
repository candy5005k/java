//Accept N no from user and print that NO

import java.util.*;

class Demo
{
	public int iSize=0;
	public int Arr[];
	
	public Demo(int iSize)
	{
		this.iSize=iSize;
	
	}
	
	public void Display()
	{
		int Arr[] = new int[iSize];
		int iCnt=0;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Elements:");
		
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
		
		System.out.println("Elements in Array:");
		
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			
			System.out.println(Arr[iCnt]);
		
		}
	
	}


}


class program14
{
	public  static void main(String Args[])
	{
		int iValue=0;
		
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the Size of Array:");
		iValue=sobj.nextInt();
		
		Demo dobj=new Demo(iValue);
		
		dobj.Display();
		
	
	}


}

