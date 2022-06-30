//Even Odd Elements in ArrayList

import java.lang.*;
import java.util.*;

class program17
{
	public static void main(String Arg[])
	{
		ArrayList <Integer>obj=new ArrayList <Integer>();
		
		Scanner sobj=new Scanner(System.in);
		
		
		System.out.println("Enter How Many Elements You Want:");
		int iSize=sobj.nextInt();
		
		Scanner sobj1=new Scanner(System.in);
		int iValue=0;
		
		
		int iCnt=0;
		int iNo=0;

		System.out.println("Enter Elements:");
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			obj.add(iValue=sobj1.nextInt());
		}
		System.out.println("Even Elements Are :");
		
		for(iCnt=0;iCnt<obj.size();iCnt++)
		{
			iNo=obj.get(iCnt);
			if(iNo%2==0)
			{
				System.out.println(iNo);
			}

	}
	
	
	int iMax=0;
	
	for(iCnt=0;iCnt<obj.size() /2;iCnt++)
		{
			iNo=obj.get(iCnt);
			
			if(iMax<iNo)
			{
				iMax=iNo;
			}
			
			iNo=obj.get(obj.size() - (iCnt + 1));
			
			if(iMax<iNo)
			{
				iMax=iNo;
			}
			
		}
		System.out.println("Max Element is:"+iMax);	
	

}
}
