/*
Java.util.collections
提供一些用于排序，查询，修改的方法，
功能：
	逆序，随机打乱，排序，交换，移动。
	具体用法自行查阅api。
注意：
	调用排序需要重写类的排序方法！
	重写类排序方法需要调用Comparable接口。
*/

import java.util.*;
class Name implements Comparable //调用接口
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
	public int compareTo(Object o) //重写类排序方法
	{
		Name n = (Name)o;
		return firstName.compareTo(n.firstName); //调用系统字符串排序方法
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

		Collections.shuffle(s1); //随机排序
		for(Object o :s1)
			System.out.printf("%s ",o);
		System.out.println();

		Collections.sort(s1);	//升序
		for(Object o :s1)
			System.out.printf("%s ",o);
		System.out.println();
		
		Collections.reverse(s1);	//逆序
		for(Object o :s1)
			System.out.printf("%s ",o);
		System.out.println();
	}
}