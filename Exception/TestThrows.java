/*
 throws Å×Òì³£ 
*/

class A
{
	void f(int a, int b)
	{
		if (b==0)
			g();
		else
			System.out.println(1.0*a/b);
	}
	
	void g() throws ArithmeticException
	{
		throw new ArithmeticException();
	}
}

public class TestThrows
{
	public static void main(String[] args)
	{
		A aa = new A();
		aa.f(6,0);
		System.out.println("¹þ¹þ");
	}
}