/*
 abstract 抽象类 抽象方法
 
 语法：修饰类：意义：代表该类只是抽象的东西，没有具体的对象。
			   1.可以申请压栈，但不能申请堆的内存，即可以定义，不能初始化
			   2.不一定包含 抽象方法 
			   3.可以被普通类继承
	   修饰方法：意义：该方法只给出代码头，没有具体实现的代码
				 1.该方法所处的类必须是抽象类
				 2.没有方法体（具体代码）的必须为抽象方法
				 3.可以被继承的普通类重写
*/

//class A //错误，存在抽象方法
abstract class A
{
	int i;

	abstract void f();
	{
	}
}

class B extends A//证明 修饰类第3点
{
	public void f()//证明 修饰方法 第3点
	{
		System.out.println("BBBB");
	}
}

public class TestAbstract
{
	public static void main(String[] args)
	{
		A aa;
		//aa = new A(); //错误//证明 修饰类的第一点
		
		B bb; 
		bb = new B();
		bb.f();
	}
}