/*
���
�������������������Ϊ��Ա��
������̳�����
*/
class Animal
{
	public void breath()
	{
		System.out.println("��һ��������һ������������...");
	}
}
class Bird
{
	private Animal a = new Animal();
//	public Bird(Animal a)
//	{
//		this.a = a;
//	}
	public void fly()
	{
		System.out.println("�����ɣ�ү��ɣ�");
	}
	public void breath()
	{
		a.breath();
	}
}
public class TestComposite
{
	public static void main(String[] args)
	{
//		Animal a = new Animal();
		Bird b = new Bird();
		b.breath();
		b.fly();
	}
}