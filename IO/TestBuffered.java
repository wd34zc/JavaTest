/*
BufferedReader and BufferWriter
	���ַ����뵽���������ڽ����ļ���д��
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
			while((b=br.readLine()) != null)
			{
				bw.write(b);
				bw.newLine();
				System.out.println(b);
			}
			br.close();
			bw.close();
		}
		catch (FileNotFoundException e1)
		{
			System.out.println("�Ҳ���ָ�����ļ�");
			System.exit(-1);
		}
		catch (IOException e2)
		{
			System.out.println("�ļ���д����");
			System.exit(-1);
		}
	}
}