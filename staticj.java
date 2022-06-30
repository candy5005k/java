import java.lang.*;

class Demo
{
	public int iNo1,iNo2;
	public static int iNo3;
	
	static
	{
		System.out.println("inside static block");
		iNo3=100;
	
	}
	
	public Demo()
	{
		this.iNo1=11;
		this.iNo2=21;
		System.out.println("inside default constructor");
	}
	
	public void fun()
	{
		System.out.println("inside instance method fun");
		System.out.println(this.iNo1);
		System.out.println(this.iNo2);
		System.out.println(this.iNo3);
		
	}
	
	public static  void gun()
	{
		System.out.println("inside class method gun");
		//System.out.println(this.iNo1);	//NA
		//System.out.println(this.iNo2);	//NA
		System.out.println(iNo3);
		
	}

}



class staticj
{
	public static void main(String args[])
	{
		
		Demo.gun();
		
		System.out.println("inside main()");
		
		Demo obj=new Demo();
		
		obj.fun();
		
		System.out.println(obj.iNo1);
		System.out.println(obj.iNo2);
		System.out.println(obj.iNo3);
		
	
	
	}


}
