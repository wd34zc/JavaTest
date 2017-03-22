/*
 protected 和 public 的区别。
*/

package MAIN;
import bag_4.*;

class B extends A
{
	void a()
	{
//		g();//父类中修饰符为protected。protected只能在继承子类内部访问
	}
	public void b()
	{
		f(); //父类中修饰符为public
		g(); //父类中修饰符为protected。protected只能在继承子类内部访问
//		h(); //父类中修饰符位default，不能在包外继承。
		System.out.println("BBBB");
	}
}

class Main
{
	public static void main(String[] args)
	{
		B bb = new B();
		bb.b();

		bb.f();
//		bb.g(); //错误，protected不能在外部通过继承子类访问。
	}
}