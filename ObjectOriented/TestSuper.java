/*
super 
	�޶�����������Ӹ���̳еĵ��ı����ͷ���
	super���Ե������Ժͷ�����
	��;��
		�����ø�������Ի򷽷��������ͬ�����Ի򷽷�����ʱ��������super���Եĵ��ø����Ӧ�ķ��������ԡ�
	ע�⣺
		1.����Ĺ�������������super��������һ��Ĭ�ϵ��ø���ĵ��޲ι�������
		2.������û���޲ι���������ôС������Ĺ�������Ĭ�ϵ��ø����޲ι����������������
		3.�������÷���Ϊstaticʱ�����ܵ���super��������Ϊ�÷��������ڶ���

*/
//����
class Human
{
	private String name; //�����ڲ�����
	private int age;
	public Human() //������޲ι�����
	{
		name = "����";
		age = 22;
	}
	public Human(String name,int age) //������вι�����
	{
		this.name = name;
		this.age = age;
	}
	public String list()
	{
		String str = name + " " + age;
		return str;
	}
	public void show()
	{
		System.out.println(list());
	}
}
//����
class Student extends Human
{
	private char grade = 'A';
	public Student()
	{
		//������ʾ���ã�������Ĭ���ڵ�һ�е���super();
	}
	public Student(String name,int age,char grade)
	{
		super(name,age); //��ʾ���ø����вι�����
		this.grade = grade;
	}
	public String list()
	{
		String str = super.list() + " "+ grade; //���ø��෽��
		return str;
	}
	//public void show() �͸���һ�������Բ�������д
}

class TestSuper
{
	public static void main(String[] args)
	{
		Human aa = new Human();
		aa.show();
		
		Student bb = new Student("����",18,'A');
		bb.show();
	}
}