/*
初始化块 
  与构造器类似，但无参无返回值。
	初始化块
		在创造对象时第一个被调用。
		优先级高于构造器。
	静态初始化块
		在创造类时被调用，因此优先级最高。
		调用时，会追溯到最初的父类，并先调用父类
		创造对象时不再调用。
*/
class A
{
	public A()
	{
		System.out.println("A的构造器。"); //后于初始化块调用
	}
	{
		System.out.println("A的初始化块"); //创造对象时第一个调用
	}
	static
	{
		System.out.println("A的静态初始化块"); //创造类时调用(优先级最高)
	}
}
class B extends A
{
	public B()
	{
		System.out.println("B的构造器。");
	}
	{
		System.out.println("B的初始化块");
	}
	static
	{
		System.out.println("B的静态初始化块");
	}
}
class C extends B
{
	public C()
	{
		System.out.println("C的构造器。\n");
	}
	{
		System.out.println("C的初始化块");
	}
	static
	{
		System.out.println("C的静态初始化块\n");
	}
}
public class TestInitilize
{
	public static void main(String[] args)
	{
		new C();
		new C();//第二次不再调用静态初始化块
	}
}