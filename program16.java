//Accept N no from user and Display the Even Factoras and odd factors

import java.util.*;
import java.lang.*;

class Factors
{
	int Arr[];

	public Factors(int iSize)
	{
		Arr=new int[iSize];
	
	}
	
	public void Accept()
	{
		int iCnt=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Elements:");
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		
		}
		
	
	}
	
	public void EvenFact(int Even)
	{
		int iCnt=0;
		
		System.out.println("Factors of Even Elements"+Even+":");
		
		for(iCnt=1;iCnt<=Even/2;iCnt++)
		{
			if(Even%iCnt==0)
			{
				System.out.print(iCnt+"\t");
			}
		}
	
	
	}
	
	
	public void OddFact(int Odd)
	{
		int iCnt=0;
		System.out.println("Factors of Odd Elements"+Odd+":");
		for(iCnt=1;iCnt<=Odd/2;iCnt++)
		{
			if(Odd%iCnt==0)
			{
				System.out.print(iCnt+"\t");
			}
		}
	
	}
	
	
	public void displayEven()
	{
		int iCnt=0;
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if((Arr[iCnt]%2)==0)
			{
				EvenFact(Arr[iCnt]);
				System.out.println("\n");
				
			}
			else
			{
				OddFact(Arr[iCnt]);
				System.out.println("\n");
			}
		
		}
	
	}



}

class program16
{
	public static void main(String Arg[])
	
	{	int iValue=0;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the Size of Array:");
		iValue=sobj.nextInt();
		
		Factors fobj=new Factors(iValue);
		
		fobj.Accept();
		fobj.displayEven();
		
	}

}
