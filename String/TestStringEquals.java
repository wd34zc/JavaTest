/*
 equals String���µ�һ������ 
	�Ѷ�������һ������Ƚ��Ƿ���ͬ����ͬ��"==";
	ĳ�̶ֳ��Ͽ������ΪJAVA�ṩ��������д��һ��������
*/

class A
{
	private int i;
	public A(int i)
	{
		this.i = i;
	}
	public boolean equals(A aa) //�Ⲣ������д!�����ı��ˣ�
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
	public boolean equals(Object obj) //��������дequals
	{
		if(obj == this) //�����������ָ��ͬһ������
			return true;
		if(obj!=NULL && obj.getClass() == A.class) //�ж����������Ƿ�����ͬһ����
		{
			A aa = (A)obj;
			if(this.i == obj.i) //�ж������Ƿ���ͬ
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