/*
 abstract ������ ���󷽷�
 
 �﷨�������ࣺ���壺�������ֻ�ǳ���Ķ�����û�о���Ķ���
			   1.��������ѹջ������������ѵ��ڴ棬�����Զ��壬���ܳ�ʼ��
			   2.��һ������ ���󷽷� 
			   3.���Ա���ͨ��̳�
	   ���η��������壺�÷���ֻ��������ͷ��û�о���ʵ�ֵĴ���
				 1.�÷���������������ǳ�����
				 2.û�з����壨������룩�ı���Ϊ���󷽷�
				 3.���Ա��̳е���ͨ����д
*/

//class A //���󣬴��ڳ��󷽷�
abstract class A
{
	int i;

	abstract void f();
	{
	}
}

class B extends A//֤�� �������3��
{
	public void f()//֤�� ���η��� ��3��
	{
		System.out.println("BBBB");
	}
}

public class TestAbstract
{
	public static void main(String[] args)
	{
		A aa;
		//aa = new A(); //����//֤�� ������ĵ�һ��
		
		B bb; 
		bb = new B();
		bb.f();
	}
}