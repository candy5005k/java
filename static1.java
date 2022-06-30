import java.lang.*;



class Demo
{
	static public int iNo1;
	static public int iNo2;
	public static int iNo3;
	
	/*Demo(int a,int b)
	{
		iNo1=a;
		iNo2=b;	
	
	}
	*/
	
	
	public static int fun()
	{
		int iAns=0;
		
		iAns=iNo1+iNo2;
		
		return iAns;
	
	}
	
	static 
	{
		System.out.println("inside static block");
		iNo3=100;
		iNo1=11;
		iNo2=21;

	}

}



class static1
{
	public static void main(String Args[])
	{
		
		System.out.println(Demo.iNo3);
		
		System.out.println("inside main");
		
		Demo dobj = new Demo();
		
		int iRet=0;
		
		iRet=Demo.fun();
		
		System.out.println(iRet);	
			
		
	
	}

}
