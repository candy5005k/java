//Accept the no from user and return revese of that no

import java.io.*;

class RevDigits
{
	public int iNo;
	
	public RevDigits(int iNo)
	{
		this.iNo=iNo;

	}
	
	public int RevNo()
	{
		int iDigit=0;
		int iRev=0;
		
		while(iNo>0)
		{
			
			iDigit=iNo%10;
			
			iRev=iRev*iRev10+iDigit;
		
			iNo=iNo/10;
		
		}
		
		return iRev;
		
	}



}

class program9
{
	public static void main(String Args[]) //throws IOException
	{
		int iValue=0;
		
		InputStreamReader iobj=new InputStreamReader(System.in);
		
		BufferedReader bobj=new BufferedReader(iobj);
		
		try
		{
			System.out.println("Enter The No:");
			iValue=Integer.parseInt(bobj.readLine());
		}
		catch(IOException obj)
		{
			System.out.println("Exception Found:"+obj);
		
		}
		
		RevDigits robj=new RevDigits(iValue);
		
		int iRet=robj.RevNo();
		
		System.out.println("Reverce No is:"+iRet);
	
	}


}
