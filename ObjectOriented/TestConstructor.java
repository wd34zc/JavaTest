/*
 ������ constructor
	1.��new��һ������ʱ�Զ����õĺ�����
	2.�����������ж�������βεĲ�ͬ���֡�
	3.�����칹����ʱ��ϵͳĬ���ṩ�޲ι��������������˹������������ṩ��
	4.ͨ��this����һ�� �����Ǳ����й��������� �Ĺ�������
*/

class A
{
	private int i;
	private int j;
	public A()
	{
		System.out.println("�������޲ι�����");
	}
	public A(int i)
	{
		this.i=i;
		System.out.println("��"+i+"��Ϊ��������������i");
	}
	public A(int i,int j)
	{
		this(i); //�ȵ�������һ��������
		this.j=j;
		System.out.printf("��%d��Ϊ��������������j\n",j);
	}

}

public class TestConstructor
{
	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new A(1);
		A a3 = new A(2,3);
	}
}