import java.lang.*;

interface Demo
{

	public void fun();
	public void gun();

}
class Hello implements Demo
{
	public void fun()
	{
	
		System.out.println("inside Hello fun");
	
	}
	
	public void gun()
	{
	
		System.out.println("inside Hello gun");
	
	}
}

class interface1
{
	public static void main(String Args[])
	{
		Hello hobj=new Hello();
		
		hobj.fun();
		
		hobj.gun();	
	
	
	}


}
