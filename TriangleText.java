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

	int girth()
	{
		return (a+b+c)*2;
	}
}

class TriangleText
{
	public static void main(String[] args)
	{
		A aa = new A();
		int d;
		aa.set(4,5,6);
		d=aa.girth();
		System.out.println(aa.girth());
	}
}