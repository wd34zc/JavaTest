/*
 *this 调用当前类中的属性或方法
 用途：
	当原来调用属性的途径被小范围的同名局域变量覆盖时，可以通过this显性调用原来的属性。
 用法：
	1.把形参赋给同名属性，用this来调用属性
	2.用this可以强调是当前类的方法，与super相对应.
	3.重载构造器时，可以用this调用 参数被当前构造器包含 的构造器
 */
class A
{
	private int i;
	public A (int i)
	{
		this.i = i; //用this修饰的是当前属性i，对应的是形参i
	}
	public void show(int i)
	{
		System.out.println(i); //输出形参i;
		System.out.println(this.i);//输出属性i;
		//小范围形参能够覆盖大范围的类属型
	}
}

public class TestThis
{
	public static void main(String[] args)
	{
		A aa1 = new A(10);
		aa1.show(2);
	}
}