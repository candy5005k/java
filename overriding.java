import java.lang.*;

class Base
{
	public void fun()
	{
		
		System.out.println("inside Base fun");
	
	}
	public void gun()
	{
		
		System.out.println("inside Base gun");
	
	}
	public void sun()
	{
		
		System.out.println("inside Base sun");
	
	}


}

class Derived extends Base
{
	public void fun()
	{
	
		System.out.println("inside Derived fun");
	
	}
	public void gun()
	{
	
		System.out.println("inside Derived gun");
	
	}
	public void run()
	{
	
		System.out.println("inside Derived run");
	
	}


}





class overriding
{
	public static void main(String Args[])
	{
		Base obj=new Derived();
		
		obj.fun();
		obj.gun();
		obj.sun();
	
	
	}


}
