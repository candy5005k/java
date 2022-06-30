//Accept N no from user and  Display Even elements in it
import java.io.*;
import java.util.*;

class Display
{
	public int Arr[];
	public int iNo;
	
	public Display(int iSize)
	{
		Arr=new int[iSize];
		this.iNo=iNo;
	}
	
	
	public void acceptElements()
	{
		int iCnt=0;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Elements:");
		for(iCnt=0;iCnt<this.Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
	
	}
	
	public void displayEven()
	{
		int iCnt=0;
		
		System.out.println("Even Elements in Array:");
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]%2==0)		
			{	
				System.out.println(Arr[iCnt]);	
			}
		}
			
		
	}

}



class program15
{
	public static void main(String Arg[])
	{
		int iValue1=0;
		//int iValue2=0;
		
		InputStreamReader iobj=new InputStreamReader(System.in);
		BufferedReader bobj=new BufferedReader(iobj);
		
		try
		{
			System.out.println("Enter the Size of Array:");
			iValue1=Integer.parseInt(bobj.readLine());
			
			//System.out.println("Enter No:");
			//iValue2=Integer.parseInt(bobj.readLine());
		
		}		
		catch(IOException obj)
		{
			System.out.println("EXCEPTION OCCURED"+obj);
		
		}
		
		Display dobj=new Display(iValue1);
		
		dobj.acceptElements();
		dobj.displayEven();
		
	
	}

}


