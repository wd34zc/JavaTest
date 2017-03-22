/*
	final的用法：
	1.修饰类，代表该类不能再被继承。
	2.修饰方法，表示该方法可以继承继承后不能重写。
	3.修饰基本类型变量
		成员变量：
			类变量
				赋值的两种方式：初始化，静态初始化块
			实例变量
				赋值的三种方式：初始化，初始化块，构造器
		局域变量：
			定义时可以初始化，也可以不初始化，反正只能赋一次值。
	4.修饰引用类型变量
		不可以修改栈区的值，故不可已改变指向，但完全可以改变其引用的值。
	5.可执行“宏替换”的final变量
		当final变量执行初始化时，可以视为常量，即指向常量区。
*/

final class B //B不能再被继承
{
	private final int i=3;//初始化赋值
	private final int j;//构造器赋值
	private int k;
	public B()
	{
		j=5;
	}
	final void Setter(int k) //修饰方法
	{
		this.k = k;
	}
	final private void show()//该方法只对B可见，因此子类完全可以定义一个完全一样只有方法体不同的show方法，但这并不是重写！
	{
		System.out.println("k="+k); 
	}
}

public class TestFinal
{
	public static void main(String[] args)
	{
		B b1 = new B();
		B b2 = new B(); //修饰引用变量
		final B b3;

		b3 = b1;
		//b3 = b2; //b3已经分配了变量b2，不能再改变
		b3.Setter(100); //可以修改实例成员的值
	}
}