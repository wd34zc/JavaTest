/*
知识点：
static 
	1.可以修饰方法和属性，不能修饰类。
	2.作为修饰符使该属性变为静态属性，该属性属于类。
	  通过对象访问的静态方法，本质仍然是通过类访问，不同对象访问的是同一个方法。
	3.静态成员不能访问非静态成员。
*/

class A
{
	int a;
	static int b;
	private static int count = 0;
	
	public A()
	{
		count++;
	}
	public A(int a)
	{
		this.a = a;
		count++;
	}

	public static void getcnt()
	{
		System.out.printf("A的对象有%d个\n",count);
	}
}

public class TestStatic
{
	public static void main(String[] args)
	{
		A aa1 = new A();
		A aa2 = new A(10);
		A aa3 = new A();
		A.getcnt();
	}
}