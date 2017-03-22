/*
������
	<<interface>>Collection
		<<interface>>list:������ظ�
		<<interface>>set�������ظ�
	<<interface>>map��"��-ֵ"�洢
ע�⣺
	һ�����ظ����Ҫ����equals������
	��˱�����дÿһ�����equals() �� hashCode()����
*/
import java.util.*;
class Name
{
	private String firstname,lastname;
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

public class TestCollection
{
	public static void main(String[] args)
	{
		Collection c = new HashSet();
		c.add("hello");
		c.add(new Integer(100));
		c.add(new Name("zhang","joe"));
		c.add(new Name("lin","jack"));
//		c.remove("hello");
//		c.remove(new Integer(100));
		c.remove(new Name("jerry","mouse"));
		System.out.println(c);
	}
}