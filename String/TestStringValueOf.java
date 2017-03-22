/*
 String.valueOf() 函数
	把各种类型的变量转化为字符串形式
*/

/**
	api文档内容：
	static String	valueOf(boolean b)
		Returns the string representation of the boolean argument.
	static String	valueOf(char c)
		Returns the string representation of the char argument.
	static String	valueOf(char[] data)
		Returns the string representation of the char array argument.
	static String	valueOf(char[] data, int offset, int count)
		Returns the string representation of a specific subarray of the char array argument.
	static String	valueOf(double d)
		Returns the string representation of the double argument.
	static String	valueOf(float f)
		Returns the string representation of the float argument.
	static String	valueOf(int i)
		Returns the string representation of the int argument.
	static String	valueOf(long l)
		Returns the string representation of the long argument.
	static String	valueOf(Object obj)
		Returns the string representation of the Object argument.
*/

class TestStringValueOf
{
	public static void main(String[] args)
	{
		String str = new String();
		int i = 123;
		//str = i; //类型不匹配
		str = String.valueOf(i); //把i的值转换为字符串类型再赋给str。
		System.out.println(str);
	}
}