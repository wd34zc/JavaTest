/*
 protected �� public ������
*/

package MAIN;
import bag_4.*;

class B extends A
{
	void a()
	{
//		g();//���������η�Ϊprotected��protectedֻ���ڼ̳������ڲ�����
	}
	public void b()
	{
		f(); //���������η�Ϊpublic
		g(); //���������η�Ϊprotected��protectedֻ���ڼ̳������ڲ�����
//		h(); //���������η�λdefault�������ڰ���̳С�
		System.out.println("BBBB");
	}
}

class Main
{
	public static void main(String[] args)
	{
		B bb = new B();
		bb.b();

		bb.f();
//		bb.g(); //����protected�������ⲿͨ���̳�������ʡ�
	}
}