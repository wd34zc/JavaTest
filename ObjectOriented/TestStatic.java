/*
֪ʶ�㣺
static 
	1.�������η��������ԣ����������ࡣ
	2.��Ϊ���η�ʹ�����Ա�Ϊ��̬���ԣ������������ࡣ
	  ͨ��������ʵľ�̬������������Ȼ��ͨ������ʣ���ͬ������ʵ���ͬһ��������
	3.��̬��Ա���ܷ��ʷǾ�̬��Ա��
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
		System.out.printf("A�Ķ�����%d��\n",count);
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