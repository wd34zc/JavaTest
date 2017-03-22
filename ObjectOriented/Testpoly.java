/*
面向对象 之 多态
	定义：相同类型的变量调用同一方法时呈现出不同的行为特征。
	基本实现方法：子类可以直接赋给父类。
	编译类型与运行类型的区别。

*/
class A
{
	public void f()
	{
		System.out.println("AAAA");
	}
}
class B extends A
{
	public void f()
	{
		System.out.println("BBBB");
	}

	public void g()
	{
		System.out.println("类B的专属函数");
	}
}

public class Testpoly
{
	public static void main(String[] args)
	{
	//正常情况
		A a1 = new A();
		a1.f();
		B b1 = new B();
		b1.f();
		b1.g();
		System.out.println();
		
	//编译类型与运行类型不同。
		A ab = new B(); //左边是编译类型，右边是运行类型。
		ab.f();
		//编译时，ab属于运行类型，即A类，运行时ab属于B类，
		//因此输出时输出B的f()方法。

//		ab.g(); //编译时A类并没有g()方法。
		System.out.println();		
		
	//多态的类型转换
		A a2 = new A();
		B b2 = new B();

//		b2 = a2; //父类不能直接转换为子类。
		b2 = (B)a2; //需要强制类型转换。
		b2.g();

		a2 = b2; //子类可以直接转换为父类（多态实现基础）
//		a2.g(); //但是不能再调用子类的方法。

	}
}