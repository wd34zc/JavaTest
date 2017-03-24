/*
FileReader & FileWriter
	以字符为单位读取数据
*/
import java.io.*;
//下面代码实现了复制功能。
public class TestReaderAndWriter
{
	public static void main(String[] args)
	{
		FileReader in = null;
		FileWriter out = null;
		try
		{
			in = new FileReader ("e:/java/javatest/IO/TestReaderAndWriter.java");
			out = new FileWriter ("e:/java/javatest/IO/WriterTesting.txt");
			int b = 0;
			while((b = in.read()) != -1) //读取in中的流
			{
				System.out.printf("%c",b); //输出到屏幕
				out.write(b);	//输出到文件
			}
			//关闭文件
			in.close(); 
			out.close();
		}
		catch (FileNotFoundException e1)
		{
			System.out.println("找不到指定文件");
			System.exit(-1);
		}
		catch (IOException e2)
		{
			System.out.println("文件读写错误");
			System.exit(-1);
		}
	}
}