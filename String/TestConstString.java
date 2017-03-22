/*
 2017年3月5日11:33:18
 字符串常量与变量
	常量与变量所存储的区不相等。
	且当指向同一个常量时，所指向的内存相等。
	但是两个内容相等的变量，地址不同。
*/

class TestConstString
{
	public static void main(String[] args)
	{
		String aa = new String("china"); //栈区变量指向堆区变量，两个变量不在同一个内存中
		String bb = new String("china");
		System.out.println(aa);
		System.out.println(bb);
		
		if(aa == bb) //所指内存是否相等
			System.out.println("aa == bb");
		else
			System.out.println("aa != bb");

		String cc = "china"; //常量是存在data区中，两个栈区都指向了同一个data区内存
		String dd = "china";
		if(cc == dd)
			System.out.println("cc == dd");
		else
			System.out.println("cc != dd");
	}
}