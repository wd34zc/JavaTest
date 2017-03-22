/*
Set<interface>
�ص㣺
	���򲻿��ظ�
		����ָ�������˳�����
ע�⣺
	��ӽ�ȥ������ǿ�Ҳ����� �޸�����ֵ��
����ʵ���ࣺ
	HashSet��
		�ȼ���hashcodeֵ��Ȼ��λ���ڴ棬�ڵ���equals���бȽ�
		���ࣺLinkedHashSet
			��������ά��HashSet,ʹȷ���䰴���˳������
			�ή�Ͷ�д����
	TreeSet;
		ȷ�������������״̬��
			1.��Ȼ����
				����ʵ��comparable�ӿڣ�����compareTo�������бȽ�
			2.��������
				����ʵ��comparable�ӿڣ������compareTo�����Զ���Ƚ�
		ֻ�����ͬһ���ࡣ
	�Ƚϣ�
		HashSet���ܻ���Ժ�һЩ��ֻ����Ҫ����ſ���TreeSet.
ͨ�÷�����
	boolean	retainAll(Collection<?> c)
	int	size()
	boolean	addAll(Collection<? extends E> c)
*/
import java.util.*;
class Name
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
}

public class TestSet
{
	public static void main(String[] args)
	{
		Set s1 = new HashSet();
		s1.add(new Name("f1"));
		s1.add(new Name("f2"));
		s1.add(new Name("f3"));
		Set s2 = new HashSet();
		s2.add(new Name("f3"));
		s2.add(new Name("f4"));
		s2.add(new Name("f5"));
		
		Set s3 = new HashSet(s1);
		s3.addAll(s2);  //���s2���в��ظ���Ԫ��
		Set s4 = new HashSet(s1);
		s4.retainAll(s2); //�󽻼�

//		Name n1 = new Name("f1");
//		Name n2 = new Name("f1");
//		System.out.println(n1.hashCode());
//		System.out.println(n2.hashCode());
		

		for(Object obj :s3)
			System.out.printf("%s ",obj);
		System.out.println("\n===========");
		for(Object obj :s4)
			System.out.printf("%s ",obj);

		System.out.println("\n===========");
		Iterator i = s1.iterator(); 
		while(i.hasNext())
		{
			Name n = (Name)i.next() ;
			System.out.printf("%s ",n);
		}
	}
}