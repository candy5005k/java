import java.lang.*;

class Arithmatic
{

	public int iNo1;
	public int iNo2;
	
	Arithmatic(int a ,int b)
	{
		iNo1 = a;
		iNo2  = b;
	}
	public T Addition(T iNo1, T iNo2)
	{
		 

		if((iNo1 instanceof Integer) && (iNo2 instanceof Integer))
		{
				return (T)(Integer)((Integer) iNo1+(Integer)iNo2);
		}
		else if((iNo1 instanceof Float) && (iNo2 instanceof Float))
		{
				return (T)(Float)((Float) iNo1+(Float)iNo2);
		}

		else if((iNo1 instanceof Double) && (iNo2 instanceof Double))
		{
				return 	(T)(Double)((Double) iNo1+(Double)iNo2);	
		}
		else
		{
				return null;
		}
		
	 
	}

}
class Specific
{
	public static void main(String[] Arr)
	{

		Arithmatic <Integer>obj = new Arithmatic<Integer>(10,11);

		int iRet = obj.Addition();

		System.out.println("Addition is :"+iRet);
	}
}