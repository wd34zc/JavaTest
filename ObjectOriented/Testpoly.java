/*
������� ֮ ��̬
	���壺��ͬ���͵ı�������ͬһ����ʱ���ֳ���ͬ����Ϊ������
	����ʵ�ַ������������ֱ�Ӹ������ࡣ
	�����������������͵�����

*/
class A
{
	public void f()
	{
		System.out.println("AAAA");
	}
}
class B extends A
{
	public void f()
	{
		System.out.println("BBBB");
	}

	public void g()
	{
		System.out.println("��B��ר������");
	}
}

public class Testpoly
{
	public static void main(String[] args)
	{
	//�������
		A a1 = new A();
		a1.f();
		B b1 = new B();
		b1.f();
		b1.g();
		System.out.println();
		
	//�����������������Ͳ�ͬ��
		A ab = new B(); //����Ǳ������ͣ��ұ����������͡�
		ab.f();
		//����ʱ��ab�����������ͣ���A�࣬����ʱab����B�࣬
		//������ʱ���B��f()������

//		ab.g(); //����ʱA�ಢû��g()������
		System.out.println();		
		
	//��̬������ת��
		A a2 = new A();
		B b2 = new B();

//		b2 = a2; //���಻��ֱ��ת��Ϊ���ࡣ
		b2 = (B)a2; //��Ҫǿ������ת����
		b2.g();

		a2 = b2; //�������ֱ��ת��Ϊ���ࣨ��̬ʵ�ֻ�����
//		a2.g(); //���ǲ����ٵ�������ķ�����

	}
}