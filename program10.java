//Accept the No from user and check waether the no is Pallindrome or not

import java.util.*;

class Pallindrome
{
	public int iNo=0;
	
	public Pallindrome(int iNo)
	{
		this.iNo=iNo;
	
	}
	public boolean CheckPallindrome()
	{
		int iDigit=0;
		int iRev=0;
		int iTemp=iNo;
	
		
		while(iNo!=0)
		{	
			iDigit=iNo%10;
			iRev=iRev*10+iDigit;
			iNo=iNo/10;
			
		}
		if(iTemp==iRev)
		{
			return true;
			
		}
		else
		{
			return false;
		
		}
		
	}

}


class program10
{
	public static void main(String Args[])
	{
		int iValue=0;
		boolean bRet=false;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The No:");
		iValue=sc.nextInt();
		
		Pallindrome pobj=new Pallindrome(iValue);
		bRet=pobj.CheckPallindrome();
			
		if(bRet==true)
		{
			System.out.println("No is Pallindrome");
			
		
		}
		else
		{
			System.out.println("No is Not Pallindrome");
		
		}
		
	
	}


}
