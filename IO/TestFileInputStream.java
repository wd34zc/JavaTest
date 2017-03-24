/*
FileInputStream
	已字节为单位的输入流；
	需要捕捉IOException异常;
	结尾参数是-1；
	
*/
import java.io.*;
public class TestFileInputStream
{
	public static void main(String[] args)
	{
		FileInputStream in = null;
		try
		{
			in = new FileInputStream("e:/java/javatest/IO/testing.txt");
		}
		catch (FileNotFoundException e1)
		{
			System.out.println("找不到指定文件！");
			System.exit(-1);
		}

		int b=0;
		long num = 0;
		try
		{
			System.out.println(in.available()); //获取文件字节数量
			while((b=in.read())!= -1)
			{
				System.out.printf("%c",b);
				num++;
			}
			in.close();
			System.out.println();
			System.out.println("文件共读取了" + num + "个字节。");
		}
		catch (IOException e2)
		{
			System.out.println("文件读取错误");
			System.exit(-1);
		}
	}
}