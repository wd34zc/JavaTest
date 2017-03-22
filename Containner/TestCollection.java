/*
容器：
	<<interface>>Collection
		<<interface>>list:有序可重复
		<<interface>>set：乱序不重复
	<<interface>>map："键-值"存储
注意：
	一般检测重复与否要调用equals方法，
	因此必须重写每一个类的equals() 和 hashCode()方法
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
	//重写equals
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
	//重写hashcode
	public int hashcode()
	{
		return firstname.hashCode();
	}
	//重写toString
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