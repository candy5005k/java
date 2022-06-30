import java.lang.*;
import java.util.*;

class ArrayX
{
	private int Arr[];

	public ArrayX(int iSize)
	{
		Arr =new int[iSize];
	}

	public void Accept()					//Getter
	{
		int iCnt =0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the elements:");
		for(iCnt =0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
	}
	public void Display()					//Setter
	{
		int iCnt =0;
		System.out.println("Entered elements are:");
		for(iCnt =0;iCnt<Arr.length;iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
	}
	public int MaxNO()
	{
		int iCnt =0;
		int iMax =0;
		for(iCnt =0;iCnt<Arr.length;iCnt++)
		{
			if(iMax<Arr[iCnt])
			{
				iMax = Arr[iCnt];
			}

		}
		return iMax;
	}
}
class Ass11_1
{
	public static void main(String[] args)
	{
		Scanner sobj =new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int iValue = sobj.nextInt();

		ArrayX obj  = new ArrayX(iValue);

		obj.Accept();
		obj.Display();
		int iRet = obj.MaxNO();
		System.out.println("The Max no is :"+iRet);
	}
}