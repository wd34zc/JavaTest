/*
������� ֮ �̳�extends
	1.���಻�ܼ̳и��๹����
	2.��д��Override����д���෽��.
		���¶����븸����ͬ���ֵķ������Լ�����ֵ�Ͳ�������ͬ��
		�������Ӧ������privateȨ��ʱ����ʹ������������Ҳ���ܳ�Ϊ��д��
	3.super 
		�޶�����������Ӹ���̳еĵ��ı����ͷ�����
		�������÷���Ϊstaticʱ��������super��������Ϊ�÷��������ڶ���
		����ο�TestSuper�ļ�
	4.���η���Ȩ�����⣩
		�ο�"���η�Ȩ��"�ļ���
*/

class Human
{
	public String name = "����";
	public int age = 18;

	void f()
	{
	}
}

class Student extends Human
{
	public double score = 6.66;

	void f()
	{
	}
}

public class TestExtends
{
	public static void main(String[] args)
	{
		Student aa = new Student();
		System.out.printf("%s %d %.2f",aa.name,aa.age,aa.score);
	}
}