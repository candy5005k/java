//Accept the No from user and display Digits in it
 
import java.util.*;
import java.io.*;

class Display
{
	public int iNo;
	
	public Display(int iNo)
	{
		this.iNo=iNo;
	
	}
	
	public void DisplayDigits()
	{
		int iDigit=0;

		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			System.out.println(iDigit);
			iNo=iNo/10;
			
		}
	}
	
}


class program7
{
	public static void main(String Args[]) //throws IOException
	{
		int iValue=0;
		
		InputStreamReader iobj=new InputStreamReader(System.in);
		BufferedReader bobj=new BufferedReader(iobj);
	
		try
		{
			System.out.println("Enter No:");
			iValue=Integer.parseInt(bobj.readLine());
		}
		catch(IOException obj)
		{
		
			System.out.println("Exception Found in main"+obj);
		
		}
		
		Display dobj=new Display(iValue);
		
		dobj.DisplayDigits();
		
		
	}


}
