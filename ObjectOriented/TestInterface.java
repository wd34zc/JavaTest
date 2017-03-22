/*
 接口interface （跟类同一个级别）
 定义：
	接口近似特殊的抽象类。是一种规范和实现分离的哲学思想。
 方法：
	抽象方法（没有修饰符的默认情况）
	类方法（默认为public）
	默认方法（要加default修饰符）
 成员对象：
	静态常量。
 语法：
	1.接口可以继承接口 (extends）
	2.类可以同时实现多个接口 （implements)
	3.接口的属性必须初始化且接为常量不能改变。
	4.接口的属性在实现类中不能改变
	5.接口没有构造器和初始化块
*/

interface A
{ 
	int a = 5;//public static final int a = 5； 常量
	void f();//不能有方法体
	static void stshow()
	{
		System.out.println("接口的类方法");
	}
	default void deshow()
	{
		System.out.println("接口的默认方法");
	}
}
interface B extends A //接口继承接口
{
}
abstract class C implements A,B //接口A中有抽象方法，因此C要是抽象类
{
}
class D extends C implements A,B
{
	//i = 4; //接口的属性在实现类中不能改变	
	//接口中的方法默认为public,因此继承类中方法必须用public
	public void f() //实现接口的抽象方法。
	{ 
		System.out.println("类D对接口的应用");
	}
}

public class TestInterface
{
	public static void main(String[] args)
	{
		A aa; //允许
		//aa = new A(); //接口近似抽象类，不能实例化
		A.stshow();

		D dd = new D();
		dd.deshow();
		dd.f();
	}
}