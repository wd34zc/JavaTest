/*
Main:
	����importһЩ�÷���
A:
	����import && import static ������
*/

package MAIN;
import bag3.*;
import bag3.next.*; //��ʹ���Ѱ����ļ������ļ��У�Ҳ��Ҫ���°�����

/*
һ�㽨��ֱ�Ӱ�����ָ���࣬�������ļ��С�
����
import bag3.A;
import bag3.C;
import bag3.next.B;
*/

public class Main
{
	public static void main(String[] args)
	{
		bag3.A a2 = new bag3.A(); //û��import�����뷽��
		a2.f();
		
		A a1 = new A(); //import���·������ʡ��
		a1.f();

		B b1 = new B();
		b1.f();

		C c1 = new C();
		c1.f();
	}
}