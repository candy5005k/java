import java.lang.*;
import java.net.*;
import java.io.*;

class server
{
	public static void main(String Arg[])throws Exception
	{
		System.out.println("Server Application is Running...");
		String s1,s2;
		
		ServerSocket ss=new ServerSocket(1100);
		Socket s=ss.accept();
		
		System.out.println("Connection Successfull!!!");
	
	BufferedReader brK=new BufferedReader(new InputStreamReader(System.in));
	
	BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	
	PrintStream ps=new PrintStream(s.getOutputStream());
	
	while((s1=br.readLine())!=null)
	{
		System.out.println("Rohan Says:"+s1);
		System.out.println("Enter Msg for Rohan:");
		s2=brK.readLine();
		ps.println(s2);
	
	}	
	
	s.close();
    ss.close();
    br.close();
    brK.close();
    ps.close();
	
	}

}
