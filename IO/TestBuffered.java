/*
BufferedReader and BufferWriter
	把字符输入到缓冲区，在进行文件读写。
*/
import java.io.*;
public class TestBuffered
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("e:/java/javatest/IO/TestBuffered.java"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("e:/java/javatest/IO/TestBuffered.txt"));
			String b = null;
			while((b=br.readLine()) != null) //按行来读取文件
			{
				bw.write(b);
				bw.newLine(); //写入一个回车符到文件
				System.out.println(b);
			}
			br.close();
			bw.close();
		}
		catch (FileNotFoundException e1)
		{
			System.out.println("找不到指定的文件");
			System.exit(-1);
		}
		catch (IOException e2)
		{
			System.out.println("文件读写错误");
			System.exit(-1);
		}
	}
}