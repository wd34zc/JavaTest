/*
 �Զ����쳣
*/

class A
{
	void f(int a, int b) throws B
	{
		if (b == 0) 
			throw new B("��������Ϊ��");
		else
			System.out.println(1.0*a/b);
	}
	
}

class B extends Exception //�Զ�����쳣 ��Ҫ�̳��쳣��
{
	public B(String name)
	{
		super(name);
	}
}

public class __TestThrows_2
{
	public static void main(String[] args)
	{
		A aa = new A();
		aa.f(6,0);
		System.out.println("����");
	}
}