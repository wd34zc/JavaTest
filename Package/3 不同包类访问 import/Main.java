/*
Main:
	关于import一些用法。
A:
	关于import && import static 的区别。
*/

package MAIN;
import bag3.*;
import bag3.next.*; //即使是已包含文件的子文件夹，也需要重新包含。

/*
一般建议直接包涵到指定类，而不是文件夹。
例如
import bag3.A;
import bag3.C;
import bag3.next.B;
*/

public class Main
{
	public static void main(String[] args)
	{
		bag3.A a2 = new bag3.A(); //没有import的输入方法
		a2.f();
		
		A a1 = new A(); //import相关路径类后可省略
		a1.f();

		B b1 = new B();
		b1.f();

		C c1 = new C();
		c1.f();
	}
}