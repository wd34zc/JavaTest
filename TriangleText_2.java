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

	public A()//�����޲κ���
	{
	}

	public A (int i,int j, int k)//�����вκ���
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
		A aa = new A(4,5,6);//�Զ������вκ�������������ڻᱨ��
		A bb = new A();//�Զ������޲κ�����Ĭ���������ȷ�������������вκ����ᱨ������ͬʱ���ڻ��Զ����
		bb.set(2,3,4);
		System.out.println(aa.girth());
		System.out.println(bb.girth());
	}
}