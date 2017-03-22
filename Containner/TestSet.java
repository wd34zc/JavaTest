/*
Set<interface>
特点：
	乱序不可重复
		乱序指不按添加顺序输出
注意：
	添加进去的内容强烈不建议 修改索引值！
常用实现类：
	HashSet：
		先计算hashcode值，然后定位到内存，在调用equals进行比较
		子类：LinkedHashSet
			用链表来维护HashSet,使确保其按添加顺序排序
			会降低读写性能
	TreeSet;
		确保链表处于排序的状态，
			1.自然排序：
				必须实现comparable接口，调用compareTo方法进行比较
			2.定制排序：
				不用实现comparable接口，会根据compareTo进行自定义比较
		只能添加同一种类。
	比较：
		HashSet性能会相对好一些，只有需要排序才考虑TreeSet.
通用方法：
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
		s3.addAll(s2);  //添加s2所有不重复的元素
		Set s4 = new HashSet(s1);
		s4.retainAll(s2); //求交集

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