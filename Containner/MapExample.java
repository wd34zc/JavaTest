/*����Map��С����*/
import java.util.*;

//public class Example_1
//{
//	private static final Integer one = new Integer(1);
//	public static void main(String args[])
//	{
//		Map m = new HashMap();
//		for(int i=0;i<args.length;i++)
//		{
//			Integer a = (Integer)m.get(args[i]);
//			m.put(args[i],a==null?one:new Integer(a.intValue())+1);
//		}
//		System.out.println(m);
//	}
//}

//�Զ�������
public class MapExample
{
	public static void main(String args[])
	{
		Map m = new HashMap();
		for(int i=0;i<args.length;i++)
		{
			Integer a = (Integer)m.get(args[i]);
			m.put(args[i],a==null?1:a+1);
		}
		System.out.println(m);
	}
}