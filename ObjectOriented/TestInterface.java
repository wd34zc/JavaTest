/*
 �ӿ�interface ������ͬһ������
 ���壺
	�ӿڽ�������ĳ����ࡣ��һ�ֹ淶��ʵ�ַ������ѧ˼�롣
 ������
	���󷽷���û�����η���Ĭ�������
	�෽����Ĭ��Ϊpublic��
	Ĭ�Ϸ�����Ҫ��default���η���
 ��Ա����
	��̬������
 �﷨��
	1.�ӿڿ��Լ̳нӿ� (extends��
	2.�����ͬʱʵ�ֶ���ӿ� ��implements)
	3.�ӿڵ����Ա����ʼ���ҽ�Ϊ�������ܸı䡣
	4.�ӿڵ�������ʵ�����в��ܸı�
	5.�ӿ�û�й������ͳ�ʼ����
*/

interface A
{ 
	int a = 5;//public static final int a = 5�� ����
	void f();//�����з�����
	static void stshow()
	{
		System.out.println("�ӿڵ��෽��");
	}
	default void deshow()
	{
		System.out.println("�ӿڵ�Ĭ�Ϸ���");
	}
}
interface B extends A //�ӿڼ̳нӿ�
{
}
abstract class C implements A,B //�ӿ�A���г��󷽷������CҪ�ǳ�����
{
}
class D extends C implements A,B
{
	//i = 4; //�ӿڵ�������ʵ�����в��ܸı�	
	//�ӿ��еķ���Ĭ��Ϊpublic,��˼̳����з���������public
	public void f() //ʵ�ֽӿڵĳ��󷽷���
	{ 
		System.out.println("��D�Խӿڵ�Ӧ��");
	}
}

public class TestInterface
{
	public static void main(String[] args)
	{
		A aa; //����
		//aa = new A(); //�ӿڽ��Ƴ����࣬����ʵ����
		A.stshow();

		D dd = new D();
		dd.deshow();
		dd.f();
	}
}