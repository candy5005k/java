import java.lang.*;
import java.util.*;
import java.io.*;

class PrimeNo
{
	public int iNo;
	
	public PrimeNo(int iNo)
	{
		this.iNo=iNo;
	
	}
	
	public boolean CheckPrime()
	{
		int iCnt=0;
		boolean flag=true;
		
		for(iCnt=2;iCnt<=iNo/2;iCnt++)
		{
			if((iNo%iCnt)==0)
			{
				flag=false;
			
			
			}
		
		
		}
		
		return flag;
	
	}

}

class program6
{
	public static void main(String Args[]) //throws IOException
	{
		int iValue=0;
		boolean bRet=false;
		
		//InputStreamReader iobj=new InputStreamReader(System.in);
		
		BufferedReader bobj=new BufferedReader(new InputStreamReader(System.in));
		
			try
			{
				System.out.println("Enter the No:");
				iValue=Integer.parseInt(bobj.readLine());
			}
			
			
			catch(IOException obj)
			{
				System.out.println("Exeception found."+obj);
			
			}
			catch(NumberFormatException obj1)
			{
				System.out.println("Exeception found."+obj1);
			
			}
			
			PrimeNo pobj=new PrimeNo(iValue);
			
			bRet=pobj.CheckPrime();
			
			if(bRet==true)
			{
				System.out.println("No is Prime");
			
			}
			else
			{
				System.out.println("No is Not Prime");
			
			}
			
			
			
			
	}


}
