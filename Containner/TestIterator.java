/*
Iterator 接口
	用于遍历容器的每一个对象。
	每个容器类都有对应的iterator方法，并把遍历方法返回给Iterator接口
方法：
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

public class TestIterator
{
	public static void main(String[] args)
	{
		Collection a = new HashSet(); //创建一个A容器
		a.add(new Name("fff1","lll1"));
		a.add(new Name("fff2","lll2"));
		a.add(new Name("f3","l3"));
		a.add(new Name("fff4","lll4"));
		a.add(new Name("fff5","lll5"));
		Iterator i = a.iterator(); //定义一个接口来接收容器类a的 遍历方法。
		while(i.hasNext())
		{
			Name n = (Name)i.next(); //把i接口返回回来的元素转化为子类 以供 读取
			System.out.println(n);
			if((n.getfirst()).length()<3)
				i.remove();//**删除元素必须用Iterator自带的删除方法！
		}
		//遍历后，i指向容器尾
		
		i = a.iterator(); //需要重新赋值
		while(i.hasNext()) //第二次遍历发现"f3"被删除。
		{
			Name n = (Name)i.next(); //强行转换
			System.out.println(n);
		}
	}
}