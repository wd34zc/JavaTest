/*
FileOutputStream
*/
import java.io.*;
public class TestFileOutputStream
{
	public static void main(String[] args)
	{
		FileInputStream in = null;
		FileOutputStream out = null;
		int b;
		try
		{
			in = new FileInputStream("e:/java/javatest/IO/TestFileOutputStream.java");
			out = new FileOutputStream("e:/java/javatest/IO/Testing.txt");
			while((b=in.read())!=-1)
			{
				out.write(b);
			}
			in.close();
			out.close();
		}
		catch (FileNotFoundException e1)
		{
			System.out.println("找不到指定文件.");
		}
		catch (IOException e2)
		{
			System.out.println("文件复制错误.");
		}
		System.out.println("文件已复制");
	}
}