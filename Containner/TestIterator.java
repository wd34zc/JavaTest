/*
Iterator �ӿ�
	���ڱ���������ÿһ������
	ÿ�������඼�ж�Ӧ��iterator���������ѱ����������ظ�Iterator�ӿ�
������
	hasNext()
	next()
	remove()

*/

import java.util.*;
class Name
{
	private String firstname,lastname;
	public String getfirst()
	{
		return firstname;
	}
	public Name(String firstname,String lastname)
	{
		this.firstname = firstname;
		this.lastname = lastname;
	}
	//��дequals
	public boolean equals(Object obj)
	{
		if(obj instanceof Name)
		{
			Name name = (Name)obj;
			return (firstname.equals(name.firstname)
				&& lastname.equals(name.lastname));
		}
		else
			return super.equals(obj);
	}
	//��дhashcode
	public int hashcode()
	{
		return firstname.hashCode();
	}
	//��дtoString
	public String toString()
	{
		return firstname+" "+lastname;
	}
}

public class TestIterator
{
	public static void main(String[] args)
	{
		Collection a = new HashSet(); //����һ��A����
		a.add(new Name("fff1","lll1"));
		a.add(new Name("fff2","lll2"));
		a.add(new Name("f3","l3"));
		a.add(new Name("fff4","lll4"));
		a.add(new Name("fff5","lll5"));
		Iterator i = a.iterator(); //����һ���ӿ�������������a�� ����������
		while(i.hasNext())
		{
			Name n = (Name)i.next(); //��i�ӿڷ��ػ�����Ԫ��ת��Ϊ���� �Թ� ��ȡ
			System.out.println(n);
			if((n.getfirst()).length()<3)
				i.remove();//**ɾ��Ԫ�ر�����Iterator�Դ���ɾ��������
		}
		//������iָ������β
		
		i = a.iterator(); //��Ҫ���¸�ֵ
		while(i.hasNext()) //�ڶ��α�������"f3"��ɾ����
		{
			Name n = (Name)i.next(); //ǿ��ת��
			System.out.println(n);
		}
	}
}