/*
 finally
 ����try catch�����棬�������з��׳��쳣����ִ�С�
*/

class A
{
	int f()
	{
		return 6/0;
	}
}

public class TestFinally
{
	public static void main(String[] args)
	{
		A aa = new A();
		try
		{
			aa.f();
		}
		catch (Exception e)
		{
			System.out.println("�������");
		}
		finally //�����з��׳��쳣����ִ��
		{
			System.out.println("������");
		}
	}
}