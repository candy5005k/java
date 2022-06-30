import java.lang.*;
import java.io.*;


class Employee implements Cloneable
{
	public int EID;
	public String Ename;
	public int Esal;
	
	public Employee(int id,String Str,int No)
	{
		this.EID=id;
		this.Ename=Str;
		this.Esal=No;
	
	}
	
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	
	}

}


class copyconstruct
{
	public static void main(String Args[]) //throws Exception
	{
		int id=0;
		String Name;
		int iSal=0;
	
		/*InputStreamReader iobj=new InputStreamReader(System.in);
		
		BufferedReader bobj=new BufferedReader(iobj);
		
		try
		{
			System.out.println("Enter EID:\n");
			id=Integer.parseInt(bobj.readLine());
			
			System.out.println("Enter NAME:\n");
			Name=(bobj.readLine());
			
			System.out.println("Enter SAL:\n	");
		 	iSal=Integer.parseInt(bobj.readLine());
		
		}
		
		catch(IOException obj)
		{
			System.out.println("EXCEPTION FOUND:"+obj);
		}*/
		Employee eobj=new Employee(11,"ROHAN",28000);
		
		//Employee eobj=new Employee(id,Name,iSal);
		System.out.println("EID:"+eobj.EID+"\n"+"NAME:"+eobj.Ename+"\n"+"Sal:"+eobj.Esal+"\n");
	
		try
		{
			Employee eobjX=(Employee)eobj.clone();
			System.out.println("EID:"+eobj.EID+"\n"+"NAME:"+eobj.Ename+"\n"+"Sal:"+eobj.Esal+"\n");
		}
		catch(CloneNotSupportedException obj)
		{
			System.out.println("EXCEPTION FOUND:"+obj);
		
		}
		
		eobj.Ename="OMKAR";	System.out.println("EID:"+eobj.EID+"\n"+"NAME:"+eobj.Ename+"\n"+"Sal:"+eobj.Esal+"\n");
		
			
	
	
		
	
	}


}
