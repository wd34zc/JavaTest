/*
 自定义异常
*/

class A
{
	void f(int a, int b) throws B
	{
		if (b == 0) 
			throw new B("除数不能为零");
		else
			System.out.println(1.0*a/b);
	}
	
}

class B extends Exception //自定义的异常 需要继承异常类
{
	public B(String name)
	{
		super(name);
	}
}

public class __TestThrows_2
{
	public static void main(String[] args)
	{
		A aa = new A();
		aa.f(6,0);
		System.out.println("哈哈");
	}
}