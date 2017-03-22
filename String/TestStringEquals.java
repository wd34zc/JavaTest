/*
 equals String类下的一个方法 
	把对象与另一个对象比较是否相同，等同于"==";
	某种程度上可以理解为JAVA提供给我们重写的一个方法。
*/

class A
{
	private int i;
	public A(int i)
	{
		this.i = i;
	}
	public boolean equals(A aa) //这并不是重写!参数改变了！
	{
		return this.i == aa.i;
	}
}
class B
{
	private int i;
	public B(int i)
	{
		this.i = i;
	}
	public boolean equals(Object obj) //真正的重写equals
	{
		if(obj == this) //如果两个对象指向同一个堆区
			return true;
		if(obj!=NULL && obj.getClass() == A.class) //判断两个对象是否属于同一个类
		{
			A aa = (A)obj;
			if(this.i == obj.i) //判断内容是否相同
				return true;
		}
		return false;
	}
}
public class TestStringEquals
{
	public static void main(String[] args)
	{
		A a1 = new A(2);
		A a2 = new A(2);
		A a3 = new A(3);
		System.out.println(a1.equals(a2)); //true
		System.out.println(a1.equals(a3)); //false

		B b1 = new B(2);
		B b2 = new B(2);
		System.out.println(b1.equals(a2)); //false
	}
}