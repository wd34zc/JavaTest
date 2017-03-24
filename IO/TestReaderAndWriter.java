/*
FileReader & FileWriter
	���ַ�Ϊ��λ��ȡ����
*/
import java.io.*;
//�������ʵ���˸��ƹ��ܡ�
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
			while((b = in.read()) != -1) //��ȡin�е���
			{
				System.out.printf("%c",b); //�������Ļ
				out.write(b);	//������ļ�
			}
			//�ر��ļ�
			in.close(); 
			out.close();
		}
		catch (FileNotFoundException e1)
		{
			System.out.println("�Ҳ���ָ���ļ�");
			System.exit(-1);
		}
		catch (IOException e2)
		{
			System.out.println("�ļ���д����");
			System.exit(-1);
		}
	}
}