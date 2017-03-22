/*
Java.util.collections
�ṩһЩ�������򣬲�ѯ���޸ĵķ�����
���ܣ�
	����������ң����򣬽������ƶ���
	�����÷����в���api��
ע�⣺
	����������Ҫ��д������򷽷���
	��д�����򷽷���Ҫ����Comparable�ӿڡ�
*/

import java.util.*;
class Name implements Comparable //���ýӿ�
{
	public String firstName;
	public Name(String firstName){
		this.firstName = firstName;
	}
	public String toString()
	{
		return firstName;
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof Name)
		{
			Name name = (Name)obj;
			return name.firstName == firstName;
		}
		return super.equals(obj);
	}
	public int hashCode()
	{
		return firstName.hashCode();
	}
	public int compareTo(Object o) //��д�����򷽷�
	{
		Name n = (Name)o;
		return firstName.compareTo(n.firstName); //����ϵͳ�ַ������򷽷�
	}
}

public class TestCollections
{
	public static void main(String[] args)
	{
		List s1 = new LinkedList();
		s1.add(new Name("f1"));
		s1.add(new Name("f2"));
		s1.add(new Name("f3"));
		s1.add(new Name("f4"));
		s1.add(new Name("f5"));

		Collections.shuffle(s1); //�������
		for(Object o :s1)
			System.out.printf("%s ",o);
		System.out.println();

		Collections.sort(s1);	//����
		for(Object o :s1)
			System.out.printf("%s ",o);
		System.out.println();
		
		Collections.reverse(s1);	//����
		for(Object o :s1)
			System.out.printf("%s ",o);
		System.out.println();
	}
}