/*
��ʼ���� 
  �빹�������ƣ����޲��޷���ֵ��
	��ʼ����
		�ڴ������ʱ��һ�������á�
		���ȼ����ڹ�������
	��̬��ʼ����
		�ڴ�����ʱ�����ã�������ȼ���ߡ�
		����ʱ����׷�ݵ�����ĸ��࣬���ȵ��ø���
		�������ʱ���ٵ��á�
*/
class A
{
	public A()
	{
		System.out.println("A�Ĺ�������"); //���ڳ�ʼ�������
	}
	{
		System.out.println("A�ĳ�ʼ����"); //�������ʱ��һ������
	}
	static
	{
		System.out.println("A�ľ�̬��ʼ����"); //������ʱ����(���ȼ����)
	}
}
class B extends A
{
	public B()
	{
		System.out.println("B�Ĺ�������");
	}
	{
		System.out.println("B�ĳ�ʼ����");
	}
	static
	{
		System.out.println("B�ľ�̬��ʼ����");
	}
}
class C extends B
{
	public C()
	{
		System.out.println("C�Ĺ�������\n");
	}
	{
		System.out.println("C�ĳ�ʼ����");
	}
	static
	{
		System.out.println("C�ľ�̬��ʼ����\n");
	}
}
public class TestInitilize
{
	public static void main(String[] args)
	{
		new C();
		new C();//�ڶ��β��ٵ��þ�̬��ʼ����
	}
}