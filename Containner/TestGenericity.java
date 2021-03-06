/*
泛型 <>
	把运行时的异常提前到编译时识别	
*/
import java.util.*;
class Apple<T> //自定义带泛型的类
{
	private T info;
	public Apple(){}
	public Apple(T info)
	{
		this.info = info;
	}
	public void setInfo(T info)
	{
		this.info = info;
	}
	public T getInfo()
	{
		return info;
	}
}
public class TestGenericity
{
	public static void main(String[] args)
	{
		List<String> l = new ArrayList<String>();
		l.add("hello"); //自动打包
		l.add("world");
		//l.add(5); //不能传入除String类型的值
		System.out.println(l);

		Iterator<String> i = l.iterator();
		while(i.hasNext())
		{
			String str = i.next(); //不需要再强制类型转换
			//String str = (String)i.next(); //没有泛型之前，需要进行强型转换类型。
			System.out.println(str);
		}

		List<Integer> l2 = new ArrayList<>(); //JAVA 7 之后可以省略构造函数的类型，尖括号不能省略。
		l2.add(2); 
		l2.add(-3);
		l2.add(9);
		System.out.println(l2);

		Apple<String> a = new Apple<>("苹果");
			System.out.println(a.getInfo());
		Apple<Integer> b = new Apple<>(5);
			System.out.println(b.getInfo());
	}
}