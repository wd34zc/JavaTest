/*
 toString
	Object���µ�һ��������
	����һ�����������������ַ�������Ĭ�Ϸ���"����@��ַ"����
	����ÿ������д����࣬ʹ��ʵ�ּ�ֵ��
*/

class Fruit
{
	private String kind;
	public Fruit(String kind)
	{
		this.kind = kind;
	}
	public String toString() //��д��Fruit���������
	{
		return "����һ��" + kind + "��";
	}
}
public class TesttoString
{
	public static void main(String[] args)
	{
		Fruit a = new Fruit("ƻ��");
		System.out.println(a);
	}
}