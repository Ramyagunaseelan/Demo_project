package Method_Example;

public class Method_Example1 
{
	public void m1()  //instance
	{
		System.out.println("M1 instance method");
	}
	
	public static void m2()
	{
		System.out.println("M2 static Method");
	}

	public void m3()  //instance
	{
		System.out.println("M3 instance method");
	}
	
	public static void m4()
	{
		System.out.println("M4 static Method");
	}
	public static void main(String[] args) 
	{
		
		m2();
		
		Method_Example1 mobj=new Method_Example1();
		
		mobj.m1();

		m3();
		
		Method_Example1 mobj1=new Method_Example1();
		
		mobj1.m4();
		
	}

}
