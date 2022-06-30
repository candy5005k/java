import java.lang.*;

interface Circle
{
	float PI=3.14f;			//public static final PI
	
	float CalArea(float Radius);
	float CalCircumfarance(float Radius);

}

class Area implements Circle
{
	public float CalArea(float Radius)
	{
		System.out.println("inside Area CalArea");
		return  ( PI * Radius * Radius );
	
	}
	
	public float CalCircumfarance(float Radius)
	{
	
		return(2 * PI * Radius);
	
	}

}

class interface2
{
	public static void main(String Args[])
	{
		System.out.println("Vlaue of PI:"+Circle.PI);
		
		//Circle.PI=6.14;		//NA
		Area obj=new Area();
		
		float fRet=0.0f;
		
		fRet=obj.CalArea(10.5f);
		System.out.println("Area is:"+fRet);
		

		fRet=obj.CalCircumfarance(10.5f);
		System.out.println("Circumfaranceis:"+fRet);
			
	}

}
