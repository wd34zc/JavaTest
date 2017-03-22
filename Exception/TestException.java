/*
 try catch 捕获异常
 类Exception的子类都是异常
 其中有一个子类RunTimeException，该子类异常都可以通过编译，但不能通过运行
 其余子类不能通过编译
*/

class A
{
	int f(int a,int b)
	{
		return (a/b);
	}
}

public class TestException
{
	public static void main(String[] args)
	{
		A aa = new A();
		aa.f(6,5);
		//aa.f(6,0); 能通过编译，但不能运行。

		try //用try来捕获异常
		{
			aa.f(6,0);
		}
		catch (Exception e) //捕获的异常类型 并发送到e中。
		{
			System.out.printf("发现异常，类型如下：\n");
			e.printStackTrace();
		}
	}
}