/*
 try catch �����쳣
 ��Exception�����඼���쳣
 ������һ������RunTimeException���������쳣������ͨ�����룬������ͨ������
 �������಻��ͨ������
*/

class A
{
	int f(int a,int b)
	{
		return (a/b);
	}
}

public class TestException
{
	public static void main(String[] args)
	{
		A aa = new A();
		aa.f(6,5);
		//aa.f(6,0); ��ͨ�����룬���������С�

		try //��try�������쳣
		{
			aa.f(6,0);
		}
		catch (Exception e) //������쳣���� �����͵�e�С�
		{
			System.out.printf("�����쳣���������£�\n");
			e.printStackTrace();
		}
	}
}