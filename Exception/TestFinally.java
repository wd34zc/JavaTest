/*
 finally
 放在try catch语句后面，并无论有否抛出异常都会执行。
*/

class A
{
	int f()
	{
		return 6/0;
	}
}

public class TestFinally
{
	public static void main(String[] args)
	{
		A aa = new A();
		try
		{
			aa.f();
		}
		catch (Exception e)
		{
			System.out.println("除零错误");
		}
		finally //无论有否抛出异常都会执行
		{
			System.out.println("检测完毕");
		}
	}
}