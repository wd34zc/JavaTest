class A
{
	int a;
	int b;
	int c;

	void set(int i,int j,int k)
	{
		a=i;
		b=j;
		c=k;
	}

	public A()//构造无参函数
	{
	}

	public A (int i,int j, int k)//构造有参函数
	{
		a=i;
		b=j;
		c=k;
	}

	int girth()
	{
		return (a+b+c)*2;
	}
}

class TriangleText_2
{
	public static void main(String[] args)
	{
		A aa = new A(4,5,6);//自动访问有参函数，如果不存在会报错
		A bb = new A();//自动反问无参函数，默认情况下正确，若单独存在有参函数会报错，两个同时存在会自动辨别
		bb.set(2,3,4);
		System.out.println(aa.girth());
		System.out.println(bb.girth());
	}
}