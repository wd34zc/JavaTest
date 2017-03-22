/*
Map
	Key-Value索引
	注意：
		Key不可以重复，Value可以重复。。
		添加对象必须实现hashcode()和equals()方法。
	子类：
		HashMap
		TreeMap
方法：
	Object put(Object key,Object value);
	Object get(Object key);
	Object remove(Object key);
	boolean containsKEY(Object Key);
	boolean containsvalue(Object value);
	int size();
	boolean isEmpty();
	void putALL(Map t);
	void clear();
*/
import java.util.*;
public class TestMap
{
	public static void main(String[] args)
	{
		Map m = new HashMap();
		m.put(1,"one");
		m.put(2,"two");
		m.put(3,"three");
		Map n = new HashMap();
		n.put("a","apple");
		n.put("b","boy");
		n.putAll(m);
		System.out.println(n);
		System.out.println(m.containsKey("a"));
		System.out.println(m.containsKey(2));
		System.out.println(m.size());
	}
}