/*
���� <>
	
*/
import java.util.*;
public class TestGenericity
{
	public static void main(String[] args)
	{
		List<String> l = new ArrayList<String>();
		l.add("hello"); //�Զ����
		l.add("world");
//		l.add(5); //���ܴ����String���͵�ֵ
		System.out.println(l);

		Iterator<String> i = l.iterator();
		while(i.hasNext())
		{
			String str = i.next(); //����Ҫ��ǿ������ת��
			//String str = (String)i.next(); //û�з���֮ǰ����Ҫ����ǿ��ת�����͡�
			System.out.println(str);
		}

		List<Integer> l2 = new ArrayList<>(); //JAVA 7 ֮�����ʡ�Թ��캯�������ͣ������Ų���ʡ�ԡ�
		l2.add(2); 
		l2.add(-3);
		l2.add(9);
		System.out.println(l2);
	}
}