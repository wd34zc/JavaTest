/*
面向对象 之 继承extends
	1.子类不能继承父类构造器
	2.重写（Override）重写父类方法.
		重新定义与父类相同名字的方法，以及返回值和参数都相同。
		当父类对应方法是private权限时，即使满足上面条件也不能称为重写。
	3.super 
		限定对象调用它从父类继承的到的变量和方法。
		当被调用方法为static时，不能用super函数，因为该方法不属于对象。
		详情参考TestSuper文件
	4.修饰符（权限问题）
		参考"修饰符权限"文件。
*/

class Human
{
	public String name = "张三";
	public int age = 18;

	void f()
	{
	}
}

class Student extends Human
{
	public double score = 6.66;

	void f()
	{
	}
}

public class TestExtends
{
	public static void main(String[] args)
	{
		Student aa = new Student();
		System.out.printf("%s %d %.2f",aa.name,aa.age,aa.score);
	}
}