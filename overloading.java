import java.lang.*;

class Demo
{
	public int Add(int i,int j)
	{
	
		return i+j;
	}
	public int Add(int i,int j,int k)
	{
	
		return i+j+k;
	}
	public int Add(int i,int j,int x,int y)
	{
	
		return i+j+x+y;
	}


}


class overloading
{
	public static void main(String Arhgs[])
	{
		Demo obj=new Demo();
		
		int iRet=0;
		
		iRet=obj.Add(10,11);
		System.out.println(iRet);
		
		iRet=obj.Add(10,11,21);
		System.out.println(iRet);
		
		iRet=obj.Add(10,11,51,100);
		System.out.println(iRet);

		
	
	}


}
