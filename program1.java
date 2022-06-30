import java.util.*;

class Base
{
	int iValue1,iValue2;

	public Base()
	{
		iValue1=10;
		iValue2=20;

	}
}
class Derived extends Base
{
	int iNo1,iNo2;

	public Derived()
	{
		iNo1=super(iValue1);
		iNo2=super(iValue2);
	}
}
class program1
{
	public static void main(String[] args)
	{
		Derived dobj=new Derived();
			
	}
}