/*
 *this ���õ�ǰ���е����Ի򷽷�
 ��;��
	��ԭ���������Ե�;����С��Χ��ͬ�������������ʱ������ͨ��this���Ե���ԭ�������ԡ�
 �÷���
	1.���βθ���ͬ�����ԣ���this����������
	2.��this����ǿ���ǵ�ǰ��ķ�������super���Ӧ.
	3.���ع�����ʱ��������this���� ��������ǰ���������� �Ĺ�����
 */
class A
{
	private int i;
	public A (int i)
	{
		this.i = i; //��this���ε��ǵ�ǰ����i����Ӧ�����β�i
	}
	public void show(int i)
	{
		System.out.println(i); //����β�i;
		System.out.println(this.i);//�������i;
		//С��Χ�β��ܹ����Ǵ�Χ��������
	}
}

public class TestThis
{
	public static void main(String[] args)
	{
		A aa1 = new A(10);
		aa1.show(2);
	}
}