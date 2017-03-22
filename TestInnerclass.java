/*
 内部类
 外部类对内部类完全可见，内部内对外部类隐藏细节。
 内部类可以用private,protected,default修饰
 内部类的变量查找规则：
	局域变量->内部类成员->外部类成员->编译出错（都找不到该变量）
 用this调用同名变量。
 规则：
	1.内部类可以直接读取外部类函数，
	非静态内部类：
		2.非静态内部类不能出现任何静态的东东，包括成员，方法，初始化块。
		3.外部类静态方法不能访问非静态内部类的内容。
		4.外部类需要创建 非静态内部类实例变量 才能读取内部类的内容。
	静态内部类
		4.静态内部类可以包含静态和非静态成员，但该内部类还是几声于外部类
		5.静态内部类不可以访问任何外部类的实例成员或方法。
		6.外部类可以通过静态内部类类名或其对象调用内部方法。
*/

class A
{
	int i = 5;
	public void show()
	{
		System.out.println("这是外部类的数据：");
		System.out.println("i="+i);
		new B().showInner();
	}
	class B //B是A的内部类，仅对A可见
	{
		int i = 10;
		int j = A.this.i;
		public void showInner()
		{
			System.out.println("这是内部类数据：");
			System.out.println("i="+i+" "+"j="+j);
		}
	}
}

class TestInnerclass
{
	public static void main(String[] args)
	{
		A aa = new A();
		aa.show();
	}
}