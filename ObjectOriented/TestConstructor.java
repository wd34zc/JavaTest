/*
 构造器 constructor
	1.在new出一个对象时自动调用的函数。
	2.构造器可以有多个，以形参的不同区分。
	3.不创造构造器时，系统默认提供无参构造器，若创造了构造器，则不再提供。
	4.通过this调用一个 参数是被现有构造器包含 的构造器。
*/

class A
{
	private int i;
	private int j;
	public A()
	{
		System.out.println("调用了无参构造器");
	}
	public A(int i)
	{
		this.i=i;
		System.out.println("把"+i+"作为参数传给了属性i");
	}
	public A(int i,int j)
	{
		this(i); //先调用了上一个构造器
		this.j=j;
		System.out.printf("把%d作为参数传给了属性j\n",j);
	}

}

public class TestConstructor
{
	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new A(1);
		A a3 = new A(2,3);
	}
}