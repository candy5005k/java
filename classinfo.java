import java.lang.*;
class Demo
{



	
}
class classinfo
{
	public static void main(String Arg[])
	{
		Demo dobj =new Demo();
		
		Class cref = dobj.getClass();	
		System.out.println("Class name of obj is:"+cref.getName());	
		
		String str="Marvellous";
		Class cref1=str.getClass();
		
		System.out.println("Class name of obj is:"+cref1.getName());	
		
	
	}


}
